package com.bourguiba.jwtauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bourguiba.jwtauth.entity.User;
import com.bourguiba.jwtauth.entity.UserRequest;
import com.bourguiba.jwtauth.services.UserServiceImp;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserServiceImp userService;
	
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PostMapping("/generateToken")
	public String generateToken(@RequestBody UserRequest user) {
		return userService.generateToken(user.getUsername());
	}
	
	@GetMapping("/all")
	public Iterable<User> getAll(User user) {
		return userService.getUsers();
	}

	
	@GetMapping("/{id}")
	public User getUser(@PathVariable long id) {
		return userService.getUserById(id);
	}

}
