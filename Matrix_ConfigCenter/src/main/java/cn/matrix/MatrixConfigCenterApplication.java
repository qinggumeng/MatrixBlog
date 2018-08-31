package cn.matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableConfigServer
public class MatrixConfigCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatrixConfigCenterApplication.class, args);
	}
}
