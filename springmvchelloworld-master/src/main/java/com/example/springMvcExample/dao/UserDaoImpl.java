package com.example.springMvcExample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.example.springMvcExample.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public boolean registerUser(User user) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockexchange", "root", "root");
		PreparedStatement ps = conn.prepareStatement(
				"insert into user (username,password,user_type,email,mobile_number,confirmed) values(?,?,?,?,?,?) ");
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getUsertype());
		ps.setString(4, user.getEmail());
		ps.setLong(5, user.getMobileNumber());
		ps.setString(6, user.getConfirmed());

		ps.executeUpdate();
		return true;
	}

	@Override
	public int loginUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockexchange", "root", "root");
		// PreparedStatement ps = conn.prepareStatement("select username,password from
		// user");
		PreparedStatement ps = conn.prepareStatement("select password from user where username='" + username + "'");
		// System.out.println("username"+username +" Passsword"+password);
		ResultSet rs = ps.executeQuery();
		String user, pass;
		while (rs.next()) {

			pass = rs.getString("password");

			if (pass.equals(password))
				return 1;

		}

		return 0;
	}

}
