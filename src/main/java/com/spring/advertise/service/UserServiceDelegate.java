package com.spring.advertise.service;

import java.util.Map;

public interface UserServiceDelegate {

	//public List<Map> findByUsernames(String usernames);
	//public Map findByUsername(String username);
	public boolean isLoggedInUser(String authToken);
}
