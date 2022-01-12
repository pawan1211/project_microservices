package com.spring.advertise.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.advertise.entity.AdvertiseEntity;

@Repository
public interface AdvertiseRepo extends JpaRepository<AdvertiseEntity, Long>{
	public List<AdvertiseEntity> findByUsername(String username);
}
