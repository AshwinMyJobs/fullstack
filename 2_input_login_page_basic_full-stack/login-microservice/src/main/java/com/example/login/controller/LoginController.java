package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.dto.Message;
import com.example.login.dto.User;
import com.example.login.service.LoginService;

@RestController
@RequestMapping("api/auth")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping("/signin")
	public Message handleLogin(@RequestBody User user) {
		System.out.println("Post method is called");
		Message message = new Message(loginService.checkAuthentication(user));
		return message;
	}
	
	@GetMapping
	public User handleLoginGet() {
		System.out.println("Get method is called");
		User user = new User("Ashwinhsacodes", "Ashwinhsacodes");
		return user;
	}	
}
