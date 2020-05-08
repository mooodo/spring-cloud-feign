/*
 * Created by 2020-05-04 11:36:52 
 */
package com.demo.feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fangang
 */
@Service
@FeignClient(value="Service-Hello", fallback=HelloServiceHystrixImpl.class)
public interface HelloService {
	@GetMapping("sayHello")
	public String sayHello(@RequestParam String user);
	@GetMapping("showMe")
	public Person showMe();
	@PostMapping("findPerson")
	public Person findPerson(Map<String, String> param);
}
