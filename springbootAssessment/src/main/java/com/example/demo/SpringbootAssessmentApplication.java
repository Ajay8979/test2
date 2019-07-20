package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.example.service","com.example.controller"})
@EnableJpaRepositories(basePackages="com.example.repo")
@EntityScan(basePackages="com.example.entity")
public class SpringbootAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAssessmentApplication.class, args);
	}

}
