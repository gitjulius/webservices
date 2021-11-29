package com.example.webservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservices.dto.User;

@RestController
public class UserController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello Julius";
	}
	
	@GetMapping("/users/{id}")
	public User getUser() {
		return new User(123, "Julius", "928347572");
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return Arrays.asList(new User(123, "Julius", "928347572"),
				new User(234, "Joshua", "53454353"),
				new User(456, "Joel", "57567567"));
	}

}
