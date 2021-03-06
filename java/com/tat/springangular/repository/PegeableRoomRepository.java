package com.tat.springangular.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.tat.springangular.entity.RoomEntity;

public interface PegeableRoomRepository extends PagingAndSortingRepository<RoomEntity, Long>  {
	Page<RoomEntity> findById(Long id, Pageable page);
}
