package com.ms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.dao.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
