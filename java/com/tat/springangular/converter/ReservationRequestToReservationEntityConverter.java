package com.tat.springangular.converter;



import org.springframework.core.convert.converter.Converter;

import com.tat.springangular.entity.ReservationEntity;
import com.tat.springangular.model.request.ReservationRequest;

public class ReservationRequestToReservationEntityConverter implements Converter<ReservationRequest, ReservationEntity> {

    @Override
    public ReservationEntity convert(ReservationRequest source) {

        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity.setCheckin(source.getCheckin());
        reservationEntity.setCheckout(source.getCheckout());
        if (null != source.getId())
            reservationEntity.setId(source.getId());

        return reservationEntity;
    }
}