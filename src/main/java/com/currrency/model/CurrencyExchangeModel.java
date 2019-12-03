package com.currrency.model;

import lombok.Data;

@Data
public class CurrencyExchangeModel {
	
	private Integer id;
	private String currencyFrom;
	private String currencyTo;
	private Double currencyValue;

}
