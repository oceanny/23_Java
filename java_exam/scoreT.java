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
	
//	메뉴 선택
	public int menu() {
		System.out.println("------------------------------------------------------");
		System.out.println("1.학생수 │ 2.점수입력 │ 3.점수리스트 │ 4.분석 │ 5.종료");
		System.out.println("------------------------------------------------------");
		System.out.print("선택> ");
		menu = scan.nextInt();
		return menu;
	}
	
//	학생 수 입력
	public int stuN() {
		System.out.print("학생수> ");
		this.stu_num = scan.nextInt();
		return stu_num;
	}
	
//	점수 배열 생성
	public void scoreArr() {
		scores = new int[stu_num];
	}

//	점수 입력
	public int[] scores() {
		for (int i = 0; i < stu_num; i++) {
			System.out.print("scores[" + i + "]> ");
			scores[i] = scan.nextInt();
		}
		return scores;
	}

//	점수 출력
	public void scorePrint() {
		for (int i = 0; i < stu_num; i++) {
			System.out.printf("scores[%d]: %d\n", i, scores[i]);
		}
	}

//	최댓값 계산
	public void max() {
		for (int i = 0; i < stu_num; i++) {
			if (scores[i] > max)
				max = scores[i];
		}
	}

//	총점 계산
	public void total() {
		for (int i = 0; i < stu_num; i++) {
			total += scores[i];
		}
	}

//	평균 점수 계산
	public void avg() {
		avg = total / stu_num;
	}

//	학생 수가 입력되었는지 검사
	public boolean hasData() {
		boolean hasData = false;
		hasData = hasData || (scores != null && scores.length > 0);
		return hasData;
	}

}
