package com.currrency.service;

import com.currrency.model.CurrencyConversionResponse;

public interface CurrencyConversionService {
	public CurrencyConversionResponse convert(String from, String to, Double quantity);
}
