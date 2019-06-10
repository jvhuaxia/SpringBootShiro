package com.example.demo62;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo62.mapper")
public class Demo62Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo62Application.class, args);
    }

}
