package com.example.springMvcExample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock_exchange")
public class StockExchange {

	@Id
	@Column(name="stockexchange_id")
	private int stockExchangeId;
	
	@Column(name="stockexchange_name")
	private String stockExchangeName;
	
	@Column(name="brief")
	private String brief;
	
	@Column(name="contact_address")
	private String contactAddress;
	
	@Column(name="remarks")
	private String remarks;

	public int getstockExchangeId() {
		return stockExchangeId;
	}

	public void setstockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "\n" + "stockExchangeId=" + stockExchangeId + ", stockExchangeName=" + stockExchangeName + ", brief="
				+ brief + ", contactAddress=" + contactAddress + ", remarks=" + remarks;
	}

}
