package com.java.quiz;

import java.util.Scanner;

public class ArrayQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//������ �л� �� ����
		System.out.printf("�л� ���� �Է� : ");
		int n = sc.nextInt();
		String line = sc.nextLine();
		int[] num = new int [n];
		for (int i = 0; i < n; i++) {
			num[i] = i + 1;
		}
		
		String[] name =  new String [n];
		int[] kor = new int [n];
		int[] eng = new int [n];
		int[] math = new int [n];
		int[] sci = new int [n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.printf("�л� %d���� ���� data�� �Է��Ͻÿ�.\n", i + 1);
			System.out.printf("�л� %d�� �̸� : ", i + 1);
			name[i] = sc.next();
			System.out.printf("�л� %d�� �������� : ", i + 1);
			kor[i] = sc.nextInt();
			System.out.printf("�л� %d�� �������� : ", i + 1);
			eng[i] = sc.nextInt();
			System.out.printf("�л� %d�� �������� : ", i + 1);
			math[i] = sc.nextInt();
			System.out.printf("�л� %d�� �������� : ", i + 1);
			sci[i] = sc.nextInt();
		}
		
		
		String[] label = {"��ȣ", "�̸�", "����", "����", "����", "����", "����", "���"};
		for (int i = 0; i < label.length; i++) {
			System.out.printf("%s\t", label[i]);
		}
		
		int[] total = new int[n];
		float[] avg = new float[n];for (int i = 0; i < n; i++) {
			total[i] = kor[i] + eng[i] + math[i] + sci[i];
			avg[i] = (total[i] * 10 / 4) / 10f;
			System.out.printf("\n%d\t%s\t%d\t%d\t%d\t%d\t%d\t%f", num[i], name[i], kor[i], eng[i], math[i], sci[i], total[i], avg[i]);
		}
		
	}

}
