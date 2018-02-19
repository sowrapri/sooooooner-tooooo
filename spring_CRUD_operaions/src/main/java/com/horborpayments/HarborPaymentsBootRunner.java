package com.horborpayments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = { "com.stationary.entities" })
@SpringBootApplication(scanBasePackages = { "com.stationary.controller", "com.stationary.service",
		"com.stationary.entities" })
@EnableJpaRepositories(basePackages = { "com.stationary.repository" })
@EnableAutoConfiguration
public class HarborPaymentsBootRunner {

	public static void main(String[] args) {
		SpringApplication.run(HarborPaymentsBootRunner.class, args);
	}
}
