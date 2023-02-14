package com.hch.service.impl;

import com.hch.service.SystemService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class SystemServiceImpl implements SystemService {
    /**
     * 获取当前时间
     * @return 当前时间
     */
    @Override
    public String nowTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
}
