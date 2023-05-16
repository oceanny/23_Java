package com.java.variable;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		
		int kor, eng, math, scien;
		int total;
		float avg;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오.");
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		math = scan.nextInt();
		System.out.print("과학 : ");
		scien = scan.nextInt();
		//점수 값이 제대로 입력되도록 유효성 장치를 해야함
		
		/*kor = 95; eng = 65; math = 75; scien = 80;*/
		total = (kor + eng + math + scien);
		avg = (total * 10 / 4) / 10f;
		//쓰레기값 방지 위함
		
		/*System.out.println("국어\t영어\t수학\t과학");
		System.out.printf("%d\t%d\t%d\t%d\n", kor, eng, math, scien);*/
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		//5/18 조건문 수업
		char score = ' ';
		if (avg >= 90) score = 'A';
		else if (avg >= 80)	score = 'B';
		else if (avg >= 70) score = 'C';
		else if (avg >= 60) score = 'D';
		else score = 'F';
		//if 뒤의 진행사항이 한 줄이면 {} 생략 가능
		
		System.out.println("학점 : " + score);
		scan.close();
		
	}

}
