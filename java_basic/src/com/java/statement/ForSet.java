package com.java.statement;

public class ForSet {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 4, 5, 6 ,7};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("-----------");
		
		//배열 항목 반복을 위한 for문 형식
		for (int i : num) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		//&& 연산자의 처리 과정 -> null에 관한 조건을 제일 먼저 제시해야 함
		int k = 3;
		boolean result;
		//false && false -> 뒷 부분 판단 X
		result = k > 5 && (k = 7) < 5;
		System.out.println(result);
		System.out.println(k);
		//true && false -> 뒷 부분 판단 O
		result = k < 5 && (k = 7) < 5;
		System.out.println(result);
		System.out.println(k);
		//false && false -> 뒷 부분 판단 X
		result = (k = 7) < 5 && k > 5;
		System.out.println(result);
		System.out.println(k);
		
		//같은 맥락으로 ||의 경우에는 앞 부분이 false일 때만 뒷 부분 판단
		
	}

}
