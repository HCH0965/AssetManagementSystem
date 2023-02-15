package hch.data.mapper;

import hch.data.model.entity.Scrap;

public interface ScrapMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Scrap record);

    int insertSelective(Scrap record);

    Scrap selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Scrap record);

    int updateByPrimaryKey(Scrap record);
}