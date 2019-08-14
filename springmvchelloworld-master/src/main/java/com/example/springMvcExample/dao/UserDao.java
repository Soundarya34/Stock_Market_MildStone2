package com.example.springMvcExample.dao;

import java.sql.SQLException;

import com.example.springMvcExample.model.Company;
import com.example.springMvcExample.model.User;

public interface UserDao {

	public boolean registerUser(User user) throws SQLException;

	public int loginUser(String username, String password) throws SQLException;
}
