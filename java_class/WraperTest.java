package com.java.wraper;

public class WraperTest {

	public static void main(String[] args) {
		
		String target1 = "123";
		String target2 = new String("123");
		
//		String 선언 형태와 같이 선언해도 문제 없지만 지양
//		Integer i = 123;
//		Integer ii = new Integer(123);
		
//		Integer는 문자열을 숫자형으로 바꿀 때 사용 (선언은 int)
		int i = Integer.parseInt(target1);
		int ii = Integer.parseInt(target2);
		
		int sum_int = i + ii;
		
		target1 = "123.5";
		target2 = new String("123.5");
		
		float f = Float.parseFloat(target1);
		float ff = Float.parseFloat(target2);
		float sum_float = f + ff;
		
		System.out.println(i);
		System.out.println(ii);
		System.out.println(sum_int);
		
		System.out.println(f);
		System.out.println(ff);
		System.out.println(sum_float);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
	}

}
