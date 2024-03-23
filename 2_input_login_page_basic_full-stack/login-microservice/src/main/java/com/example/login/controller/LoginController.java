package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.dto.User;
import com.example.login.service.LoginService;

@RestController
@RequestMapping("api/auth")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping("/signin")
	public String handleLogin(@RequestBody User user) {
		return loginService.checkAuthentication(user);
	}
}
