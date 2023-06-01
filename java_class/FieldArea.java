package com.java.classes;

public class FieldArea {
	
	int k = 100;
//	float k; 선언 불가. 변수명이 같기 때문.
	
//	메소드명이 같아서 선언 불가
//	-> System.out.print : str, int, float 모두 출력 가능
//	-> 메소드는 다르지만 메소드명이 같아서 사용 가능
//	overloading : 한 클래스 내에서 타입별로 같은 기능을 하도록 함
	public void  print() {
		int k = 10;
		System.out.println(k); // 가장 가까운 k를 출력하기 때문에 값 입력하지 않으면 오류 발생함
		System.out.println(this.k); // 메소드에서 선언된 인스턴스 변수의 값 출력
	}
//	private void  print() {
//		int k = 100;
//		System.out.println();
//	}
//	public int print() {
//		return 0;
//	}
	
	
	public static void main(String[] args) {
		
		new FieldArea().print();
		
	}
}