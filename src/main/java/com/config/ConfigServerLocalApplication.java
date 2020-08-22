package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerLocalApplication.class, args);
		
        System.out.println("hello dev-ankit-dev");
        System.out.println("hello dev-ashutosh tiwari-dev");
        System.out.println("hello");
	
		
	
	}

}
