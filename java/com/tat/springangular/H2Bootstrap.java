package com.tat.springangular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tat.springangular.entity.RoomEntity;
import com.tat.springangular.repository.RoomRepository;

@Component
public class H2Bootstrap implements CommandLineRunner{

	@Autowired
	RoomRepository roomRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		System.out.println("Bootstraping Data: ");
		roomRepository.save(new RoomEntity(405,"200"));
		roomRepository.save(new RoomEntity(406,"270"));
		roomRepository.save(new RoomEntity(407,"580"));
		roomRepository.save(new RoomEntity(408,"300"));
		
		System.out.println("Bootstraping Data2: count= "+roomRepository.count());
		Iterable<RoomEntity> itr = roomRepository.findAll();
		for(RoomEntity room : itr ){
			System.out.println(room.getRoomNumber());
		}
	}

}
