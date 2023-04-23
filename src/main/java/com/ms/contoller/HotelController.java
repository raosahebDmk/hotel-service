package com.ms.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.dao.Hotel;
import com.ms.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	public HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String id)
	{
		return ResponseEntity.ok(hotelService.getHolte(id));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHolte()
	{
		return ResponseEntity.ok(hotelService.getAllHolte());
	}
	
}
