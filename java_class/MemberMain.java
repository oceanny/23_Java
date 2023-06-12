package com.java.classes;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {

	public static void main(String[] args) {
		
//		���� ���� : liter ������ �� ����
		String str1 = "123";
		String str2 = "123";
//		new�� ���� ���� : heap ������ ����
		String str3 = new String("123");
		String str4 = new String("123");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		Set strSet = new HashSet();
		strSet.add(str1);
		strSet.add(str2);
		strSet.add(str3);
		strSet.add(str4);
//		���ڿ��� ����Ǳ� ������ "123" �Ѱ��� �����
		System.out.println(strSet);
		
		
		System.out.printf("�� String ��\n�� instance ��\n");
		
		
		Member mem1 = new Member();
		mem1.setId("mimi");
		mem1.setPwd("mimi");		
		
		Member mem2 = new Member();
		mem2.setId("mimi");
		mem2.setPwd("mimi");

//		�ν��Ͻ��� ����� �ּҰ��� ���ϱ� ������ ����� false
//		�������̵��� equals�� ������ ����� true�� ����
		System.out.println(mem1 == mem2);
		System.out.println(mem1.equals(mem2));
		
//		�ߺ� ����� set�� �̿� -> �ּҰ��� �޶� ���� ��
//		�ּҰ� : ��Ű����.Ŭ������@�ּ�
//		hashCode �����Ǹ� ���� mem1�� mem2�� ���� ���� �ߺ����� �Ÿ�
		Set set = new HashSet();
		set.add(mem1);
		set.add(mem2);
//		equals�� hashCode �����Ǹ� ���� ���� ������ ������ �� �ֵ��� ��
		Member mem3 = new Member();
		mem3.setId("mimi");
		mem3.setPwd("mimi");
		set.remove(mem3);
		
		System.out.println(set);
		System.out.println(set.contains(mem3));
//		���� �ּҰ��� ����Ű�� ����
//		mem2 = mem1;
//		System.out.println(mem1 == mem2);
//		System.out.println(mem1.equals(mem2));
		
		
		
		
	}

}
