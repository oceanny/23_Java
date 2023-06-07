package com.java.quiz;

public class Lotto {

	public static void main(String[] args) {
		
		// �̱� ��� -> �� 0�� ���ñ�???
		//���� �ʱ�ȭ
		int[] num = new int[45];
		int[] dup = new int[6];
		
		//�迭�� ���� ����
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i = 0; i < 6; i++) {
			//0~44 ���� ���� �߻�
			int random = (int)(Math.random() * num.length);
			if (num[random] == 0) continue;
			dup[i] = num[random];
			num[random] = 0;
		}
		
		//���
		System.out.print("[\t");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", dup[i]);
			}
		System.out.print("]\n");
		
		
		
		//���� ���
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i = 0; i < num.length * 100; i++) {
			int random = (int)(Math.random() * num.length);
			int temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		System.out.print("[\t");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", num[i]);
			}
		System.out.print("]");
	}

}
