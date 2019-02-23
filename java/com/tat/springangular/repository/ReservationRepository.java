package com.tat.springangular.repository;

import org.springframework.data.repository.CrudRepository;

import com.tat.springangular.entity.ReservationEntity;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long >{

}
