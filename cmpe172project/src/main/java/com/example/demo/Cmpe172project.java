package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.demo")
public class Cmpe172project {

	public static void main(String[] args) {
		SpringApplication.run(Cmpe172project.class, args);
	}

}
