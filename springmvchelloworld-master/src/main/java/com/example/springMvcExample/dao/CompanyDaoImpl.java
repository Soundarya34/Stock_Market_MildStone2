package com.example.springMvcExample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springMvcExample.model.Company;
/*
@Repository
public class CompanyDaoImpl implements CompanyDao {

	public boolean insertCompany(Company company) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockexchange", "root", "root");
		PreparedStatement ps = conn.prepareStatement(
				"insert into company (company_name,turnover,ceo,board_of_directors,sectors_id,brief_writeup,stockprice_code) values(?,?,?,?,?,?,?) ");
		ps.setString(1, company.getCompanyName());
		ps.setDouble(2, company.getTurnover());
		ps.setString(3, company.getCeoName());
		ps.setString(4, company.getBoardOfDirectors());
		ps.setInt(5, 1);
		ps.setString(6, company.getWriteup());
		ps.setInt(7, 1);
		ps.executeUpdate();
		return true;
	}

	public List<Company> getCompanyList() {
		List<Company> companyList = new ArrayList<Company>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockexchange", "root", "root");
			PreparedStatement ps = conn.prepareStatement("select * from company");
			ResultSet rs = ps.executeQuery();
			Company company = null;
			while (rs.next()) {
				company = new Company();
				company.setCompanyCode(rs.getInt("company_code"));
				company.setCompanyName(rs.getString("company_name"));
				company.setTurnover(rs.getDouble("turnover"));
				company.setCeoName(rs.getString("ceo"));
				company.setBoardOfDirectors(rs.getString("board_of_directors"));
				company.setSectorId(rs.getInt("sectors_id"));
				company.setWriteup(rs.getString("brief_writeup"));
				company.setStockCode(rs.getInt("stockprice_code"));
				companyList.add(company);
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return companyList;
	}

	@Override
	public boolean updateCompany(Company company) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockexchange", "root", "root");
		boolean flag = true;
		try {
			PreparedStatement ps = conn.prepareStatement("UPDATE company SET company_name=?,ceo=? WHERE company_code=?");
			ps.setString(1, company.getCompanyName());
			ps.setString(2, company.getCeoName());
			ps.setInt(3, company.getCompanyCode());

			int i = ps.executeUpdate();
			if (i == 1) {
				flag = true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;

	}



}*/
