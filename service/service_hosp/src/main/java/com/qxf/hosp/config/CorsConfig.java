package com.qxf.hosp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Collections;

/**
 * 跨域配置
 *
 * @author moss
 */
@Configuration
public class CorsConfig {

    public CorsConfig() {
    }

    @Bean
    public CorsFilter corsFilter() {
        //  1、添加cors配置信息
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //  设置前端的域名
        corsConfiguration.setAllowedOrigins(Collections.singletonList("*"));
        //  设置是否发送cookie信息
        corsConfiguration.setAllowCredentials(true);
        //  设置允许的请求方式
        corsConfiguration.setAllowedMethods(Collections.singletonList("*"));
        //  设置允许的header
        corsConfiguration.setAllowedHeaders(Collections.singletonList("*"));

        //  2、为url添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", corsConfiguration);

        //  3、返回重新定义好的corsSource
        return new CorsFilter(corsSource);

    }
}

