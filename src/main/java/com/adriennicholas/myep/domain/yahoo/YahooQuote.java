package com.adriennicholas.myep.domain.yahoo;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class YahooQuote {

	@SerializedName("list")
	@Expose
	private List list;

	/**
	 * 
	 * @return The list
	 */
	public List getList() {
		return list;
	}

	/**
	 * 
	 * @param list
	 *            The list
	 */
	public void setList(List list) {
		this.list = list;
	}
}
