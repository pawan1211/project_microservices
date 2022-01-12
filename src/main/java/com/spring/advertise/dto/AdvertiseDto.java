package com.spring.advertise.dto;

import java.time.LocalDate;

public class AdvertiseDto {

	
	
	private long id;
	private String title;
	private String description;
	private double price;
	private long categories;
	private long category;
	private LocalDate createdDate;
	private LocalDate modifiedDate;
	private String active;
	private String username;
	private String postedBy;
	
	
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getCategories() {
		return categories;
	}
	public void setCategories(long categories) {
		this.categories = categories;
	}
	public long getCategory() {
		return category;
	}
	public void setCategory(long category) {
		this.category = category;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(LocalDate modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public AdvertiseDto(long id, String title, String description, double price, long category,
			LocalDate createdDate, LocalDate modifiedDate, String active, String username) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.category = category;
		
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		
		this.username = username;
		
	}
	
}
