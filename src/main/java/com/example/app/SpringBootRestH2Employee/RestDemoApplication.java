package com.example.app.SpringBootRestH2Employee;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(RestDemoApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
		System.out.println("App running ...");
	}
}
