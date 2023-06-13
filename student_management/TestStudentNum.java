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
		
//		����ü ������ generic �ǹ������� �ϱ�
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
		
		System.out.println("���������������������������������������������");
		
		List<StudentNum> stuList = new ArrayList<StudentNum>();
		stuList.add(stu1);
		stuList.add(stu2);
		
//		���� �� ���°� �ƴ��� �����ֱ� ���� �� ������ �߰�
		StudentNum stu4 = new StudentNum();
		stu4.studentNum = "39100004";
		StudentNum stu5 = new StudentNum();
		stu5.studentNum = "29100005";
		stuList.add(stu4);
		stuList.add(stu5);
		
		System.out.println(stuList);
//		���� ������ ��� ���� �Ұ�
//		compareTo �������ؼ� ���ĵǵ��� ��
//		��������
		Collections.sort(stuList);
		System.out.println(stuList);
//		��������
		Collections.sort(stuList, Collections.reverseOrder());
		System.out.println(stuList);
		
		
		System.out.println("���������������������������������������������");

		
//		tree ���� ����� �̿��� TreeSet ���� -> ��ҵ��� ������������ ���ĵ� 
//		comparator�� �̿��� ���� �ʱ�ȭ
//		comparator�� ���� ���� �ԷµǴ� ���� comparable�ؾ� treeset���� ���ĵ�
		TreeSet<StudentNum> stuTreeSet = new TreeSet<StudentNum>(new StudentNameComparator());
		stu1.name = "��";
		stuTreeSet.add(stu1);
		stu2.name = "��";
		stuTreeSet.add(stu2);
		stu3.name = "ȣ";
		stuTreeSet.add(stu3);
		stu4.name = "��";
		stuTreeSet.add(stu4);
		stu5.name = "��";
		stuTreeSet.add(stu5);
		System.out.println(stuTreeSet);
		Iterator<StudentNum> it = stuTreeSet.iterator();
		while(it.hasNext()) {
//			generic���� ���� StudentNum���� �˻����� �ʰ� �ٷ� ��� ����
//			StudentNum stu = (StudentNum)it.next();
			System.out.println(it.next().name);
		}
		
//		�й��� ������������ ����
//		Iterator it = stuTreeSet.descendingIterator();
//		while(it.hasNext()) {
//			StudentNum stu = (StudentNum)it.next();
//			System.out.println(stu.studentNum);
//		}
		
		System.out.println("���������������������������������������������");
		
//		���� X : Map stuMap = new HashMap();
//		�ڵ� �������� ����
//		TreeMap�� key���� ���� ������ �ٸ��� ���� �Ұ�
//		�̸����� Ű�� �޾Ƽ� �й��� �ߺ��̾ ���� �����
		Map<String, StudentNum> stuMap = new TreeMap<String, StudentNum>();
		stuMap.put(stu1.name, stu1);
		stuMap.put(stu2.name, stu2);
		stuMap.put(stu3.name, stu3);
		stuMap.put(stu4.name, stu4);
		stuMap.put(stu5.name, stu5);
		
		System.out.println(stuMap);
//		generic ���� ������ object���� ���� �߻�
		String stuNum4 = stuMap.get(stu4.name).studentNum;
		
	}

}
