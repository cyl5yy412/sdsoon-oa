package com.sdsoon.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created By Chr on 2019/8/13.
 */

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //                registry.addMapping("/**");
        registry.addMapping("/**")
                .allowedOrigins("*")
//                .allowedHeaders("Content-Type, x-requested-with, X-Custom-Header, Authorization","token")
                .allowedHeaders("*")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }

    // 支持跨域访问
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").maxAge(3600).allowedHeaders("Content-Type, x-requested-with, X-Custom-Header, Authorization");
//    }

    // 支持PUT请求
//    @Bean
//    public HttpPutFormContentFilter httpPutFormContentFilter() {
//        return new HttpPutFormContentFilter();
//    }

}
