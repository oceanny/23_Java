package com.java.inheritance;

import java.util.Scanner;

public class �ּҸ��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String menu = null;
//		���� map = null;

		System.out.println("1. ������2. �á�3. ����4. ����5. ����");
		System.out.println("�ּ� �˻� ������ �Է�");
		menu = sc.nextLine();
		
//		������ �� �������� ������ map�� ����Ű�� �� ���� �������� �ƴϰ� ������ ���� �߻���
//		���� map = new ����();
//		�������� ���� �̻� ������ Ŭ������ ����Ǿ�� ��
//		ex) ���ѹα� map = new ����();
		���� map = new ������();
		map.get�ּ�();
		((������)map).get��();
		
		switch (menu) {
		case "1":
			map =  new ����();
			break;
		case "2":
			map = new ���ѹα�();
			break;
		case "3":
			map = new ����();
			break;
		case "4":
			map = new ������();
			break;
		case "5":
			break;
		default:
		}

//		������ ã��
//		���� map1 = new ������();

		System.out.println(map.�ּ�());
		
//		map�� ����Ű�� �ν��Ͻ��� �������� ���� ���� ���θ� true / false�� ���
//		instanceof Object�� ������ true : ��� Ŭ������ ���� Ŭ����
		System.out.println("������ �ν��Ͻ� : " + (map instanceof ������));
		
	}

}
