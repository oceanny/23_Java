package com.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
//		key�� value�� type�� ��� ������
//		value�� object�� ���� ����
		Map<String, Object> map = new HashMap<String, Object>();

//		(key, value)
//		key�� �ߺ��� ��� ���߿� �Էµ� ������ �ڵ� ��ü��
//		-> key �ߺ� X -> set ����
//		value �ߺ� O -> set �Ұ��� -> collection(list) ���·� ���
		map.put("a", 1);
		map.put("b", 'A');
		map.put("c", 123);
		map.put("d", false);

		System.out.println(map);
//		key�� ���� ���� ���
		System.out.println(map.containsKey("c"));
//		�ش� key�� value ���
		System.out.println(map.get("c"));
//		�ش� key�� value ���� -> key�� �ִ�(��Ȯ��) ��� replace ��� put���� ���� ����
//		�ش� key�� ���� ��� put�� ���� ���Եǰ� replace�� ���� �ȵ�
		map.replace("e", "456");
		map.put("c", "456");
		System.out.println(map);

		map.remove("c");
		System.out.println(map);

		Map addMap = new HashMap();
		addMap.put("e", "abc");
		addMap.put("f", "def");
//		�ѹ��� ����
		map.putAll(addMap);
		System.out.println(map);
//		entry : key, value ��
//		size : ���� ���� ���
		System.out.println(map.size());
//		key�� set���� ���� -> �ܺ� map�� �������� �� ���
		Set keys = map.keySet();
		System.out.println(keys);
//		value�� ����
//		set�� ������ �����Ƿ� keySet�� values�� ��Ī�ȴٰ� ����� �� ����
		Collection values = map.values();
		System.out.println(values);
//		key�� value ��Ī�ؼ� ����ϴ� ���
//		1. keySet()���� value�� �ϳ��� �����ͼ� ��Ī
		Set keySet = map.keySet();
//		���� ������ ��� : for��
		for (Object key : keySet) {
			System.out.println(map.get(key));
		}
////	���� ������ ���
//		Iterator itKey = keySet.iterator();
//		while (itKey.hasNext()) {
////			map���� itKey�� ����� key�� ��Ī�Ǵ� value�� ���
//			String key = (String)itKey.next();
//			System.out.println(key + " : " + map.get(key));
//		}

//		2. entry set���� value�� �ϳ��� �����ͼ� ��Ī
//		set�� ���� ���� �ִ��� �� �� ���
//		���� ������ ��� : for��
		Set entrySet = map.entrySet();
		for (Object entryObj : entrySet) {
			Entry entry = (Entry) entryObj;
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
////		���� ������ ���
//		Iterator itEntry = entrySet.iterator();
//		while (itEntry.hasNext()) {
////			entry���� key�� value�� get�� �̿��� ���� ���
//			Entry entry = (Entry)itEntry.next();
//			System.out.println("key : " + entry.getKey());
//			System.out.println("value : " + entry.getValue());

	}

}
