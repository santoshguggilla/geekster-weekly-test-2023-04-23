package com.example.demo.model;

/*think about variable names like restaurant name,restaurant address,number,specialty,total staffs,
 * Add a few more relevant variables*/
public class Restaurant {
	
	private String id;
	private String restaurant_name;
	private String restaurant_address;
	private long number;
	private String speciality;
	private int total_staffs;
	private boolean RestaurantStatus;
	
	public boolean isRestaurantStatus() {
		return RestaurantStatus;
	}
	public void setRestaurantStatus(boolean restaurantStatus) {
		RestaurantStatus = restaurantStatus;
	}
	public String getRestaurant_name() {
		return restaurant_name;
	}
	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRestaurant_address() {
		return restaurant_address;
	}
	public void setRestaurant_address(String restaurant_address) {
		this.restaurant_address = restaurant_address;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getTotal_staffs() {
		return total_staffs;
	}
	public void setTotal_staffs(int total_staffs) {
		this.total_staffs = total_staffs;
	}
	public Restaurant(String id, String restaurant_name, String restaurant_address, long number, String speciality,
			int total_staffs) {
		super();
		this.id = id;
		this.restaurant_name = restaurant_name;
		this.restaurant_address = restaurant_address;
		this.number = number;
		this.speciality = speciality;
		this.total_staffs = total_staffs;
	}
	

}
