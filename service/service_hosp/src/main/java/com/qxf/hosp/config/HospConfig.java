package com.qxf.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.qxf.hosp.mapper")
public class HospConfig {
}
