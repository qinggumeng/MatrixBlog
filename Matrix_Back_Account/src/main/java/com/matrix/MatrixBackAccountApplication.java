package com.matrix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value="com.matrix.dao")
public class MatrixBackAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatrixBackAccountApplication.class, args);
	}
}
