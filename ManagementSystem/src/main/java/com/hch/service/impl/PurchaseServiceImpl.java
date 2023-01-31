package com.hch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hch.mapper.PurchaseMapper;
import com.hch.model.entity.Purchase;
import com.hch.service.PurchaseService;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase> implements PurchaseService {
}
