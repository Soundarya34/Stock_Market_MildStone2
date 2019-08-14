package com.example.springMvcExample.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springMvcExample.dao.StockExchangeDao;
import com.example.springMvcExample.model.StockExchange;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	private StockExchangeDao stockExchangeDao;
	
	@Override
	public boolean insertStockExchange(StockExchange stockExchange) throws SQLException {
		// TODO Auto-generated method stub
		stockExchangeDao.save(stockExchange);
		return  true;
	}

	@Override
	public List<StockExchange> getStockExchangeList() throws Exception {
		// TODO Auto-generated method stub
		return stockExchangeDao.findAll();
	}
	
	
	
	
	
	
	
	
	

/*	@Override
	public boolean insertStockExchange(StockExchange stockExchange) throws SQLException {
		// TODO Auto-generated method stub
		return stockExchangeDao.insertStockExchange(stockExchange);
	}

	@Override
	public List<StockExchange> getStockExchangeList() throws Exception {
		// TODO Auto-generated method stub
		return stockExchangeDao.getStockExchangeList();
	}
	
	*/
}
