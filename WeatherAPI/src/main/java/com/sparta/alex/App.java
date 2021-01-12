package com.sparta.alex;

import com.sparta.alex.controller.WeatherDTO;
import com.sparta.alex.view.UserInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(WeatherDTO.processLocation(UserInterface.getLocation()));
    }
}
