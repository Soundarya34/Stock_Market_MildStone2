package com.example.springMvcExample.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springMvcExample.dao.CompanyDao;
import com.example.springMvcExample.dao.UserDao;
import com.example.springMvcExample.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean registerUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.registerUser(user);
	}

	@Override
	public int loginUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.loginUser(username, password);
	}

}
