package com.java.quiz;

import java.util.Scanner;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		
		//선언
		String[] label;
		int[] num;
		String[] name;
		int[][] score;
		int[] total;
		float[] avg;
		
		final int STUDENT_NUM;
		final int SCORE_NUM;;
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("학생 수를 입력 : ");
		STUDENT_NUM = sc.nextInt();sc.nextLine();
		System.out.print("평가 과목수 : ");
		SCORE_NUM = sc.nextInt();sc.nextLine();
		
		//변수 초기화
		label = new String[SCORE_NUM + 4];
		num = new int[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		score = new int[SCORE_NUM][STUDENT_NUM];
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		//변수 배정
		for (int i = 0; i < STUDENT_NUM; i++) {
			num[i] = i + 1;
		}
		
		label[0] = "번호"; label[1] = "이름";
		for (int i = 1; i <= SCORE_NUM; i++) {
			System.out.printf("\n%d번 과목명 : ", i);
			label[i + 1] = sc.nextLine();
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d.%s\t", j, label[j + 1]);
			}
		}
		label[SCORE_NUM + 2] = "총점"; label[SCORE_NUM + 3] = "평균";
		
		System.out.println("\n---------------------------------------------");
		
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.printf("학생 %d번의 성적 data를 입력하시오.\n", num[i]);
			System.out.printf("학생 %d번 이름 : ", num[i]);
			name[i] = sc.nextLine();
			
			for (int j = 0; j < SCORE_NUM; j++) {
				System.out.printf("학생 %d번 %s점수 : ", num[i], label[j + 2]);
				score[j][i] = sc.nextInt();sc.nextLine();
				}
		}
		
		System.out.println("---------------------------------------------");
		
		
		//출력
		for (int i = 0; i < label.length; i++) {
			System.out.printf("%s\t", label[i]);
		}
		
		for (int i = 0; i < STUDENT_NUM; i++) {
			for (int j = 0; j < SCORE_NUM; j++) {
				total[i] = total[i] + score[j][i];
			}
			avg[i] = (total[i] * 10 / (float)SCORE_NUM) / 10;
			}
		
		//data 출력
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.printf("\n%d\t%s\t", num[i], name[i]);
			for (int j = 0; j < SCORE_NUM; j++) {
				System.out.printf("%d\t", score[j][i]);
			}
			System.out.printf("%d\t%f", total[i], avg[i]);
		}

	}

}
