package com.myown.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudSrsApplication {

	public static void main(String[] args) {
		System.out.println("In main class..");
		SpringApplication.run(CloudSrsApplication.class, args);
	}

}
