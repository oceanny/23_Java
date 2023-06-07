package com.java.inheritance;

import java.util.Scanner;

public class 세계 extends 대한민국 {
	
	private String[] 국적;
	
	public void 국적검색(String 국가) {
		super.주소 += 국가;
	}

	@Override
	public String 주소() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국가 를 입력 : ");
		String input_국가 = sc.nextLine() + "\t";
		
		국적검색(input_국가);
		
		return super.주소();
	}

	public String[] get국적() {
		return 국적;
	}
	
}
