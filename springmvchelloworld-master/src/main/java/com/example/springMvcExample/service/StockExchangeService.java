package com.example.springMvcExample.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springMvcExample.model.StockExchange;

public interface StockExchangeService {

	public boolean insertStockExchange(StockExchange stockExchange) throws SQLException;

	// public Company updateCompany(Company company);

	public List<StockExchange> getStockExchangeList() throws Exception;

}
