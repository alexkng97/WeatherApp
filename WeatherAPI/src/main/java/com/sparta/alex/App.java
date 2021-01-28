package com.sparta.alex;

import com.sparta.alex.controller.ConnectionManager;
import com.sparta.alex.controller.URLBuilder;
import com.sparta.alex.view.UserInterface;


public class App 
{
    public static void main( String[] args )
    {
        String locationEntered = URLBuilder.processLocation(UserInterface.getLocation());
        String searchURL = URLBuilder.buildLocationSearchURL(locationEntered);

        System.out.println(searchURL);
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.connectToApi(searchURL);


        System.out.println(connectionManager.getStatusCode());
        System.out.println(connectionManager.getJsonBody());

    }
}
