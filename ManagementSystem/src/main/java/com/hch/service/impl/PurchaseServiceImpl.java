package com.hch.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.common.R;
import com.hch.mapper.PurchaseMapper;
import com.hch.model.dto.PurchaseDTO;
import com.hch.model.entity.Asset;
import com.hch.model.entity.Purchase;
import com.hch.service.AssetService;
import com.hch.service.PurchaseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase> implements PurchaseService {
    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private AssetService assetService;

    /**
     * 购买申请
     * @param purchaseDTO 资产信息
     * @return 返回结果
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public R<?> purchase(PurchaseDTO purchaseDTO) {
        if (purchaseDTO != null) {
            Purchase purchase = new Purchase();
            BeanUtils.copyProperties(purchase, purchaseDTO);
            //计算总价
            String DTOtotalPrice = String.valueOf(Integer.parseInt(purchaseDTO.getPrice()) * purchaseDTO.getNumber());
            purchase.setTotalprice(DTOtotalPrice);
            //将数据写入purchase表
            purchaseService.save(purchase);
            //判断资产是否已经存在
            Asset assetCheck = assetService.lambdaQuery()
                    .eq(Asset::getAssetName, purchaseDTO.getAssetName())
                    .one();
            //资产已存在，更新asset表
            if (assetCheck != null) {
                //计算数量
                int newNumber = purchaseDTO.getNumber() + assetCheck.getNumber();
                //计算总价
                String newTotalPrice = assetCheck.getTotalprice() + DTOtotalPrice;
                //更新表
                LambdaUpdateWrapper<Asset> assetUpdate = new LambdaUpdateWrapper<>();
                assetUpdate
                        .eq(Asset::getNumber, newNumber)
                        .eq(Asset::getTotalprice, newTotalPrice);
                assetService.update(assetUpdate);
            }
            //资产不存在，将数据写入asset表
            Asset newAsset = new Asset();
            BeanUtils.copyProperties(newAsset, purchase);
            assetService.save(newAsset);
            return R.Success();
        }
        return R.Failed();
    }
}
