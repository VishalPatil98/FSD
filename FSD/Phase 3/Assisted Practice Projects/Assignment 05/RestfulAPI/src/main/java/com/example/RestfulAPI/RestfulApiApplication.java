package com.example.RestfulAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.examle.RestfulAPI")
public class RestfulApiApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(RestfulApiApplication.class, args);
	}

}
