package com.youtube2.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube2.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@SuppressWarnings("unchecked")
	User save(User user);

}
