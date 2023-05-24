package com.java.quiz;

import java.util.Scanner;

public class ArrayQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//임의의 학생 수 설정
		System.out.printf("학생 수를 입력 : ");
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
			System.out.printf("학생 %d번의 성적 data를 입력하시오.\n", i + 1);
			System.out.printf("학생 %d번 이름 : ", i + 1);
			name[i] = sc.next();
			System.out.printf("학생 %d번 국어점수 : ", i + 1);
			kor[i] = sc.nextInt();
			System.out.printf("학생 %d번 영어점수 : ", i + 1);
			eng[i] = sc.nextInt();
			System.out.printf("학생 %d번 수학점수 : ", i + 1);
			math[i] = sc.nextInt();
			System.out.printf("학생 %d번 과학점수 : ", i + 1);
			sci[i] = sc.nextInt();
		}
		
		
		String[] label = {"번호", "이름", "국어", "영어", "수학", "과학", "총점", "평균"};
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
