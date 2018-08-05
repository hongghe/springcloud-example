package com.hongghe.netfixdemo;

import com.hongghe.netfixdemo.adapter.interceptor.HelloInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器
 *
 * @author hongghe 04/08/2018
 */
@Configuration
public class NetfixDemoWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HelloInterceptor());
    }
}
