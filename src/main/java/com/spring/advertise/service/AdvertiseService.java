package com.spring.advertise.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.advertise.dto.AdvertiseDto;

public interface AdvertiseService {
	
	public AdvertiseDto createNewAdvertise(AdvertiseDto advertiseDto
			, String authToken);
	
	AdvertiseDto getAdvertiseDetailsById(long Id, String authToken);

	AdvertiseDto updateAdvertiseById(AdvertiseDto advertiseDto, long Id, String authToken);

	
	Boolean deleteUsersAdvertiseById(String authToken, long Id);

	
}
