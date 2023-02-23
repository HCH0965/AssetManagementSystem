package com.hch.mapper;

import com.hch.model.entity.ScrapApply;

public interface ScrapApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScrapApply record);

    int insertSelective(ScrapApply record);

    ScrapApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScrapApply record);

    int updateByPrimaryKey(ScrapApply record);
}