package com.java.classes;

import java.util.StringTokenizer;

public class TestString {

	public static void main(String[] args) {
		
		String str = "123456789ABCDEFGHIJKLNMOPQRSTUVWXYZabcdefghijklnmopqrstuvwxyz";
		
		System.out.println(str.charAt(3));
		System.out.println(str.contains("abcd"));
		System.out.println(str.equals("123"));
		
		String str1 = "abc";
		String str2 = "aBC";
		
		System.out.println(str1.contentEquals(str2));
//		대소문자 구분하지 않고 문자열 비교
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str.indexOf("RS"));
		System.out.println(str.isEmpty());
		
		String str3 = "123abc123";
		System.out.println(str3.indexOf("123"));
//		뒤부터 찾음
		System.out.println(str3.lastIndexOf("123"));
		
		System.out.println(str.length());
//		replace는 원래 문자열을 바꾸지 않고 처리된 문자열을 반환한다
		System.out.println(str3.replace("abc", "cba"));
		System.out.println(str3);
		
		String str4 = "010-1234-5678";
		String[] split = str4.split("-");
		
//		확장 for문 -> 타입 변수명 : 배열 또는 컬렉션 -> 하나씩 순서대로 변수에 저장됨
		for (String a : split) {
			System.out.println(a);
		}
		
		System.out.println(str.substring(9));
		System.out.println(str.substring(0, 9));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str5 = " 123 abc 123  ";
//		앞뒤 여백 삭제 (중간 여백은 그대로)
		System.out.println(str5.trim());
		
		String str6 = "국어,영어,수학,과학,도덕,사회,미술,체육";
		StringTokenizer token = new StringTokenizer(str6, ",");
		while(token.hasMoreElements()) {
			System.out.println(token.nextElement());
		}
	}

}
