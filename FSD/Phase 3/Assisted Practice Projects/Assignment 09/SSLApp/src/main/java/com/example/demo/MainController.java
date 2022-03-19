package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String test()
	{
		return "Application runnit under SSL";
	}
}
© 2022 GitHub, Inc.
