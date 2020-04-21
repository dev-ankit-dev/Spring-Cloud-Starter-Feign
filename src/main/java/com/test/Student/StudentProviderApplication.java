package com.test.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentProviderApplication.class, args);
		
		System.out.println("https://github.com/dev-ankit-dev/Spring-Cloud-Starter-Feign.git");
		
		
	}

}
