package com.currrency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.currrency.model.CurrencyConversionResponse;
import com.currrency.model.CurrencyConvertModel;
import com.currrency.model.CurrencyExchangeModel;
import com.currrency.properties.ApplicationProps;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

	@Autowired
	private ApplicationProps props;
	@Autowired
	private WebClient client;

	@Override
	public CurrencyConversionResponse convert(String from, String to, Double quantity) {
		String currencyExchangeUrl = props.getMessages().get("curexchangeurl");
		
		CurrencyExchangeModel model = client.get().uri(currencyExchangeUrl, from, to).retrieve()
				.bodyToMono(CurrencyExchangeModel.class).block();
		Double totalCurrecncy = model.getCurrencyValue() * quantity;
		CurrencyConversionResponse response = new CurrencyConversionResponse();
		response.setTotalCurVal(totalCurrecncy);
		response.setQuantity(quantity);
		response.setCurrFrom(model.getCurrencyFrom());
		response.setCurrTo(model.getCurrencyTo());
		return response;

	}

}
