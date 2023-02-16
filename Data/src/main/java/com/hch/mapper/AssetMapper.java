package com.hch.mapper;

import com.hch.model.entity.Asset;

public interface AssetMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Asset record);

    int insertSelective(Asset record);

    Asset selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Asset record);

    int updateByPrimaryKey(Asset record);
}