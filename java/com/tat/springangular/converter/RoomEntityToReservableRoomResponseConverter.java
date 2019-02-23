package com.tat.springangular.converter;

import org.springframework.core.convert.converter.Converter;

import com.tat.springangular.entity.RoomEntity;
import com.tat.springangular.model.Links;
import com.tat.springangular.model.Self;
import com.tat.springangular.model.response.ReservableRoomResponse;
import com.tat.springangular.rest.ResourceConstants;



public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse>{

	@Override
	public ReservableRoomResponse convert(RoomEntity source) {
		// TODO Auto-generated method stub
		
		ReservableRoomResponse reservationResponse = new ReservableRoomResponse();
		reservationResponse.setRoomNumber(source.getRoomNumber());
		reservationResponse.setPrice( Integer.valueOf(source.getPrice()) );
		
		Links links = new Links();
		Self self = new Self();
		self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
		links.setSelf(self);
		
		reservationResponse.setLinks(links);
		
		return reservationResponse;
	}

	
	
}
