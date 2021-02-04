package com.sparta.alex;

import com.sparta.alex.controller.ConnectionManager;
import com.sparta.alex.controller.Injector;
import com.sparta.alex.controller.URLBuilder;
import com.sparta.alex.model.LocationDTO;
import com.sparta.alex.model.WeatherDTO;
import com.sparta.alex.view.UserInterface;


public class App 
{
    public static void main (String[] args)
    {
        //TODO: structure just for initial => put this in another method

        String locationEntered = URLBuilder.processLocation(UserInterface.getLocation());
        String searchURL = URLBuilder.buildLocationSearchURL(locationEntered);

        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.connectToApi(searchURL);

        LocationDTO[] locations = Injector.injectIntoLocationSearch(connectionManager.getJsonBody());
        LocationDTO selectedLocation = null;

        if(locations.length > 1){
            int index = UserInterface.chooseLocation(locations);
            selectedLocation = locations[index];
        }else if(locations.length == 0) {
            System.out.println("Location not found!");
        }else{
            selectedLocation = locations[0];
        }

        String weatherFromLocation = URLBuilder.buildLocationURL(selectedLocation.getWoeid());
        connectionManager.connectToApi(weatherFromLocation);

        WeatherDTO weatherDTO = Injector.injectIntoWeather(connectionManager.getJsonBody());

        UserInterface.chooseWeatherOption(weatherDTO);



    }
}
