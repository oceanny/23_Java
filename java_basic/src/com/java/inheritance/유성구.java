package com.java.inheritance;

import java.util.Scanner;

public class ������ extends ���� {
	
	private String[] ��;
	private String[] ��;
	private String[] ��;
	
	private void ���˻�(String ��) {
//		�ּҿ� �� �߰�
		super.�ּ� += ��;
	}
	
	private void ���˻�(String ��) {
//		�ּҿ� �� �߰�
		super.�ּ� += ��;
	}
	private void ���˻�(String ��) {
//		�ּҿ� �� �߰�
		super.�ּ� += ��;
	}

	@Override
	public String �ּ�() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� �Է� : ");
		String input_�� = sc.nextLine() + "\t";
		System.out.print("�� �� �Է� : ");
		String input_�� = sc.nextLine() + "\t";
		System.out.print("�� �� �Է� : ");
		String input_�� = sc.nextLine() + "\t";

		���˻�(input_��);
		���˻�(input_��);
		���˻�(input_��);
		
		return super.�ּ�();
	}

	public String[] get��() {
		return ��;
	}

	public String[] get��() {
		return ��;
	}

	public String[] get��() {
		return ��;
	}
	
	
	
}