package com.hch;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan("com.hch.mapper")
public class ManagementSystemApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(ManagementSystemApplication.class, args);

//    //自动生成mapper
//        //MBG 执行过程中的警告信息
//        List<String> warnings = new ArrayList<>();
//
//        //读取配置文件
//        InputStream is = ManagementSystemApplication.class.getResourceAsStream("/mapperGenerator/generator-config.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(is);
//        is.close();
//
//        //当生成的代码重复时，覆盖原代码
//        DefaultShellCallback callback = new DefaultShellCallback(Boolean.TRUE);
//
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        //执行生成代码
//        myBatisGenerator.generate(null);
//        //输出警告信息
//        for (String warning : warnings) {
//            System.out.println(warning);
//        }
    }
}
