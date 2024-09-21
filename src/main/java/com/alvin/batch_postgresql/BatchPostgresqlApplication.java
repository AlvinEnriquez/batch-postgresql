package com.alvin.batch_postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.alvin.batch_postgresql.student")
public class BatchPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchPostgresqlApplication.class, args);
	}

}
