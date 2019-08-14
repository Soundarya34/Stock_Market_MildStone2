package com.example.springMvcExample.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springMvcExample.model.Company;
import com.example.springMvcExample.model.StockExchange;

public interface StockExchangeDao extends JpaRepository<StockExchange, Integer>{

//	public boolean insertStockExchange(StockExchange stockExchange) throws SQLException;

	// public Company updateCompany(Company company);

//	public List<StockExchange> getStockExchangeList() throws Exception;

}
