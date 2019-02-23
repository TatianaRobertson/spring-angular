package com.tat.springangular.converter;

import org.springframework.core.convert.converter.Converter;

import com.tat.springangular.entity.RoomEntity;
import com.tat.springangular.model.Links;
import com.tat.springangular.model.Self;
import com.tat.springangular.model.response.ReservableRoomResponse;
import com.tat.springangular.rest.ResourceConstants;

public class RoomEntiryToReservableRoomResponceConverter implements Converter<RoomEntity, ReservableRoomResponse> {

	@Override
	public ReservableRoomResponse convert(RoomEntity source) {
		ReservableRoomResponse reservationRespose = new  ReservableRoomResponse();
		reservationRespose.setRoomNumber(source.getRoomNumber());
		reservationRespose.setPrice(Integer.valueOf(source.getPrice()));
		reservationRespose.setRoomNumber(source.getRoomNumber());
		
		Links links = new Links();
		Self self = new Self();
		self.setRef(ResourceConstants.ROOM_RESERVATION_V1+"/"+source.getId());
		links.setSelf(self);
		reservationRespose.setLinks(links);
		
		return reservationRespose;
	}

}
