package com.example.springMvcExample.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="company")
public class Company {

	@Id
	@Column(name="company_code")
	private int companyCode;

	@NotEmpty(message = "please enter company name")
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="turnover")
	private BigDecimal turnover;

	@NotEmpty(message = "please enter ceo name")
	@Size(min = 3, max = 30, message = "CEO name must be between 3 to 30 characters")
	@Column(name="ceo")
	private String ceoName;

	@Column(name="board_of_directors")
	private String boardOfDirectors;
	

/*	private List<StockExchange> stockExchange;
	
	@Column(name="sectors_id")
	private int sectorId;
*/
	@NotEmpty(message = "please enter the brief writeup")
	@Column(name="brief_writeup")
	private String writeup;
	/*
	@Column(name="stockprice_code")
	private int stockCode;
*/
	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public BigDecimal getTurnover() {
		return turnover;
	}

	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	/*public List<StockExchange> getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(List<StockExchange> stockExchange) {
		this.stockExchange = stockExchange;
	}

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
*/
	public String getWriteup() {
		return writeup;
	}

	public void setWriteup(String writeup) {
		this.writeup = writeup;
	}

	/*public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}*/

	@Override
	public String toString() {
		return "\ncompanyCode=" + companyCode + ", companyName=" + companyName + ", turnover=" + turnover
				+ ", ceoName=" + ceoName + ", boardOfDirectors=" + boardOfDirectors + ", " 
				+ ", writeup=" + writeup ;
	}

}
