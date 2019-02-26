package org.tingsinghua.springboot.chapter09ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Chapter09EhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter09EhcacheApplication.class, args);
	}

}

