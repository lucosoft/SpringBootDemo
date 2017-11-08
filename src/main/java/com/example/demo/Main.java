package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@SpringBootApplication
public class Main {

	@RequestMapping("/")
	@ResponseBody
	String home1() {
		return "Puto el que lee!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
