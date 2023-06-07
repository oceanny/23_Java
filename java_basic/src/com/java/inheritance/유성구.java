package com.java.inheritance;

import java.util.Scanner;

public class 유성구 extends 지도 {
	
	private String[] 동;
	private String[] 번;
	private String[] 지;
	
	private void 동검색(String 동) {
//		주소에 동 추가
		super.주소 += 동;
	}
	
	private void 번검색(String 번) {
//		주소에 동 추가
		super.주소 += 번;
	}
	private void 지검색(String 지) {
//		주소에 동 추가
		super.주소 += 지;
	}

	@Override
	public String 주소() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("동 을 입력 : ");
		String input_동 = sc.nextLine() + "\t";
		System.out.print("번 을 입력 : ");
		String input_번 = sc.nextLine() + "\t";
		System.out.print("지 를 입력 : ");
		String input_지 = sc.nextLine() + "\t";

		동검색(input_동);
		번검색(input_번);
		지검색(input_지);
		
		return super.주소();
	}

	public String[] get동() {
		return 동;
	}

	public String[] get번() {
		return 번;
	}

	public String[] get지() {
		return 지;
	}
	
	
	
}