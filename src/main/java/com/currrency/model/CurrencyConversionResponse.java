package com.currrency.model;

import lombok.Data;

@Data
public class CurrencyConversionResponse {

	private String currFrom;
	private String currTo;
	private Double quantity;
	private Double totalCurVal;

}
