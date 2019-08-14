package com.example.springMvcExample.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springMvcExample.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {

//	public boolean insertCompany(Company company) throws SQLException;

//	public boolean updateCompany(Company company) throws SQLException;

//	public List<Company> getCompanyList() throws SQLException;

}
