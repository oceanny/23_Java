package com.java.inheritance;

import java.util.Scanner;

public class 대한민국 extends 대전 {
	
	private String[] 시;
	
	public void 시검색(String 시) {
		super.주소 += 시;
	}

	@Override
	public String 주소() {
		Scanner sc = new Scanner(System.in);

		System.out.print("시 를 입력 : ");
		String input_시 = sc.nextLine() + "\t";
		
		시검색(input_시);
		
		return super.주소();
	}

	public String[] get시() {
		return 시;
	}
	
}
