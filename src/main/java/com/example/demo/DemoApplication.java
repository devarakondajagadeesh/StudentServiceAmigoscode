package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
/*
	@GetMapping
	public String hello(){
		return "hello Jagadeesh, Welcome back to Java";
	} */
/*
	@GetMapping
	public List<String> getOperation(){
		return List.of("Hello", "Jagadeesh welcome back to java");

		// return List.of("Jagadeesh", " welcome back");

	}
*/


}
