package com.java.classes;

import java.util.Scanner;

public class TestReturn {

	public static void main(String[] args) {
		new TestReturn().a();
	}
	
	public void a() {
		System.out.println("a() start");
//		return type이 void여도 return을 주지 못하는 것은 아님
		System.out.println(b());
		System.out.println("a() end");
		return;
//		return으로 인해 도달하지 못하므로 컴파일 에러 발생
//		System.out.println("After return");
	}
	
	public int b() {
		System.out.println("b() start");
		c();
		System.out.println("b() end");
//	return type이 int이므로 int형을 return해야 오류가 발생하지 않음
		return 1;
	}
	
	public void c() {
		System.out.println("c() start");
		new Scanner(System.in).nextLine();
		System.out.println("c() end");
	}
	
	public void d() {
		
	}
	

}
