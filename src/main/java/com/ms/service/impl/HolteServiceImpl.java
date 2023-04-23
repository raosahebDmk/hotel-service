package com.ms.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ms.dao.Hotel;
import com.ms.exception.ResourceNotFound;
import com.ms.repositories.HotelRepository;
import com.ms.service.HotelService;

@Service
public class HolteServiceImpl implements HotelService{

	@Autowired
	public HotelRepository hotelRepository;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		String randomHotelId = UUID.randomUUID().toString();
		hotel.setId(randomHotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHolte() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHolte(String id) {
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Hotel not found : "+id));
	}

}
