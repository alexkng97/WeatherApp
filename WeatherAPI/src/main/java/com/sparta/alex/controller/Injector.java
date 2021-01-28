package com.sparta.alex.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.alex.model.LocationDTO;

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
}
