package com.dontrucker.offer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DtOfferServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtOfferServiceApplication.class, args);
	}

}
