package com.hch.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hch.model.entity.Asset;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssetMapper extends BaseMapper<Asset> {}