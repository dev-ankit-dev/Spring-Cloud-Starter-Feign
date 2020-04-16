package com.feign.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("STUDENT-PROVIDER")
public interface StudentFeignClient {

	@GetMapping("/provider/show")
	public String show();

}
