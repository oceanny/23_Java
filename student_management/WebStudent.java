package com.java.dto;

import com.java.inter.Loginable;

// class가 Student이면서 Loginable이 이용 가능하도록 지정됨
// abstract가 없으면 오류 발생 (Loginable을 정확히 구현해야해서)
public abstract class WebStudent extends Student implements Loginable{
	
	private String id;
	private String pwd;
	
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
