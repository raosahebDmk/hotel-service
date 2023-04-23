package com.ms.service;

import java.util.List;

import com.ms.dao.Hotel;

public interface HotelService {
	
	//create Hotel
	Hotel createHotel(Hotel hotel);
	
	//get all Hotel list
	List<Hotel> getAllHolte();
	
	//get hotel using hotel id	
	Hotel getHolte(String id);

}
