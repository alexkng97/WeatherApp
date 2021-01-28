package com.sparta.alex.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {

	private HttpClient httpClient;
	private HttpRequest httpRequest;
	private HttpResponse httpResponse;

	public ConnectionManager(){ }

	public void connectToApi(String url){
		try {
			httpClient = HttpClient.newHttpClient();
			httpRequest = HttpRequest.newBuilder().uri(new URI(url)).build();
			httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
