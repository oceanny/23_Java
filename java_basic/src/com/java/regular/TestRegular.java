package com.java.regular;

import java.util.regex.Pattern;

public class TestRegular {

	public static void main(String[] args) {
		
//		\d : 숫자 -> [0-9]와 동일
		String regularForm = "^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";
		
		String testStr1 = "123456789";
		String testStr2 = "010-1234-5678";
		
//		String.matches()
		System.out.println(testStr1.matches(regularForm));
		System.out.println(testStr2.matches(regularForm));
		
//		Pattern.matches()
		System.out.println(Pattern.matches(regularForm, testStr1));
		System.out.println(Pattern.matches(regularForm, testStr2));
		
		
		
	}

}
