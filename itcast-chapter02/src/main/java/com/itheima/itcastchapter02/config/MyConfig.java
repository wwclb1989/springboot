package com.itheima.itcastchapter02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 定义该类是一个配置类
public class MyConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
