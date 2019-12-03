package com.currrency.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

@Configuration
public class AppConfig {

	@Bean
	public WebClient createWebClient() {
		Builder builder = WebClient.builder();
		WebClient client = builder.build();
		return client;

	}

}
