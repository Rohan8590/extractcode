package com.nagarro.extractcode.dao;

public class AccessTokenDetails {

	String state;
	String id_token;
	String code;
	String scope;

	public AccessTokenDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccessTokenDetails(String state, String id_token, String code, String scope) {
		super();
		this.state = state;
		this.id_token = id_token;
		this.code = code;
		this.scope = scope;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getId_token() {
		return id_token;
	}

	public void setId_token(String id_token) {
		this.id_token = id_token;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

}
