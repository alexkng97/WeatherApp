package com.sparta.alex.controller;

public class WeatherDTO {

	public static String processLocation(String location){
		location = location.toLowerCase().trim();
		location = location.replaceAll("\\s+","");


		return location;
	}


}
