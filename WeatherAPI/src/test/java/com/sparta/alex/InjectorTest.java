package com.sparta.alex;

import com.sparta.alex.controller.ConnectionManager;
import com.sparta.alex.controller.Injector;
import com.sparta.alex.controller.URLBuilder;
import com.sparta.alex.model.LocationDTO;
import com.sparta.alex.model.WeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InjectorTest {
	static ConnectionManager connectionManager;
	String url;

	@BeforeAll
	static void setup(){
		connectionManager = new ConnectionManager();

	}

	@Test
	@DisplayName("Getting title from dto ")
	void gettingTitleFromDto() {
		url = URLBuilder.buildLocationSearchURL("london");
		connectionManager.connectToApi(url);

		LocationDTO[] location =Injector.injectIntoLocationSearch(connectionManager.getJsonBody());
		Assertions.assertEquals("London", location[0].getTitle());

	}


	@Test
	@DisplayName("Multiple locations returned")
	void multipleLocationsReturned() {
		url = URLBuilder.buildLocationSearchURL("san");
		connectionManager.connectToApi(url);

		LocationDTO[] locations = Injector.injectIntoLocationSearch(connectionManager.getJsonBody());
		Assertions.assertEquals(11,locations.length);
	}

	@Test
	@DisplayName("Testing fields from consolidated weather")
	void testingFieldsFromConsolidatedWeather() {
		url = URLBuilder.buildLocationURL(44418);
		connectionManager.connectToApi(url);

		WeatherDTO weatherDTO = Injector.injectIntoWeather(connectionManager.getJsonBody());
		System.out.println(weatherDTO.getTitle());
		System.out.println(weatherDTO.getConsolidated_weather().get(0).get("weather_state_name"));
	}
}
