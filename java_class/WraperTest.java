package com.java.wraper;

public class WraperTest {

	public static void main(String[] args) {
		
		String target1 = "123";
		String target2 = new String("123");
		
//		String ���� ���¿� ���� �����ص� ���� ������ ����
//		Integer i = 123;
//		Integer ii = new Integer(123);
		
//		Integer�� ���ڿ��� ���������� �ٲ� �� ��� (������ int)
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
