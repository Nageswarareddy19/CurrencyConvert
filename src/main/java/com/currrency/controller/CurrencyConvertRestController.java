package com.currrency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currrency.model.CurrencyConversionResponse;
import com.currrency.service.CurrencyConversionService;

@RestController
public class CurrencyConvertRestController {

	@Autowired
	private CurrencyConversionService service;

	@GetMapping(value = "currencyConvert/from/{from}/to/{to}/quantity/{quantity}", produces = "application/json")
	public CurrencyConversionResponse convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable("quantity") Double quantity) {

		CurrencyConversionResponse response = service.convert(from, to, quantity);
		return response;

	}

}
