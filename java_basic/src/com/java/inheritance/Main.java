package com.java.inheritance;

public class Main {

	public static void main(String[] args) {
		
//		Car car = new Car();
		FireEngine car = new FireEngine(); 
//		FireEngine�� Car�� ����� ����� ����
		
//		private ������ ���� �ְ�(set) ����(get)
		car.setGear(4);
		System.out.println(car.getGear());
		
		System.out.println(car.getAccelerate());
		car.speedUp();
		car.speedUp();
		System.out.println(car.getAccelerate());
		
		car.shower();
		car.shower();
		
		System.out.println(car.getWater());
		
	}
	
}
