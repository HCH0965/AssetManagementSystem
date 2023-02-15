package hch.data.mapper;

import hch.data.model.entity.Use;

public interface UseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Use record);

    int insertSelective(Use record);

    Use selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Use record);

    int updateByPrimaryKey(Use record);
}