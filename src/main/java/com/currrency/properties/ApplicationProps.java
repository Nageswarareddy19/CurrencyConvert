package com.currrency.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix ="currency-convert" )
@Data
public class ApplicationProps {

	private Map<String,String> messages=new HashMap<>();
}
