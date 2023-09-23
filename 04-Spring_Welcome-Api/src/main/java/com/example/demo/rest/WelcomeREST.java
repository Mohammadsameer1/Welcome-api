package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.feign.GreetFeign;

@RestController
public class WelcomeREST {

	@Autowired
	private GreetFeign feign;

	@GetMapping("/welcome")
	public String get() {

		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<String> forEntity =
		 * rt.getForEntity("http://localhost:9090/greet", String.class); String body =
		 * forEntity.getBody();
		 */

		String greet = feign.getGreet();

		return greet + "welcome sameer";
	}
}
