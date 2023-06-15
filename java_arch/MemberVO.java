package com.java.dto;

public class MemberVO {
	
	private String id;
	private String pwd;
	private String phone;
	private String email;
	
	public MemberVO() {}
	public MemberVO(String id, String pwd, String phone, String email) {
		this.id = id;
		this.pwd = pwd;
		this.phone = phone;
		this.email = email;
	}
	
	
	
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
