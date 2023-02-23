package com.hch.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.R;
import com.hch.common.enums.MyEnum;
import com.hch.mapper.PurchaseApplyMapper;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.dto.ApproveDTO;
import com.hch.model.entity.Asset;
import com.hch.model.entity.PurchaseApply;
import com.hch.model.entity.User;
import com.hch.service.AssetService;
import com.hch.service.PurchaseApplyService;
import com.hch.service.SystemService;
import com.hch.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;

@Service
@Transactional(rollbackFor = Exception.class)
public class PurchaseApplyServiceImpl extends ServiceImpl<PurchaseApplyMapper, PurchaseApply> implements PurchaseApplyService {
    @Autowired
    private PurchaseApplyService purchaseApplyService;

    @Autowired
    private AssetService assetService;

    @Autowired
    private SystemService systemService;

    @Autowired
    private UserService userService;

    /**
     * 购买申请
     *
     * @param applyDTO 资产信息
     * @return 返回结果
     */
    @Override
    public R<?> purchaseApply(ApplyDTO applyDTO) throws ParseException {
        if (applyDTO != null) {
            PurchaseApply purchaseApply = new PurchaseApply();
            BeanUtils.copyProperties(applyDTO, purchaseApply);
            //设置申请时间
            purchaseApply.setApplyTime(systemService.nowTime());
            //将数据写入purchase表
            purchaseApplyService.save(purchaseApply);
            //判断资产是否已经存在
            Asset assetCheck = assetService.lambdaQuery()
                    .eq(Asset::getAssetName, applyDTO.getAssetName())
                    .one();
            //资产已存在，更新asset表
            if (assetCheck != null) {
                //计算数量
                int newNumber = applyDTO.getNumber() + assetCheck.getNumber();
                //计算总价
                String newTotalPrice = assetCheck.getTotalprice() + applyDTO.getTotalprice();
                //更新表
                LambdaUpdateWrapper<Asset> assetUpdate = new LambdaUpdateWrapper<>();
                assetUpdate
                        .eq(Asset::getNumber, newNumber)
                        .eq(Asset::getTotalprice, newTotalPrice);
                assetService.update(assetUpdate);
            }
            //资产不存在，将数据写入asset表
            Asset newAsset = new Asset();
            BeanUtils.copyProperties(purchaseApply, newAsset);
            assetService.save(newAsset);
            return R.Success();
        }
        return R.Failed();
    }

    /**
     * 购买审核
     *
     * @param approveDTO 审核信息
     * @return 返回结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public R<?> purchaseApprove(ApproveDTO approveDTO) throws ParseException {
        if (approveDTO != null) {
            //验证审核权限
            User user = systemService.getApproveUser(approveDTO.getUserId());
            //验证资产状态
            PurchaseApply purchaseApply = purchaseApplyService.lambdaQuery()
                    .eq(PurchaseApply::getAssetId, approveDTO.getAssetId())
                    .eq(PurchaseApply::getStatus, MyEnum.APPLY_STATUS_ING)  //已申请状态
                    .one();
            if ((user != null) && (purchaseApply != null)) {
                //设置审核时间
                purchaseApply.setApproveTime(systemService.nowTime());
                if (approveDTO.getIsApprove() == MyEnum.APPROVE_PASS_YES.getCode()) {
                    //审核通过，申请状态改为已通过
                    purchaseApply.setStatus(MyEnum.APPLY_STATUS_PASS.getCode());
                    purchaseApplyService.updateById(purchaseApply);
                    return R.Success();
                }
                if (approveDTO.getIsApprove() == MyEnum.APPROVE_PASS_NO.getCode()) {
                    //审核不通过，申请状态改为未通过审核
                    purchaseApply.setStatus(MyEnum.APPLY_STATUS_NOTPASS.getCode());
                    purchaseApplyService.updateById(purchaseApply);
                    return R.Success();
                }
            }
        }
        return R.Failed();
    }
}
