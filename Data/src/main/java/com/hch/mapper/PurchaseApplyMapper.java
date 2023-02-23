package com.hch.mapper;

import com.hch.model.entity.PurchaseApply;

public interface PurchaseApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseApply record);

    int insertSelective(PurchaseApply record);

    PurchaseApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PurchaseApply record);

    int updateByPrimaryKey(PurchaseApply record);
}