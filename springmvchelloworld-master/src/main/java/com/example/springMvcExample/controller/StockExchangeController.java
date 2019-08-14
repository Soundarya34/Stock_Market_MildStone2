package com.example.springMvcExample.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.springMvcExample.model.StockExchange;

public interface StockExchangeController {

	public boolean insertStockExchange(StockExchange stockExchange) throws SQLException;

	// public Company updateCompany(Company company);

	public List<StockExchange> getStockExchangeList() throws Exception;
}
