package com.adriennicholas.myep.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adriennicholas.myep.domain.geth.Response;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.thetransactioncompany.jsonrpc2.JSONRPC2Request;

public class SimpleJsonInvoker {

	private static final Logger log = LoggerFactory.getLogger("general");

	public void getEthBalance(String account) {
		String method = "eth_getBalance";

		// The required named parameters to pass
		List<Object> params = new ArrayList<Object>();
		// account
		params.add("0xb29d90b17089a9f2616fc83c954ac88fd99e16e1");
		params.add("latest");

		// The mandatory request ID
		String id = "1";

		// Create a new JSON-RPC 2.0 request
		JSONRPC2Request reqOut = new JSONRPC2Request(method, params, id);

		// Serialise the request to a JSON-encoded string
		String jsonString = reqOut.toString();

		log.info(jsonString);

		sendJSON(jsonString);
	}
	
	public void getTransactionCount(String account) {
		String method = "eth_getTransactionCount";

		// The required named parameters to pass
		List<Object> params = new ArrayList<Object>();
		// account
		params.add("0x1560f5c6fb36e257cc6526316735db2b36d3162e");
		params.add("latest");

		// The mandatory request ID
		String id = "1";

		// Create a new JSON-RPC 2.0 request
		JSONRPC2Request reqOut = new JSONRPC2Request(method, params, id);

		// Serialise the request to a JSON-encoded string
		String jsonString = reqOut.toString();

		log.info(jsonString);

		sendJSON(jsonString);
	}

	private Object sendJSON(String payload) {
		Object response = null;
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost("http://127.0.0.1:8545");

			StringEntity input = new StringEntity(payload);
			input.setContentType("application/json");
			postRequest.setEntity(input);

			HttpResponse httpResponse = httpClient.execute(postRequest);
			/**
			 * if (response.getStatusLine().getStatusCode() != 201) { throw new
			 * RuntimeException("Failed : HTTP error code : " +
			 * response.getStatusLine().getStatusCode()); }
			 **/
			JsonReader reader = new JsonReader(new InputStreamReader(
					httpResponse.getEntity().getContent()));
			Gson gson = new Gson();
			final Response gethResponse = gson.fromJson(reader, Response.class);
			String output = (String) gethResponse.getResult();
			log.info(output);

			httpClient.getConnectionManager().shutdown();
			response = (Object) gethResponse.getResult();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			return response;
		}

	}
}