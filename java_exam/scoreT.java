package com.java.exam;

import java.util.Scanner;

public class scoreT {

	int menu;
	int stu_num;
	int[] scores = {};
	int max = 0;
	int total = 0;
	float avg;

	Scanner scan = new Scanner(System.in);
	
//	�޴� ����
	public int menu() {
		System.out.println("------------------------------------------------------");
		System.out.println("1.�л��� �� 2.�����Է� �� 3.��������Ʈ �� 4.�м� �� 5.����");
		System.out.println("------------------------------------------------------");
		System.out.print("����> ");
		menu = scan.nextInt();
		return menu;
	}
	
//	�л� �� �Է�
	public int stuN() {
		System.out.print("�л���> ");
		this.stu_num = scan.nextInt();
		return stu_num;
	}
	
//	���� �迭 ����
	public void scoreArr() {
		scores = new int[stu_num];
	}

//	���� �Է�
	public int[] scores() {
		for (int i = 0; i < stu_num; i++) {
			System.out.print("scores[" + i + "]> ");
			scores[i] = scan.nextInt();
		}
		return scores;
	}

//	���� ���
	public void scorePrint() {
		for (int i = 0; i < stu_num; i++) {
			System.out.printf("scores[%d]: %d\n", i, scores[i]);
		}
	}

//	�ִ� ���
	public void max() {
		for (int i = 0; i < stu_num; i++) {
			if (scores[i] > max)
				max = scores[i];
		}
	}

//	���� ���
	public void total() {
		for (int i = 0; i < stu_num; i++) {
			total += scores[i];
		}
	}

//	��� ���� ���
	public void avg() {
		avg = total / stu_num;
	}

//	�л� ���� �ԷµǾ����� �˻�
	public boolean hasData() {
		boolean hasData = false;
		hasData = hasData || (scores != null && scores.length > 0);
		return hasData;
	}

}
