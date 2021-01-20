package com.sparta.alex;

import com.sparta.alex.controller.LocationManager;
import com.sparta.alex.view.UserInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(LocationManager.processLocation(UserInterface.getLocation()));
    }
}
