package com.adriennicholas.myep.domain.yahoo;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Resource_ {

	@SerializedName("classname")
	@Expose
	private String classname;
	@SerializedName("fields")
	@Expose
	private Fields fields;

	/**
	 * 
	 * @return The classname
	 */
	public String getClassname() {
		return classname;
	}

	/**
	 * 
	 * @param classname
	 *            The classname
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}

	/**
	 * 
	 * @return The fields
	 */
	public Fields getFields() {
		return fields;
	}

	/**
	 * 
	 * @param fields
	 *            The fields
	 */
	public void setFields(Fields fields) {
		this.fields = fields;
	}

}
