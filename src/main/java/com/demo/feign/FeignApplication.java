/*
 * Created by 2020-05-04 11:32:53 
 */
package com.demo.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author fangang
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}

}
