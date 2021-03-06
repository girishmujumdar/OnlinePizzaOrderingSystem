package com.app.dao;

import java.util.List;

import com.app.pojos.User;

public interface IUserDao {
	List<User> getAllUsers();
	User getUserById(int userId);
	User addUserDetails(User u);//u --transient 
	void deleteUser(User u);
	User validateUser(String email, String pass);
	List<User> getAllCustomers();
}
