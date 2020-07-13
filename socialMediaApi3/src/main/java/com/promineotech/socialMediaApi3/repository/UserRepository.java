package com.promineotech.socialMediaApi3.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.socialMediaApi3.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByUsername(String username);


}
