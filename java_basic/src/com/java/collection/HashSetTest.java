package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
//		Set �ν��Ͻ�
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);set.add(1);set.add(1);	// �ߺ����� �ϳ��� �Էµ�
//		set.add('A');
//		set.add("123");
//		set.add(false);
		
//		�Է±����� list�� ���̰� ������ ��½� ���� �߻�
//		������ ���� �Ұ� / ���� ���� ���� ������ ���
//		-> �ߺ��� ���� �뵵�� �ַ� ���
//		���� while �ݺ��� ���
		System.out.println(set);
		
//		Iterator�� ������ ��� �Ұ��� new�� ȣ�� X
//		Iterator it = new Iterator();
		Iterator<Integer> it = set.iterator();	// ������ �������� ���
		while(it.hasNext()) {
//			������ ������ �Ұ������� <Integer>�� object���� integer�� �ٲ㼭 ���� ��������
			System.out.println(it.next() + 1);
		}
		
		System.out.println(set.size());
		
	}

}
