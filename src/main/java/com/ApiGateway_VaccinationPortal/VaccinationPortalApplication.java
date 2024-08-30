package com.ApiGateway_VaccinationPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class VaccinationPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationPortalApplication.class, args);
	}

}
