package com.sparta.alex.model;

import java.util.HashMap;
import java.util.List;

public class WeatherDTO extends LocationDTO{

	private List<HashMap<String,String>> consolidated_weather;
	private String time;
	private String sun_rise;
	private String sun_set;
	private String timezone_name;
	private HashMap<String,String> parent;
	private List<HashMap<String,String>> sources;

	private String timezone;


	public List<HashMap<String, String>> getConsolidated_weather() {
		return consolidated_weather;
	}

	public void setConsolidated_weather(List<HashMap<String, String>> consolidated_weather) {
		this.consolidated_weather = consolidated_weather;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSun_rise() {
		return sun_rise;
	}

	public void setSun_rise(String sun_rise) {
		this.sun_rise = sun_rise;
	}

	public String getSun_set() {
		return sun_set;
	}

	public void setSun_set(String sun_set) {
		this.sun_set = sun_set;
	}

	public String getTimezone_name() {
		return timezone_name;
	}

	public void setTimezone_name(String timezone_name) {
		this.timezone_name = timezone_name;
	}

	public HashMap<String, String> getParent() {
		return parent;
	}

	public void setParent(HashMap<String, String> parent) {
		this.parent = parent;
	}

	public List<HashMap<String, String>> getSources() {
		return sources;
	}

	public void setSources(List<HashMap<String, String>> sources) {
		this.sources = sources;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
}
