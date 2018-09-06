package com.matrix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * SpringBoot程序入口类
 * @author JasonFu
 * @createTime 2018年9月6日 下午1:59:01
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value="com.matrix.dao")
public class MatrixFrontContentApplication {
	/**
	 * SpringBoot程序入口
	 * @author JasonFu
	 * @createTime 2018年9月6日 下午1:59:25
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MatrixFrontContentApplication.class, args);
	}
}
