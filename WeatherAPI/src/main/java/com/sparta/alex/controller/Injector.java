package com.sparta.alex.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.alex.model.LocationDTO;
import com.sparta.alex.model.WeatherDTO;

public class Injector {

	public static LocationDTO[] injectIntoLocationSearch(String JsonBody){
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			LocationDTO[] ls = objectMapper.readValue(JsonBody, LocationDTO[].class);
			return ls;
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;
	}

	public static WeatherDTO injectIntoWeather(String JsonBody){
		ObjectMapper objectMapper = new ObjectMapper();
		WeatherDTO weatherDTO = null;
		try {
			weatherDTO = objectMapper.readValue(JsonBody, WeatherDTO.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return weatherDTO;
	}
}
