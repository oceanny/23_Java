package com.java.time;

import java.time.LocalDate;
import java.util.Scanner;

public class AddTheDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하시오. (형식 : yyyyMMdd)");
		String input = sc.nextLine();
		System.out.println("추가할 일수를 입력하시오. (형식 : n)");
		int n = sc.nextInt();
		
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(4, 6));
		int day = Integer.parseInt(input.substring(6, 8));
		
		int yearD = year + n / 365;
		int monthD = month + n % 365 / 30;
		int dayD = day + n % 365 % 31;
		
		if (dayD > 31) {
			monthD += 1;
			dayD -= 31;
		}
		
		if (monthD > 12) {
			yearD += 1;
			monthD -= 12;
		}
		
		LocalDate theDay = LocalDate.of(yearD, monthD, dayD);
		System.out.println(theDay);

	}

}
