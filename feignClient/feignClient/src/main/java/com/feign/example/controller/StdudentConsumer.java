package com.feign.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.example.feignclient.StudentFeignClient;

@RestController
public class StdudentConsumer {

	@Autowired
	private StudentFeignClient  client;
	
	@GetMapping("/consumer")
	public String showData() {
		
		System.out.println(client.getClass().getName());
		
		
		return "CONSUMER=>"+client.show();
	}
}
