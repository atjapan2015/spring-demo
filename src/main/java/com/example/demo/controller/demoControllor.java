package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dataset.User;
import com.example.demo.dataset.UserExample;
import com.example.demo.mapper.UserMapper;

@RestController
public class demoControllor {

	@Autowired
	UserMapper userMapper;

	@RequestMapping("/demo")
	public String demo() {
		return "Hello World";
	}

	@RequestMapping("/users")
	public List<User> users() {
		return userMapper.selectByExample(new UserExample());
	}
}
