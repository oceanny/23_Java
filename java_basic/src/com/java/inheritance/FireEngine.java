package com.java.inheritance;

public class FireEngine extends Car {
//	FireEngine is a Car
//	this : FireEngine, super : Car
	private int accelerate = super.getAccelerate();
	private int water = 1000;
	
	
	public int shower() {
		this.water = this.water - 10;
		return water;
	}

	public void addWater(int water) {
		this.water = this.water + water;
	}

	public int getWater() {
		return water;
	}
		
	@Override
	public void speedUp() {
//	��������� this.accelerate��� �ۼ��ص� ����
		accelerate = accelerate + 3;
//		super.speedUp();
	}

	@Override
	public int getAccelerate() {
		return this.accelerate;
	}

//	@Override : ������ ������� �������� �θ� Ŭ������ �ִ� �޼ҵ忩�� ��� ������ 
//	�θ� Ŭ������ �޼ҵ带 �����ε� �� �� ������ ������ �� �о����
//	public void speedUp() {
//		System.out.println("�ӵ��� �ø��ϴ�.");
//	}

}
