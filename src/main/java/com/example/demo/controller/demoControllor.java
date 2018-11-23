package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("/user/{userid}")
	public User user(@PathVariable("userid") Integer userid) {
		UserExample userExample = new UserExample();
		com.example.demo.dataset.UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUserIdEqualTo(userid);

		List<User> users = userMapper.selectByExample(userExample);
		return users != null && users.size() > 0 ? users.get(0) : null;
	}
}
