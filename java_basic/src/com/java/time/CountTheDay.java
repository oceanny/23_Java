package com.java.time;

import java.time.LocalDate;
import java.util.Scanner;

public class CountTheDay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하시오. (형식 : yyyyMMdd)");
		String input = sc.nextLine();
		
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(4, 6));
		int day = Integer.parseInt(input.substring(6, 8));
		
		LocalDate today = LocalDate.now();
		int yearD = year - today.getYear();
		int monthD = month - today.getMonthValue();
		int dayD = day - today.getDayOfMonth();
		
		int Diff = yearD * 365 + monthD * 30 + dayD;
		System.out.println(Diff + "일 만큼 지났습니다");
		
	}

}
