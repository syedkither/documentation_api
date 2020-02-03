package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableDiscoveryClient
@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class DocumentationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentationApiApplication.class, args);
	}

}
