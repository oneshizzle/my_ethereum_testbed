package com.adriennicholas.myep.domain.yahoo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Resource {

	@SerializedName("resource")
	@Expose
	private Resource_ resource;

	/**
	 * 
	 * @return The resource
	 */
	public Resource_ getResource() {
		return resource;
	}

	/**
	 * 
	 * @param resource
	 *            The resource
	 */
	public void setResource(Resource_ resource) {
		this.resource = resource;
	}

}
