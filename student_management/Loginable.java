package com.java.inter;

public interface Loginable {
	
//	�����ڸ� �������� ������ public abstract�� �ڵ� �����ȴ�
//	public abstract���� �ְ� ���� ������ default�� �ο��ؾ� �Ѵ�
//	class�� field�� ������ interface�� ���� (��� ��ü�� ���� ����)
	boolean login(String id, String pwd);
	
}