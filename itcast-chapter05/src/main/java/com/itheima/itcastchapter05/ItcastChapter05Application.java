package com.itheima.itcastchapter05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan       // 开启基于注解方式的Servlet组件扫描支持
public class ItcastChapter05Application extends SpringBootServletInitializer {

    // 程序主类继承SpringBootServletInitializer，并重写configure()方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ItcastChapter05Application.class);
    }

        public static void main(String[] args) {
        SpringApplication.run(ItcastChapter05Application.class, args);
    }

}
