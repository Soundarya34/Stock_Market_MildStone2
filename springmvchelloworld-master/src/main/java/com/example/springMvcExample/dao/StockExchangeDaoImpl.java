package com.example.springMvcExample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springMvcExample.model.StockExchange;
/*
@Repository
public class StockExchangeDaoImpl implements StockExchangeDao {

	@Override
	public boolean insertStockExchange(StockExchange stockExchange) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockexchange", "root", "root");
		PreparedStatement ps = conn.prepareStatement(
				"insert into stock_exchange (stockexchange_name,brief,contact_address,remarks) values(?,?,?,?) ");
		ps.setString(1, stockExchange.getStockExchangeName());
		ps.setString(2, stockExchange.getBrief());
		ps.setString(3, stockExchange.getContactAddress());
		ps.setString(4, stockExchange.getRemarks());
		ps.executeUpdate();
		return true;
	}

	@Override
	public List<StockExchange> getStockExchangeList() throws Exception {
		List<StockExchange> stockExchangeList = new ArrayList<StockExchange>();
		try {

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stockexchange", "root", "root");
			PreparedStatement ps = conn.prepareStatement("select * from stock_exchange");
			ResultSet rs = ps.executeQuery();
			StockExchange stockExchange = null;
			while (rs.next()) {
				stockExchange = new StockExchange();
				stockExchange.setstockExchangeId(rs.getInt("stockexchange_id"));
				stockExchange.setStockExchangeName(rs.getString("stockexchange_name"));
				stockExchange.setBrief(rs.getString("brief"));
				stockExchange.setContactAddress(rs.getString("contact_address"));
				stockExchange.setRemarks(rs.getString("remarks"));
				stockExchangeList.add(stockExchange);

			}
		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		}
		return stockExchangeList;

	}

}
*/