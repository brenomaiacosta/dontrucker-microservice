package com.dontrucker.itemoffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DtItemofferServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtItemofferServiceApplication.class, args);
	}

}