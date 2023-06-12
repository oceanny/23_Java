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
//		��ҹ��� �������� �ʰ� ���ڿ� ��
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str.indexOf("RS"));
		System.out.println(str.isEmpty());
		
		String str3 = "123abc123";
		System.out.println(str3.indexOf("123"));
//		�ں��� ã��
		System.out.println(str3.lastIndexOf("123"));
		
		System.out.println(str.length());
//		replace�� ���� ���ڿ��� �ٲ��� �ʰ� ó���� ���ڿ��� ��ȯ�Ѵ�
		System.out.println(str3.replace("abc", "cba"));
		System.out.println(str3);
		
		String str4 = "010-1234-5678";
		String[] split = str4.split("-");
		
//		Ȯ�� for�� -> Ÿ�� ������ : �迭 �Ǵ� �÷��� -> �ϳ��� ������� ������ �����
		for (String a : split) {
			System.out.println(a);
		}
		
		System.out.println(str.substring(9));
		System.out.println(str.substring(0, 9));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str5 = " 123 abc 123  ";
//		�յ� ���� ���� (�߰� ������ �״��)
		System.out.println(str5.trim());
		
		String str6 = "����,����,����,����,����,��ȸ,�̼�,ü��";
		StringTokenizer token = new StringTokenizer(str6, ",");
		while(token.hasMoreElements()) {
			System.out.println(token.nextElement());
		}
	}

}
