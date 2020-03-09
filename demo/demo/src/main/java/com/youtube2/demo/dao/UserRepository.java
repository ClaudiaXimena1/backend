package com.youtube2.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube2.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@SuppressWarnings("unchecked")
	User save(User user);
	
	List<User> findAll();

}
