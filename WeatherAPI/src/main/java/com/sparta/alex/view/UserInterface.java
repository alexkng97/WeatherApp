package com.sparta.alex.view;

import com.sparta.alex.model.LocationDTO;
import com.sparta.alex.model.WeatherDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {

	public static String getLocation() {
		System.out.println("Enter location:");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}


	public static int chooseLocation(LocationDTO[] locations) {
		System.out.printf("There are %d locations returned from your search. \n", locations.length);
		System.out.println("Please choose the location you want:");

		for (int i = 0; i < locations.length; i++) {
			System.out.printf("[%d] %s \n", (i + 1), locations[i].getTitle());
		}
		Scanner scanner = new Scanner(System.in);
		return (scanner.nextInt() - 1);

	}

	public static void chooseWeatherOption(WeatherDTO weatherDTO){
		System.out.println("\nWould you like to view the weather for:");
		System.out.println("[1] Today");
		System.out.println("[2] Tomorrow");
		System.out.println("[3] The next 5 days");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch(option){
			case 1:
				printTodaysWeather(weatherDTO);
				break;
			case 2:
				printTomorrowsWeather(weatherDTO);
				break;

			default:
				System.out.println("Invalid option!");
		}

	}

	public static void printTodaysWeather(WeatherDTO weatherDTO){
		HashMap<String, String> weather = weatherDTO.getConsolidated_weather().get(0);

		System.out.println("\n---------------------------------------------------");
		System.out.println("TODAY'S WEATHER (" + convertDate(weather.get("applicable_date")) +")");
		System.out.println("\t" +weather.get("predictability") + "% chance of " + weather.get("weather_state_name"));
		System.out.println("\tLows of " + (int) Double.parseDouble(weather.get("min_temp")) + "C and highs of "
				+ (int) Double.parseDouble(weather.get("max_temp")) + "C");

	}

	public static String convertDate(String date){
		LocalDate localDate = LocalDate.parse(date);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM");

		return formatter.format(localDate);

	}

	public static void printTomorrowsWeather(WeatherDTO weatherDTO){
		HashMap<String, String> weather = weatherDTO.getConsolidated_weather().get(1);

		System.out.println("\n---------------------------------------------------");
		System.out.println("TOMORROW'S WEATHER (" + convertDate(weather.get("applicable_date")) +")");
		System.out.println("\t" +weather.get("predictability") + "% chance of " + weather.get("weather_state_name"));
		System.out.println("\tLows of " + (int) Double.parseDouble(weather.get("min_temp")) + "C and highs of "
				+ (int) Double.parseDouble(weather.get("max_temp")) + "C");

	}

}
