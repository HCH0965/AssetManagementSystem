package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.mapper.ScrapMapper;
import com.hch.model.entity.Scrap;
import com.hch.service.ScrapService;
import org.springframework.stereotype.Service;

@Service
public class ScrapServiceImpl extends ServiceImpl<ScrapMapper, Scrap> implements ScrapService {
}
