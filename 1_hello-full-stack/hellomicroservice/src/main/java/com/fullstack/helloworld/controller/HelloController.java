package com.fullstack.helloworld.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fullstack.helloworld.dto.Hello;

@RestController
@RequestMapping("hello")
public class HelloController {

	@GetMapping("{name}")
	public @ResponseBody Hello sayHello(@PathVariable String name ) {
		System.out.println("I am called.........");
		Hello hello = new Hello();
		hello.setMessage("Welcome to full stack programming " + name +" , Happy learning!!!!!");
		//return "Welcome to full stack programming " + name +" , Happy learning!!!!!";
		return hello;
	}
}
