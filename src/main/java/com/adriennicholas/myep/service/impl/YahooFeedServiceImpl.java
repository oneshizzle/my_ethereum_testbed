package com.adriennicholas.myep.service.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

import com.adriennicholas.myep.domain.yahoo.YahooQuote;
import com.adriennicholas.myep.service.IFeedService;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class YahooFeedServiceImpl implements IFeedService {

	private static Logger logger = Logger.getLogger(YahooFeedServiceImpl.class
			.getName());

	public Double getPrice(String symbol) {
		String uri = "http://finance.yahoo.com/webservice/v1/symbols/" + symbol
				+ "/quote?format=json";
		URL url;
		JsonReader reader = null;
		try {
			url = new URL(uri);

			reader = new JsonReader(new InputStreamReader(url.openStream()));
			Double price = -1.0;
			Gson gson = new Gson(); 
			final YahooQuote yQuote = gson.fromJson(reader, YahooQuote.class);
			price = new Double(yQuote.getList().getResources().get(0).getResource().getFields().getPrice());
			return price;
		} catch (MalformedURLException e) {
			logger.error("Malformed URL Exception", e);
		} catch (IOException e) {
			logger.error("IOException", e);
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					logger.error("IOException", e);
				}
			}
		}

		return 0.0;
	}
}
