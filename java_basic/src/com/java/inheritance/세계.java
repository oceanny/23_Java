package com.java.inheritance;

import java.util.Scanner;

public class ���� extends ���ѹα� {
	
	private String[] ����;
	
	public void �����˻�(String ����) {
		super.�ּ� += ����;
	}

	@Override
	public String �ּ�() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �� �Է� : ");
		String input_���� = sc.nextLine() + "\t";
		
		�����˻�(input_����);
		
		return super.�ּ�();
	}

	public String[] get����() {
		return ����;
	}
	
}
