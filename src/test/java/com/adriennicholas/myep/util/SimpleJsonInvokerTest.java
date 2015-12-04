package com.adriennicholas.myep.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleJsonInvokerTest {
	
	private SimpleJsonInvoker simpleJsonInvoker;

	@Before
	public void setUp() throws Exception {
		simpleJsonInvoker = new SimpleJsonInvoker();
	}

	@Test
	public void testGetEthBalance() {
		simpleJsonInvoker.getEthBalance("account");
	}
	
	@Test
	public void testGetTransactionCount(){
		simpleJsonInvoker.getTransactionCount("account");
	}

}
