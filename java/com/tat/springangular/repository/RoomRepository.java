package com.tat.springangular.repository;

import org.springframework.data.repository.CrudRepository;

import com.tat.springangular.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
	
	RoomEntity findById(Long id);
}
