package com.java.classes;

import java.util.Scanner;

public class TestReturn {

	public static void main(String[] args) {
		new TestReturn().a();
	}
	
	public void a() {
		System.out.println("a() start");
//		return type�� void���� return�� ���� ���ϴ� ���� �ƴ�
		System.out.println(b());
		System.out.println("a() end");
		return;
//		return���� ���� �������� ���ϹǷ� ������ ���� �߻�
//		System.out.println("After return");
	}
	
	public int b() {
		System.out.println("b() start");
		c();
		System.out.println("b() end");
//	return type�� int�̹Ƿ� int���� return�ؾ� ������ �߻����� ����
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
