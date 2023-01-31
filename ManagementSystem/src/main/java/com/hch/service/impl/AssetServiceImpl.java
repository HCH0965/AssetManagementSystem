package com.hch.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.mapper.AssetMapper;
import com.hch.model.entity.Asset;
import com.hch.service.AssetService;
import org.springframework.stereotype.Service;

@Service
public class AssetServiceImpl extends ServiceImpl<AssetMapper, Asset> implements AssetService {
}
