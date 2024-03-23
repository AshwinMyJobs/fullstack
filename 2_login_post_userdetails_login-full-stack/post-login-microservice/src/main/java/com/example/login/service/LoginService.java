package com.example.login.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.login.dto.MessageDTO;
import com.example.login.dto.User;

@Service
public class LoginService {

	public MessageDTO authService(User user) {
		String message = "Welcome " + user.getUserName() + ", you are Authenticated !!!!!";
		return new MessageDTO(message);
	}
}
