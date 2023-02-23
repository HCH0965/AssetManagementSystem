package com.hch.mapper;

import com.hch.model.entity.UseApply;

public interface UseApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseApply record);

    int insertSelective(UseApply record);

    UseApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseApply record);

    int updateByPrimaryKey(UseApply record);
}