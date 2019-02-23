package com.tat.springangular.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.tat.springangular.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Long>{

	//List<RoomEntity> findById(Long id);

	RoomEntity findById(Long id);
}

