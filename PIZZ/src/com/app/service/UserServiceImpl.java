package com.app.service;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.User;

@Service // B.L methods
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	@PostConstruct
	public void myInit() {
		System.out.println("in init of " + getClass().getName() + " " + userDao);
	}
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	@Override
	public User addUserDetails(User u) {
		return userDao.addUserDetails(u);
	}
	@Override
	public User getUserById(int userId) {
		return userDao.getUserById(userId);
	}
	@Override
	public User validateUser(String email, String pass) {
		return userDao.validateUser(email, pass);
	}
	@Override
	public List<User> getAllCustomers() {
		return userDao.getAllCustomers();
	}

}
