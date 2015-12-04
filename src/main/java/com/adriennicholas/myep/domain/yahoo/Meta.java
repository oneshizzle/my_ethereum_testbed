package com.adriennicholas.myep.domain.yahoo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Meta {

	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("start")
	@Expose
	private Integer start;
	@SerializedName("count")
	@Expose
	private Integer count;

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
	 * @return The start
	 */
	public Integer getStart() {
		return start;
	}

	/**
	 * 
	 * @param start
	 *            The start
	 */
	public void setStart(Integer start) {
		this.start = start;
	}

	/**
	 * 
	 * @return The count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * 
	 * @param count
	 *            The count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

}