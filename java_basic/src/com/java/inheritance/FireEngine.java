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
//	명시적으로 this.accelerate라고 작성해도 무방
		accelerate = accelerate + 3;
//		super.speedUp();
	}

	@Override
	public int getAccelerate() {
		return this.accelerate;
	}

//	@Override : 선언이 먼저라고 여겨져서 부모 클래스에 있는 메소드여야 사용 가능함 
//	부모 클래스의 메소드를 오버로딩 할 때 제한자 범위가 더 넓어야함
//	public void speedUp() {
//		System.out.println("속도를 올립니다.");
//	}

}
