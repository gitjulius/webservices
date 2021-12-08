package com.example.webservices.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservices.dto.User;

@RestController
public class UserController {

	@GetMapping("/hello")
	public String getHello() {
		return "Hello Julius";
	}

//	@GetMapping("/users/{id}")
//	public User getUser(@PathVariable Long id) {
//		return new User(id, "Julius", "928347572");
//	}

	@GetMapping(value = { "/users/{id}", "/users/{id}/{name}", "/users/{id}/{name}/{ssn}" })
	public User getUserName(@PathVariable("id") Long identifier, @PathVariable(value = "name", required = false) Optional<String> username,
			@PathVariable(value = "ssn", required = false) String ssn) {
		System.out.println(username);
		String nm = username.isPresent() ? username.get() : "xxx" ;
		
		System.out.println(nm);
		return new User(identifier, nm , ssn);
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return Arrays.asList(new User(123, "Julius", "928347572"), new User(234, "Joshua", "53454353"),
				new User(456, "Joel", "57567567"));
	}

}
