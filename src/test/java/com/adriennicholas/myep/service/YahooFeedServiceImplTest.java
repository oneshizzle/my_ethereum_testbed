package com.adriennicholas.myep.service;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.adriennicholas.myep.service.impl.YahooFeedServiceImpl;

public class YahooFeedServiceImplTest {
	
	private static Logger logger = Logger.getLogger(YahooFeedServiceImplTest.class
			.getName());


	IFeedService yahooFeedService = new YahooFeedServiceImpl();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPrice() {
		Double price = yahooFeedService.getPrice("GE");
		logger.info(price);
		assertNotNull(price);
	}

}
