package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoControllor {

	@RequestMapping("/demo")
	public String demo() {
		return "Hello World";
	}
}
