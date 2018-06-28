package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@PostMapping("/add")
	public Restaurant addrestaurant(@RequestBody Restaurant restaurant)
	{
		Restaurant persistedRestaurant=restaurantRepository.save(restaurant);
		return persistedRestaurant;
	}
     
	
	@GetMapping("/getAll")
	public List<Restaurant> getAll() {
		
		List<Restaurant> restaurant =restaurantRepository.findAll();
		return restaurant;
	}
}
