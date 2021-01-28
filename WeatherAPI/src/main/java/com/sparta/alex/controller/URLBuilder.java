package com.sparta.alex.controller;

public class URLBuilder {

	private static final String BASE_URL = "https://www.metaweather.com/api/location/";

	public static String processLocation(String location){
		location = location.toLowerCase().trim();
		location = location.replaceAll("\\s+","");

		return location;
	}

	public static String buildLocationSearchURL(String location){
		StringBuilder sb = new StringBuilder();
		sb.append(BASE_URL).append("search/?query=").append(location);
		return sb.toString();
	}
}
