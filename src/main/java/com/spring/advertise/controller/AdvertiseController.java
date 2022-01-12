package com.spring.advertise.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.advertise.dto.AdvertiseDto;
import com.spring.advertise.service.AdvertiseService;



@RestController

public class AdvertiseController {

	@Autowired
	private AdvertiseService advertiseService;
/*
	@GetMapping(value="/advertise")
	public List<AdvertiseDto> getAllAdvertises() {
		return advertiseService.getAllAdvertises();
	}

	@GetMapping(value="/advertise/{id}")
	public List<AdvertiseDto> getAdvertisesById(@PathVariable("id") String username) {
		return advertiseService.getAllAdvertisesByUsername(username);
	}
*/
	@PostMapping(value="/advertise")
	public ResponseEntity<AdvertiseDto> createNewAdvertise(@RequestBody AdvertiseDto advertiseDto,@RequestHeader("Authorization") String authToken)
	{
		AdvertiseDto advertiseDto1 = advertiseService.createNewAdvertise(advertiseDto,authToken);
		return new ResponseEntity<AdvertiseDto>(advertiseDto1, HttpStatus.OK);
	}
	
	
	
	
	@PutMapping(value="/advertise/{id}")
	public ResponseEntity<AdvertiseDto>updateAdvertiseById(@RequestBody AdvertiseDto advertise,@PathVariable ("id")int Id,@RequestHeader("Authorization")String authToken)
	{
		
		return new ResponseEntity<AdvertiseDto>(advertiseService.updateAdvertiseById( advertise,Id,authToken),HttpStatus.OK);
	}
	
	
	

	@GetMapping(value="/user/advertise/{id}")
	public AdvertiseDto getUsersAdvertiseById(@RequestHeader("Authorization")String authToken,@PathVariable("id")int Id)
	{
		return advertiseService.getAdvertiseDetailsById(Id,authToken);
	
	}
	

	@DeleteMapping(value="/user/advertise/{id}")
	public ResponseEntity<Boolean>deleteUsersAdvertiseById(@RequestHeader("Authorization")String authToken,@PathVariable("id")int Id)
	{
	
		return new ResponseEntity<Boolean>(advertiseService.deleteUsersAdvertiseById(authToken,Id),HttpStatus.OK);
	}
	


	
	
	
	
	
	
	
	
	
	
	
}