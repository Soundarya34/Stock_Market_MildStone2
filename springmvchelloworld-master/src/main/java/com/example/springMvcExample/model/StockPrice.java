package com.example.springMvcExample.model;

import java.util.List;

public class StockPrice {

	private int companyCode;
	private List stockExchange;
	private float currentPrice;
	private String date;
	private String time;

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public List getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(List stockExchange) {
		this.stockExchange = stockExchange;
	}

	public float getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
