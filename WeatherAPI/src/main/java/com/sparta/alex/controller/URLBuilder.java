package com.sparta.alex.controller;

public class URLBuilder {

	private static final String BASE_URL = "https://www.metaweather.com/api/location/";

	public static String processLocation(String location){
		location = location.toLowerCase().trim();
		location = location.replaceAll("\\s+","");

		return location;
	}

	public static String buildLocationSearchURL(String location){
		return BASE_URL + "search/?query=" + location;
	}

	public static String buildLocationURL(int woeid){
		return BASE_URL + woeid + "/";
	}
}
