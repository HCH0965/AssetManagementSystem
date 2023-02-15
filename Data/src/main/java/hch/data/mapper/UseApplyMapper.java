package hch.data.mapper;

import hch.data.model.entity.UseApply;

public interface UseApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UseApply record);

    int insertSelective(UseApply record);

    UseApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UseApply record);

    int updateByPrimaryKey(UseApply record);
}