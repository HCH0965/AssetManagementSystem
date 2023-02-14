package com.hch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hch.common.R;
import com.hch.model.dto.ApplyDTO;
import com.hch.model.entity.Scrap;

public interface ScrapService extends IService<Scrap> {
    /**
     * 资产报废申请
     * @param applyDTO 报废参数
     * @return 返回结果
     */
    R<?> scrap(ApplyDTO applyDTO);
}
