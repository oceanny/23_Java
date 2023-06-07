package com.java.dto;

public abstract class WebStudent extends Student {
	
	private String id;
	private String pwd;
	
	public abstract boolean login(String id, String pwd);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
