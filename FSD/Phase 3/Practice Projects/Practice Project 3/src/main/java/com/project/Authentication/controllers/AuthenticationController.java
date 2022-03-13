package com.project.Authentication.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.project.Authentication.entities.User;
import com.project.Authentication.exceptions.UserNotFoundException;
import com.project.Authentication.services.AuthenticationService;

@Controller
public class AuthenticationController {

	Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	AuthenticationService authService;
	@GetMapping("/")
	public String showLogin() 
	{
		return "authenticate";
	}

	@PostMapping("/Auth")
	public String authenticateUser(@RequestParam("username") String username, @RequestParam("password") String pswd) {
		User user = authService.GetUserByEmail(username);
		logger.info(user.getName() + " attempted to login with " + user.getPassword());
		String path = (authService.isValidPassword(pswd, user.getPassword())) ? "success" : "failure";
		logger.info("The path return: " + path);
		return path;
	}
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<Object> exception(UserNotFoundException e)
	{
		return  new ResponseEntity<Object>("<h1>Invalid Username</h1>",HttpStatus.NOT_FOUND);
	}
	
} 
