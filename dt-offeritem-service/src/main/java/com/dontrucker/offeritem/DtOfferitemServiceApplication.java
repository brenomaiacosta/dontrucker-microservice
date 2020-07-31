package com.dontrucker.offeritem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DtOfferitemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtOfferitemServiceApplication.class, args);
	}

}
