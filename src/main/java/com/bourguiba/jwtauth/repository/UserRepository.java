package com.bourguiba.jwtauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bourguiba.jwtauth.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findUserByUsername(String username);
}
