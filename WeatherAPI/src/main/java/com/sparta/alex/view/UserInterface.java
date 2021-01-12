package com.sparta.alex.view;

import java.util.Scanner;

public class UserInterface {

	public static String getLocation(){
		System.out.println("Enter location:");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}




}
