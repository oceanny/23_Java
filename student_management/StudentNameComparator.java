package com.java.comparator;

import java.util.Comparator;

import com.java.dto.StudentNum;

public class StudentNameComparator implements Comparator<StudentNum> {

	@Override
//	이름 기준으로 정렬하는 정렬자 생성
	public int compare(StudentNum stu1, StudentNum stu2) {
//		int result = -1;		
//		if (o1 instanceof StudentNum && o2 instanceof StudentNum) {
//			StudentNum stu1 = (StudentNum)o1;
//			StudentNum stu2 = (StudentNum)o2;
//			result = stu1.name.compareTo(stu2.name);
//		}
//		
//		
		return stu1.name.compareTo(stu2.name);
	}
	

}
