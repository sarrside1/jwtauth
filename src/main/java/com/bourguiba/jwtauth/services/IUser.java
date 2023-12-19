package com.bourguiba.jwtauth.services;

import com.bourguiba.jwtauth.entity.User;

public interface IUser {
	
	User saveUser(User user);
	User loadUserByUsername(String username);
	Iterable<User> getUsers();
	User getUserById(long id);
	String generateToken(String username);

}
