package org.tingsinghua.springboot.chapter09redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Chapter09RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter09RedisApplication.class, args);
	}

}

