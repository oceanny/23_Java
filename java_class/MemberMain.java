package com.java.classes;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {

	public static void main(String[] args) {
		
//		직접 생성 : liter 영역의 값 참조
		String str1 = "123";
		String str2 = "123";
//		new로 인한 생성 : heap 영역에 생성
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
//		문자열이 저장되기 때문에 "123" 한개만 저장됨
		System.out.println(strSet);
		
		
		System.out.printf("▲ String 비교\n▼ instance 비교\n");
		
		
		Member mem1 = new Member();
		mem1.setId("mimi");
		mem1.setPwd("mimi");		
		
		Member mem2 = new Member();
		mem2.setId("mimi");
		mem2.setPwd("mimi");

//		인스턴스가 저장된 주소값을 비교하기 때문에 결과는 false
//		오버라이딩해 equals를 수정해 결과가 true로 나옴
		System.out.println(mem1 == mem2);
		System.out.println(mem1.equals(mem2));
		
//		중복 비허용 set을 이용 -> 주소값이 달라서 각자 들어감
//		주소값 : 패키지명.클래스명@주소
//		hashCode 재정의를 통해 mem1과 mem2의 값을 비교해 중복값을 거름
		Set set = new HashSet();
		set.add(mem1);
		set.add(mem2);
//		equals와 hashCode 재정의를 통해 값이 같으면 지워질 수 있도록 함
		Member mem3 = new Member();
		mem3.setId("mimi");
		mem3.setPwd("mimi");
		set.remove(mem3);
		
		System.out.println(set);
		System.out.println(set.contains(mem3));
//		같은 주소값을 가리키게 만듦
//		mem2 = mem1;
//		System.out.println(mem1 == mem2);
//		System.out.println(mem1.equals(mem2));
		
		
		
		
	}

}
