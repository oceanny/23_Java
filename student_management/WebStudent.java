package com.java.dto;

import com.java.inter.Loginable;

// class�� Student�̸鼭 Loginable�� �̿� �����ϵ��� ������
// abstract�� ������ ���� �߻� (Loginable�� ��Ȯ�� �����ؾ��ؼ�)
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
