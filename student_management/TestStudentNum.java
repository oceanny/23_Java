package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.java.comparator.StudentNameComparator;
import com.java.dto.StudentNum;

public class TestStudentNum {

	public static void main(String[] args) {
		
		System.out.println(StudentNum.school);
		StudentNum stu1 = new StudentNum();
		stu1.studentNum = "19100001";
		
		StudentNum stu2 = new StudentNum();
		stu2.studentNum = "19100002";
		
//		집합체 생성시 generic 의무적으로 하기
		Set<StudentNum> stuSet = new HashSet<StudentNum>();
		stuSet.add(stu1);
		stuSet.add(stu2);
		
		System.out.println(stuSet);
		
		StudentNum stu3 = new StudentNum();
		stu3.studentNum = "19100001";
		
		stuSet.add(stu3);
		System.out.println(stuSet);
		System.out.println(stuSet.contains(stu3));
		
		stuSet.remove(stu3);
		System.out.println(stuSet);
		
		System.out.println("▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼");
		
		List<StudentNum> stuList = new ArrayList<StudentNum>();
		stuList.add(stu1);
		stuList.add(stu2);
		
//		정렬 된 상태가 아님을 보여주기 위해 값 여러개 추가
		StudentNum stu4 = new StudentNum();
		stu4.studentNum = "39100004";
		StudentNum stu5 = new StudentNum();
		stu5.studentNum = "29100005";
		stuList.add(stu4);
		stuList.add(stu5);
		
		System.out.println(stuList);
//		정렬 기준이 없어서 정렬 불가
//		compareTo 재정의해서 정렬되도록 함
//		오름차순
		Collections.sort(stuList);
		System.out.println(stuList);
//		내림차순
		Collections.sort(stuList, Collections.reverseOrder());
		System.out.println(stuList);
		
		
		System.out.println("▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼");

		
//		tree 정렬 방식을 이용한 TreeSet 생성 -> 요소들이 오름차순으로 정렬됨 
//		comparator를 이용해 새로 초기화
//		comparator이 없을 때는 입력되는 값이 comparable해야 treeset으로 정렬됨
		TreeSet<StudentNum> stuTreeSet = new TreeSet<StudentNum>(new StudentNameComparator());
		stu1.name = "사";
		stuTreeSet.add(stu1);
		stu2.name = "아";
		stuTreeSet.add(stu2);
		stu3.name = "호";
		stuTreeSet.add(stu3);
		stu4.name = "츠";
		stuTreeSet.add(stu4);
		stu5.name = "쿠";
		stuTreeSet.add(stu5);
		System.out.println(stuTreeSet);
		Iterator<StudentNum> it = stuTreeSet.iterator();
		while(it.hasNext()) {
//			generic으로 인해 StudentNum인지 검사하지 않고 바로 출력 가능
//			StudentNum stu = (StudentNum)it.next();
			System.out.println(it.next().name);
		}
		
//		학번을 내림차순으로 정렬
//		Iterator it = stuTreeSet.descendingIterator();
//		while(it.hasNext()) {
//			StudentNum stu = (StudentNum)it.next();
//			System.out.println(stu.studentNum);
//		}
		
		System.out.println("▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼▲▽△▼");
		
//		정렬 X : Map stuMap = new HashMap();
//		자동 오름차순 정렬
//		TreeMap은 key값과 정렬 기준을 다르게 설정 불가
//		이름으로 키를 받아서 학번이 중복이어도 값이 저장됨
		Map<String, StudentNum> stuMap = new TreeMap<String, StudentNum>();
		stuMap.put(stu1.name, stu1);
		stuMap.put(stu2.name, stu2);
		stuMap.put(stu3.name, stu3);
		stuMap.put(stu4.name, stu4);
		stuMap.put(stu5.name, stu5);
		
		System.out.println(stuMap);
//		generic 하지 않으면 object여서 에러 발생
		String stuNum4 = stuMap.get(stu4.name).studentNum;
		
	}

}
