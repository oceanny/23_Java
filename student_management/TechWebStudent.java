package com.java.dto;

// WebStudent�� ��ӹ����� Student�� Loginable�� ��� ��� ��������
// Student <- WebStudent <- Loginable �̶�� ���赵�� �˸� Student�� ��ӹ޴� �ڵ�� ���� ����
// �׷��� WebStudent���� ������ ��� ������ ���� �������� ����
public class TechWebStudent extends WebStudent{

//	abstract class ��� �� method ���� �ʼ�
	@Override
	public boolean login(String id, String pwd) {
//		TechWebStudent�� getID()�� �����Ƿ� this�� super�� ���� �޼ҵ带 ����Ų��

		boolean result = true;
//		�⺻���� true�̹Ƿ� not �����ڸ� �̿��� false�� ��츸 �ԾƳ���
		if (!(id.equals(super.getId()))) {
			result = result && false;
		}
		
		if (!(pwd.equals(super.getPwd()))) {
			result = result && false;
		}
		
		return result;
	}

}
