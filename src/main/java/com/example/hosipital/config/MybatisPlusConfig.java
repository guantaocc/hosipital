package com.example.hosipital.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.hosipital.domain.mapper")
public class MybatisPlusConfig {
}