package com.hch.mapper;

import com.hch.model.entity.Scrap;

public interface ScrapMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Scrap record);

    int insertSelective(Scrap record);

    Scrap selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Scrap record);

    int updateByPrimaryKey(Scrap record);
}