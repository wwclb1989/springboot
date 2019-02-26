package org.tingsinghua.springboot.chapter12activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
public class Chapter12ActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter12ActivemqApplication.class, args);
	}

	@Bean
	Queue queue() {
		return new ActiveMQQueue("amq");
	}

}

