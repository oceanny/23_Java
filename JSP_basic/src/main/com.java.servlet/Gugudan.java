package com.java.servlet;

import java.io.PrintWriter;

public class Gugudan {
	
	public static void exe() {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단 입니다");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
	
	public static void exe(PrintWriter out) {
		for (int i = 2; i < 10; i++) {
			out.println(i + "단 입니다");
			for (int j = 1; j < 10; j++) {
				out.println(i + " * " + j + " = " + i * j);
			}
			out.println();
		}
	}
	
}
