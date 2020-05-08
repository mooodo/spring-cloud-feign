/*
 * Created by 2020-05-04 11:56:53 
 */
package com.demo.feign;

import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * @author fangang
 */
@Component
public class HelloServiceHystrixImpl implements HelloService {
	@Override
	public String sayHello(String user) {
		return "Sorry, something wrong!";
	}

	@Override
	public Person showMe() {
		Person person = new Person();
		person.setId(0);
		person.setName("Unknown");
		person.setGender("unknown");
		return person;
	}

	@Override
	public Person findPerson(Map<String, String> param) {
		Person person = new Person();
		person.setId(0);
		person.setName("Unknown");
		person.setGender("unknown");
		return person;
	}

}
