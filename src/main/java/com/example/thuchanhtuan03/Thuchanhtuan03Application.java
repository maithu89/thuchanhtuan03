package com.example.thuchanhtuan03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Thuchanhtuan03Application {

	public static void main(String[] args) {
		SpringApplication.run(Thuchanhtuan03Application.class, args);
	}

}
