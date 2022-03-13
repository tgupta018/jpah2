package com.demo.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class SampleJpaWithOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleJpaWithOracleApplication.class, args);
	}

}
