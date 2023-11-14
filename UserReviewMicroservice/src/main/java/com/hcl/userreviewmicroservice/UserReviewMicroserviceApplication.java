package com.hcl.userreviewmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserReviewMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserReviewMicroserviceApplication.class, args);
	}

}
