package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AddTheDayAns {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		Date theDay = null;
		int afterDay = 0;
		
		while(true) {
			System.out.print("날짜를 입력하시오.(yyyyMMdd):");
			String inputDay = scann.nextLine();
			try {
				theDay = new SimpleDateFormat("yyyyMMdd").parse(inputDay);
				if (inputDay.length() > 8) {
					System.out.println("날짜 형식이 올바르지 않습니다.");
					continue;
				}
				break;
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("날짜 형식이 올바르지 않습니다.");
			}
		}
		
		System.out.print("일수 : ");
		afterDay = scann.nextInt();scann.nextLine();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(theDay);
		cal.add(Calendar.DATE, afterDay);
		
		System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 " + cal.get(Calendar.DATE) + "일 입니다.");
		
	}

}
