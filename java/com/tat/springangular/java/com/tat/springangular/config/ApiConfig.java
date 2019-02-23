package com.tat.springangular.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Configuration
public class ApiConfig {


	@Bean
	public ObjectMapper objectMapper(){
		ObjectMapper objectMapper = new ObjectMapper() ;
		objectMapper.registerModule(new JavaTimeModule());
		return objectMapper;
		//return new ObjectMapper();
	}

	@Bean
	public ObjectWriter objectWriter(ObjectMapper objectMapper){
		return objectMapper.writerWithDefaultPrettyPrinter();
	}

}