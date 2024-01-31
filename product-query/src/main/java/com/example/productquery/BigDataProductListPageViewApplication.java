package com.example.productquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BigDataProductListPageViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigDataProductListPageViewApplication.class, args);
	}

}
