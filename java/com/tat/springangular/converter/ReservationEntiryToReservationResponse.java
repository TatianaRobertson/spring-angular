package com.tat.springangular.converter;

import org.springframework.core.convert.converter.Converter;

import com.tat.springangular.entity.ReservationEntity;
import com.tat.springangular.model.response.ReservationResponse;

public class ReservationEntiryToReservationResponse implements Converter<ReservationEntity, ReservationResponse> {

	@Override
	public ReservationResponse convert(ReservationEntity source) {

		ReservationResponse reservationResponse = new ReservationResponse();

		reservationResponse.setCheckin(source.getCheckin());
		reservationResponse.setCheckout(source.getCheckout());

		return reservationResponse;
	}

}
