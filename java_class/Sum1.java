package com.java.classes;

public class Sum1 {
	
//	public int a;
//	public int b;
//	
//	public int sum(int c, int d) {
//		return a + b + c + d;
//	}
//	
//	public static int sum(int c, int d, int e) {
//		return c + d + e;
//	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int sum(int ...a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
}