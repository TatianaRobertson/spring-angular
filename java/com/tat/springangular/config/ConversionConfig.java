package com.tat.springangular.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import com.tat.springangular.converter.ReservationRequestToReservationEntityConverter;
import com.tat.springangular.converter.RoomEntiryToReservableRoomResponceConverter;

@Configuration
public class ConversionConfig {

	private Set<Converter> getConverters(){
		Set<Converter> converters = new HashSet<Converter>();
		converters.add(new RoomEntiryToReservableRoomResponceConverter());
		converters.add(new ReservationRequestToReservationEntityConverter());
		converters.add(new RoomEntiryToReservableRoomResponceConverter());
		return converters;
	}
	
	@Bean
//	@Primary
	public ConversionService conversionSevice() {
		ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
		
		bean.setConverters(getConverters());
		bean.afterPropertiesSet();
		return bean.getObject();
	}
}
