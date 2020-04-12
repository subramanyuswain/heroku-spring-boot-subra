package com.learn.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HerokuSpringBootSubraApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuSpringBootSubraApplication.class, args);
	}
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Heroku App using springboot";
	}

}
