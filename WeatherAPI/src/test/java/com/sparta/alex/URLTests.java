package com.sparta.alex;

import com.sparta.alex.controller.URLBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class URLTests {

	@Test
	@DisplayName("Process capitalized location")
	void processCapitalizedLocation() {
		Assertions.assertEquals("london", URLBuilder.processLocation("London"));
	}

	@Test
	@DisplayName("Process spaces in location input")
	void processSpacesInLocationInput() {
		Assertions.assertEquals("sanfrancisco", URLBuilder.processLocation("San Francisco"));
	}

	@Test
	@DisplayName("URL builder test")
	void urlBuilderTest() {
		Assertions.assertEquals("https://www.metaweather.com/api/location/search/?query=london",
				URLBuilder.buildLocationSearchURL(URLBuilder.processLocation("london")));
	}

	@Test
	@DisplayName("builds location url")
	void buildsLocationUrl() {
		Assertions.assertEquals("https://www.metaweather.com/api/location/44418/", URLBuilder.buildLocationURL(44418));
	}
}
