package com.sparta.alex.view;

import com.sparta.alex.model.LocationDTO;

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
}
