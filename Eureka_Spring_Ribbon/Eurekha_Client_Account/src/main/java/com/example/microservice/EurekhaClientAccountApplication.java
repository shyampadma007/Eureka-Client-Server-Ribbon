package com.example.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekhaClientAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaClientAccountApplication.class, args);
	}

}
