package com.adriennicholas.myep.domain.yahoo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fields {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("price")
	@Expose
	private String price;
	@SerializedName("symbol")
	@Expose
	private String symbol;
	@SerializedName("ts")
	@Expose
	private String ts;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("utctime")
	@Expose
	private String utctime;
	@SerializedName("volume")
	@Expose
	private String volume;

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 *            The price
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * 
	 * @return The symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * 
	 * @param symbol
	 *            The symbol
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * 
	 * @return The ts
	 */
	public String getTs() {
		return ts;
	}

	/**
	 * 
	 * @param ts
	 *            The ts
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The utctime
	 */
	public String getUtctime() {
		return utctime;
	}

	/**
	 * 
	 * @param utctime
	 *            The utctime
	 */
	public void setUtctime(String utctime) {
		this.utctime = utctime;
	}

	/**
	 * 
	 * @return The volume
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * 
	 * @param volume
	 *            The volume
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

}
