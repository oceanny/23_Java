package com.java.statement;

public class ForSet {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 4, 5, 6 ,7};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("-----------");
		
		//�迭 �׸� �ݺ��� ���� for�� ����
		for (int i : num) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		//&& �������� ó�� ���� -> null�� ���� ������ ���� ���� �����ؾ� ��
		int k = 3;
		boolean result;
		//false && false -> �� �κ� �Ǵ� X
		result = k > 5 && (k = 7) < 5;
		System.out.println(result);
		System.out.println(k);
		//true && false -> �� �κ� �Ǵ� O
		result = k < 5 && (k = 7) < 5;
		System.out.println(result);
		System.out.println(k);
		//false && false -> �� �κ� �Ǵ� X
		result = (k = 7) < 5 && k > 5;
		System.out.println(result);
		System.out.println(k);
		
		//���� �ƶ����� ||�� ��쿡�� �� �κ��� false�� ���� �� �κ� �Ǵ�
		
	}

}
