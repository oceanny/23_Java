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
//			add �ϸ� ������� �ԷµǹǷ� set�� �ؼ� ���� �ٲ�
			int index = (int)(Math.random() * 44 + 1);
			int temp = (Integer)lotto.get(0);
			lotto.set(0, lotto.get(index));
			lotto.set(index, temp);
		}
		
//		0���� 5�������� ����Ϸ��� (0, 6)���� �Է��ؾ���
		List result = lotto.subList(0, 6);
		System.out.println(result);
		
//		list �������� ����
		Collections.sort(result);
		System.out.println(result);
//		list �������� ����
		Collections.reverse(result);
		System.out.println(result);
		
	}

}
