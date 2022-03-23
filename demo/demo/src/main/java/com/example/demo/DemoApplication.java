package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	Creating an End point for the port 8080
	@GetMapping
	public String hello() {
		return "Hello World!";
	}

	@GetMapping
	public List<String> hello1() {
		return List.of("Hello", "World!");
	}

	@GetMapping
	public List<Student> hello1() {
		return List.of(
				new Student(
						1L,
						"Avishka",
						"avishka@codegen.net",
						LocalDate.of(1996, Month.NOVEMBER, 3),
						26
				)
		);
	}*/
}
