package com.spring.advertise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class OlxAppAdvertiseeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxAppAdvertiseeeApplication.class, args);
	}

}
