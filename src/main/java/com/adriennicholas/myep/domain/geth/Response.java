package com.adriennicholas.myep.domain.geth;

public class Response {
	private Integer id;
	private String jsonrpc;
	private Object result;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJsonrpc() {
		return jsonrpc;
	}
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}

}
