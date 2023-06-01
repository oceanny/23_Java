package com.java.classes;

public class Main {

	public static void main(String[] args) {
//		인스턴스
//		ClassCreateTest ins = new ClassCreateTest();
//		
//		//->filed
//		ins.a = 1;
//		ins.b = 2;
//		//filed<-
//		
//		System.out.println(ins.a);
		
		Car car = new Car();
		System.out.println(car.speed);
		
		car.up();car.up();car.up();
		System.out.println(car.speed);
		
		car.down();car.down();
		System.out.println(car.speed);
		
		Sum1 sum = new Sum1();
		
		System.out.println(sum.sum(1, 1));
		System.out.println(sum.sum(1, 1, 1));
		System.out.println(sum.sum(1, 1, 1, 1));
		System.out.println(sum.sum(1, 1, 1, 1, 1));
		
		int[] data = {1, 1, 1, 1, 1, 1};
		System.out.println(sum.sum(data));
		
	}

}
