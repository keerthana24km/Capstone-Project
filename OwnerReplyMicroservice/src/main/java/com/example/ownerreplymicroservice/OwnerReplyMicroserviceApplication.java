package com.example.ownerreplymicroservice;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OwnerReplyMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnerReplyMicroserviceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
