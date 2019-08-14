package com.example.springMvcExample.controller;

import java.sql.SQLException;

import com.example.springMvcExample.model.Company;
import com.example.springMvcExample.model.User;

public interface UserController {

	public boolean registerUser(User user) throws SQLException;

}
