package com.java.quiz;

import java.util.Scanner;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		
		//����
		String[] label;
		int[] num;
		String[] name;
		int[][] score;
		int[] total;
		float[] avg;
		
		final int STUDENT_NUM;
		final int SCORE_NUM;;
		
		Scanner sc = new Scanner(System.in);
		
		//�Է�
		System.out.print("�л� ���� �Է� : ");
		STUDENT_NUM = sc.nextInt();sc.nextLine();
		System.out.print("�� ����� : ");
		SCORE_NUM = sc.nextInt();sc.nextLine();
		
		//���� �ʱ�ȭ
		label = new String[SCORE_NUM + 4];
		num = new int[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		score = new int[SCORE_NUM][STUDENT_NUM];
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		//���� ����
		for (int i = 0; i < STUDENT_NUM; i++) {
			num[i] = i + 1;
		}
		
		label[0] = "��ȣ"; label[1] = "�̸�";
		for (int i = 1; i <= SCORE_NUM; i++) {
			System.out.printf("\n%d�� ����� : ", i);
			label[i + 1] = sc.nextLine();
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d.%s\t", j, label[j + 1]);
			}
		}
		label[SCORE_NUM + 2] = "����"; label[SCORE_NUM + 3] = "���";
		
		System.out.println("\n---------------------------------------------");
		
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.printf("�л� %d���� ���� data�� �Է��Ͻÿ�.\n", num[i]);
			System.out.printf("�л� %d�� �̸� : ", num[i]);
			name[i] = sc.nextLine();
			
			for (int j = 0; j < SCORE_NUM; j++) {
				System.out.printf("�л� %d�� %s���� : ", num[i], label[j + 2]);
				score[j][i] = sc.nextInt();sc.nextLine();
				}
		}
		
		System.out.println("---------------------------------------------");
		
		
		//���
		for (int i = 0; i < label.length; i++) {
			System.out.printf("%s\t", label[i]);
		}
		
		for (int i = 0; i < STUDENT_NUM; i++) {
			for (int j = 0; j < SCORE_NUM; j++) {
				total[i] = total[i] + score[j][i];
			}
			avg[i] = (total[i] * 10 / (float)SCORE_NUM) / 10;
			}
		
		//data ���
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.printf("\n%d\t%s\t", num[i], name[i]);
			for (int j = 0; j < SCORE_NUM; j++) {
				System.out.printf("%d\t", score[j][i]);
			}
			System.out.printf("%d\t%f", total[i], avg[i]);
		}

	}

}
