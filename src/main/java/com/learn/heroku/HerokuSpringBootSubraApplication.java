package com.learn.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class HerokuSpringBootSubraApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuSpringBootSubraApplication.class, args);
	}
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Heroku App using springboot";
	}
	
	@GetMapping
	public String landingPage() {
		return "Call /home for homePage";
	}


}
