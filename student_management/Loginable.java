package com.java.inter;

public interface Loginable {
	
//	제한자를 지정하지 않으면 public abstract로 자동 지정된다
//	public abstract으로 주고 싶지 않으면 default를 부여해야 한다
//	class는 field가 있지만 interface는 없다 (고민 자체를 하지 않음)
	boolean login(String id, String pwd);
	
}