package com.java.regular;

import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RegularForm {
	
	private static RegularForm instance = new RegularForm();
	private RegularForm() {}
	public static RegularForm getInstance() {
		return instance;
	}

//	인스턴스 변수
	private Map<String, String> regularForm = new TreeMap<String, String>();
//	.java가 없으면 외부에서 정규식 수정 불가 -> regex.properties 만들어 연결
//	외부 사용자도 정규식 properties 파일만 수정하면 이용 가능
	private static final String path = "com/java/regular/regex";
//	초기화 블록
	{
//		번들이 path의 properties를 읽음
		ResourceBundle regexHome = ResourceBundle.getBundle(path);
//		keySet을 가져옴
		Set<String> regexIndexSet = new TreeSet<String>(regexHome.keySet());
//		인덱스가 없는 Set을 반복할 수 있게 Iterator 선언
		Iterator<String> it = regexIndexSet.iterator();
		int count = 1;
		while(it.hasNext()) {
			String regexIndex = it.next();
			String regex = regexHome.getString(regexIndex);
			
//			format을 000으로 설정하고 index를 더해 00n 형태로 만든다
//			정렬이 제대로 되지 않아 다른 방법 사용해야함 -> Set을 TreeSet으로 선언
//			regexIndex = new DecimalFormat("000").format(count) + regexIndex;
			
			regularForm.put(regexIndex, regex);
			count++;
			
		}
		
	}
	
	public Map<String, String> getForm() {
		return this.regularForm;
	}
	
	
}
