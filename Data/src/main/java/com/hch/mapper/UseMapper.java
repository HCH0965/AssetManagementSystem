package com.hch.mapper;

import com.hch.model.entity.Use;

public interface UseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Use record);

    int insertSelective(Use record);

    Use selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Use record);

    int updateByPrimaryKey(Use record);
}