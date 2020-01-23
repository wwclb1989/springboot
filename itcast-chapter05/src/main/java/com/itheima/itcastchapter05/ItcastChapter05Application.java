package com.itheima.itcastchapter05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan       // 开启基于注解方式的Servlet组件扫描支持
public class ItcastChapter05Application {

    public static void main(String[] args) {
        SpringApplication.run(ItcastChapter05Application.class, args);
    }

}
