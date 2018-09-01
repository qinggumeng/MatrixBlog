package com.matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MatrixFrontContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatrixFrontContentApplication.class, args);
	}
}
