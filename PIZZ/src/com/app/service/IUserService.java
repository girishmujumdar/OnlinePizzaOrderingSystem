package com.app.service;

import java.util.List;

import com.app.pojos.User;

public interface IUserService {
	List<User> getAllUsers();
	User addUserDetails(User u);//u --transient 
	User getUserById(int userId);
	User validateUser(String email, String pass);
	List<User> getAllCustomers();
}
