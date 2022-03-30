package com.example.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController 
{
	@GetMapping("/")
	public String greet()
	{
		return "<h1>Hello Everyone!! This is First Application Deployed on AWS</h1>";
	}
}
