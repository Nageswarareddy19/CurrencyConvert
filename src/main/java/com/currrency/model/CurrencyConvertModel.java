package com.currrency.model;

import lombok.Data;

@Data
public class CurrencyConvertModel {
	
	private String currencyFrom;
	private String currencyTo;
	private Double quantity;
	

}
