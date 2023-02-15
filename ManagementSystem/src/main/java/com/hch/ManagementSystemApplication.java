package com.hch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hch.mapper")
public class ManagementSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(ManagementSystemApplication.class, args);

    }
}
