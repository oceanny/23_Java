package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListLotto {

	public static void main(String[] args) {
		
		List lotto = new ArrayList();
		
		for (int i = 1; i < 46; i++) {
			lotto.add(i);
		}
		
		for (int i = 0; i < lotto.size() * 100; i++) {
//			add 하면 순서대로 입력되므로 set을 해서 값을 바꿈
			int index = (int)(Math.random() * 44 + 1);
			int temp = (Integer)lotto.get(0);
			lotto.set(0, lotto.get(index));
			lotto.set(index, temp);
		}
		
//		0부터 5번지까지 출력하려면 (0, 6)으로 입력해야함
		List result = lotto.subList(0, 6);
		System.out.println(result);
		
//		list 오름차순 정렬
		Collections.sort(result);
		System.out.println(result);
//		list 내림차순 정렬
		Collections.reverse(result);
		System.out.println(result);
		
	}

}
