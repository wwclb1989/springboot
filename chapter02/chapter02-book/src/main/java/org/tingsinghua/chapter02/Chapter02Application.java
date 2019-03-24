package org.tingsinghua.chapter02;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Chapter02Application {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Chapter02Application.class);
		builder.bannerMode(Banner.Mode.OFF).run(args);
//		SpringApplication.run(Chapter02Application.class, args);
//		builder.application().setAdditionalProfiles("prod");
//		builder.run(args);
	}

}

