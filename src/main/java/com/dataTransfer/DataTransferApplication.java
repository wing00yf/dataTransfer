package com.dataTransfer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.dataTransfer.dao"})
@SpringBootApplication(scanBasePackages = {"com.dataTransfer"})
public class DataTransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataTransferApplication.class, args);
	}

}
