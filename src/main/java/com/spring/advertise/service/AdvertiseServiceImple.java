package com.spring.advertise.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.advertise.dto.AdvertiseDto;
import com.spring.advertise.entity.AdvertiseEntity;
import com.spring.advertise.exception.InvalidAdvertiseIdException;
import com.spring.advertise.exception.InvalidAuthorizationTokenException;
import com.spring.advertise.repo.AdvertiseRepo;

@Service
public class AdvertiseServiceImple implements AdvertiseService{

	
	@Autowired
	private AdvertiseRepo advertiseRepo;
	//@Autowired
	//private CategoryServiceDelegate categoryServiceDelegate;
	@Autowired
	private UserServiceDelegate userServiceDelegate;
	

	public AdvertiseDto createNewAdvertise(AdvertiseDto advertiseDto,
			String authToken) {
		
		if(!userServiceDelegate.isLoggedInUser(authToken))
		{
			System.out.println("pawan1");
			throw new InvalidAuthorizationTokenException(authToken);
		}
		
		AdvertiseEntity advertiseEntity = new AdvertiseEntity(advertiseDto.getTitle(), advertiseDto.getDescription(), advertiseDto.getPrice(), advertiseDto.getCategories(), LocalDate.now(), LocalDate.now(), "1", advertiseDto.getUsername());
		advertiseEntity = advertiseRepo.save(advertiseEntity);
		return new AdvertiseDto(advertiseEntity.getId(), advertiseEntity.getTitle(), advertiseEntity.getDescription(), advertiseEntity.getPrice(), advertiseEntity.getCategory(), advertiseEntity.getCreatedDate(), advertiseEntity.getModifiedDate(), advertiseEntity.getActive(), advertiseEntity.getUsername());
	}
	
	
	
	@Override
	public AdvertiseDto getAdvertiseDetailsById(long Id, String authToken) {
	
		if(userServiceDelegate.isLoggedInUser(authToken)) 
		{
		Optional<AdvertiseEntity> opstockEntity = advertiseRepo.findById(Id);
		if (opstockEntity.isPresent()) {
			AdvertiseEntity advertiseEntity = opstockEntity.get();
			AdvertiseDto advertise = new AdvertiseDto(advertiseEntity.getId(), advertiseEntity.getTitle(), advertiseEntity.getDescription(), advertiseEntity.getPrice(), 
					advertiseEntity.getCategory(), advertiseEntity.getCreatedDate(), advertiseEntity.getModifiedDate(), advertiseEntity.getActive(), advertiseEntity.getUsername());

			return advertise;
		}
		throw new InvalidAdvertiseIdException("Custome Exception:" + Id);
		}
		throw new InvalidAuthorizationTokenException(authToken);
	}


	@Override
	public AdvertiseDto updateAdvertiseById(AdvertiseDto advertise, long Id, String authToken) {
	
		if(userServiceDelegate.isLoggedInUser(authToken)) 
		{
		Optional<AdvertiseEntity> opstockEntity = advertiseRepo.findById(Id);
		if (opstockEntity.isPresent()) {
			AdvertiseEntity advertiseEntity = opstockEntity.get();
			advertiseEntity.setTitle(advertise.getTitle());
			advertiseEntity.setPrice(advertise.getPrice());
			advertiseEntity.setCategory(advertise.getCategory());
			advertiseEntity.setDescription(advertise.getDescription());
			
			advertiseEntity.setActive(advertise.getActive());
			advertiseRepo.save(advertiseEntity);
			advertise.setId(Id);
			return advertise;
		}
		throw new InvalidAdvertiseIdException("Custome Exception:" + Id);
		}
		throw new InvalidAuthorizationTokenException(authToken);
	}
	
	
	@Override
	public Boolean deleteUsersAdvertiseById(String authToken, long Id) {

	
		if(userServiceDelegate.isLoggedInUser(authToken)) 
		{
			if (advertiseRepo.existsById(Id)) {
				advertiseRepo.deleteById(Id);
				return true;
			}
			throw new InvalidAdvertiseIdException("Custome Exception" + Id);
		}
		throw new InvalidAuthorizationTokenException(authToken);
	}

	
}
