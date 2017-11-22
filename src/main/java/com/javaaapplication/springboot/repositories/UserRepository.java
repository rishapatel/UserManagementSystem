package com.javaaapplication.springboot.repositories;

import com.javaaapplication.springboot.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
	 User findById(Long id);
	 
	    User findByName(String name);
	 
	    void saveUser(User user);
	 
	    void updateUser(User user);
	 
	    void deleteUserById(Long id);
	 
	    void deleteAllUsers();
	 
	    List<User> findAllUsers();
	 
	    boolean isUserExist(User user);

		User findOne(Long id);

		void delete(Long id);

		void deleteAll();

		List<User> findAll();

		void save(User user);
	}
