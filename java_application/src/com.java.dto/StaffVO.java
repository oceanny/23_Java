package com.java.dto;

public class StaffVO implements Comparable<StaffVO> {
	
	private String staffNum;
	private String name;
	private String pwd;
	private String phone;
	private int position;
	private int state;
	
	
	public String getStaffNum() {
		return staffNum;
	}
	public void setStafNum(String staffNum) {
		this.staffNum = staffNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	@Override
	public int compareTo(StaffVO o) {
		return this.staffNum.compareTo(o.getStaffNum());
	}
	@Override
	public int hashCode() {
		return this.staffNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof StaffVO) {
			StaffVO other = (StaffVO)obj;
			result = this.staffNum.equals(other.getStaffNum());
		}
		return result;
	}
	@Override
	public String toString() {
		return this.staffNum + "," + this.name + "," + this.phone;
	}
	
}
