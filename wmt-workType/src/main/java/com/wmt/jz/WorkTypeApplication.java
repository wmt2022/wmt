package com.wmt.jz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wmt.jz.mapper")
@EnableFeignClients
public class WorkTypeApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkTypeApplication.class);
    }
}
