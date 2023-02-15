package hch.data.mapper;

import hch.data.model.entity.PurchaseApply;

public interface PurchaseApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PurchaseApply record);

    int insertSelective(PurchaseApply record);

    PurchaseApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PurchaseApply record);

    int updateByPrimaryKey(PurchaseApply record);
}