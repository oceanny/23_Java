package com.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
//		key와 value의 type을 모두 선언함
//		value는 object로 보통 지정
		Map<String, Object> map = new HashMap<String, Object>();

//		(key, value)
//		key가 중복인 경우 나중에 입력된 값으로 자동 대체됨
//		-> key 중복 X -> set 가능
//		value 중복 O -> set 불가능 -> collection(list) 형태로 출력
		map.put("a", 1);
		map.put("b", 'A');
		map.put("c", 123);
		map.put("d", false);

		System.out.println(map);
//		key의 존재 여부 출력
		System.out.println(map.containsKey("c"));
//		해당 key의 value 출력
		System.out.println(map.get("c"));
//		해당 key의 value 변경 -> key가 있는(정확한) 경우 replace 대신 put으로 변경 가능
//		해당 key가 없는 경우 put은 값이 삽입되고 replace는 삽입 안됨
		map.replace("e", "456");
		map.put("c", "456");
		System.out.println(map);

		map.remove("c");
		System.out.println(map);

		Map addMap = new HashMap();
		addMap.put("e", "abc");
		addMap.put("f", "def");
//		한번에 삽입
		map.putAll(addMap);
		System.out.println(map);
//		entry : key, value 쌍
//		size : 쌍의 개수 출력
		System.out.println(map.size());
//		key를 set으로 삽입 -> 외부 map을 삽입했을 때 사용
		Set keys = map.keySet();
		System.out.println(keys);
//		value를 삽입
//		set은 순서가 없으므로 keySet과 values가 매칭된다고 장담할 수 없음
		Collection values = map.values();
		System.out.println(values);
//		key와 value 매칭해서 출력하는 방법
//		1. keySet()으로 value를 하나씩 가져와서 매칭
		Set keySet = map.keySet();
//		보다 간단한 방법 : for문
		for (Object key : keySet) {
			System.out.println(map.get(key));
		}
////	보다 복잡한 방법
//		Iterator itKey = keySet.iterator();
//		while (itKey.hasNext()) {
////			map에서 itKey로 출력한 key와 매칭되는 value를 출력
//			String key = (String)itKey.next();
//			System.out.println(key + " : " + map.get(key));
//		}

//		2. entry set으로 value를 하나씩 가져와서 매칭
//		set에 무슨 값이 있는지 모를 때 사용
//		보다 간단한 방법 : for문
		Set entrySet = map.entrySet();
		for (Object entryObj : entrySet) {
			Entry entry = (Entry) entryObj;
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
////		보다 복잡한 방법
//		Iterator itEntry = entrySet.iterator();
//		while (itEntry.hasNext()) {
////			entry에서 key와 value를 get을 이용해 따로 출력
//			Entry entry = (Entry)itEntry.next();
//			System.out.println("key : " + entry.getKey());
//			System.out.println("value : " + entry.getValue());

	}

}
