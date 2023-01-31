package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.mapper.UseMapper;
import com.hch.model.entity.Use;
import com.hch.service.UseService;
import org.springframework.stereotype.Service;

@Service
public class UseServiceImpl extends ServiceImpl<UseMapper, Use> implements UseService {
}
