package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
//		Set 인스턴스
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);set.add(1);set.add(1);	// 중복값은 하나만 입력됨
//		set.add('A');
//		set.add("123");
//		set.add(false);
		
//		입력까지는 list와 차이가 없지만 출력시 차이 발생
//		선택적 추출 불가 / 남는 값이 없을 때까지 출력
//		-> 중복값 제거 용도로 주로 사용
//		따라서 while 반복문 사용
		System.out.println(set);
		
//		Iterator는 스스로 사용 불가해 new로 호출 X
//		Iterator it = new Iterator();
		Iterator<Integer> it = set.iterator();	// 디자인 패턴으로 사용
		while(it.hasNext()) {
//			원래는 덧셈이 불가했지만 <Integer>로 object에서 integer로 바꿔서 덧셈 가능해짐
			System.out.println(it.next() + 1);
		}
		
		System.out.println(set.size());
		
	}

}
