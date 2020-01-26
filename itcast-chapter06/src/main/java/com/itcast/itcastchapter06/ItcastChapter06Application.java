package com.itcast.itcastchapter06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ItcastChapter06Application {

    public static void main(String[] args) {
        SpringApplication.run(ItcastChapter06Application.class, args);
    }

}
