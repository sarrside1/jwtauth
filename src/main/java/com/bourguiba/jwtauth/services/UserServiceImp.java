package com.bourguiba.jwtauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bourguiba.jwtauth.entity.User;
import com.bourguiba.jwtauth.repository.UserRepository;
import com.bourguiba.jwtauth.utils.JwtUtil;


@Service
public class UserServiceImp implements IUser{

	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User loadUserByUsername(String username) {
		return userRepository.findUserByUsername(username);
	}

	@Override
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public String generateToken(String username) {
		// TODO Auto-generated method stub
		return jwtUtil.generateToken(username);
	}

}
