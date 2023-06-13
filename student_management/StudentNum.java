package com.java.dto;

// <StudentNum>을 붙여서 값을 object로 받지 않게 됨
public class StudentNum implements Comparable<StudentNum> {
	public static String school = "미래고";
	public String studentNum = "230601";
	public String name = "----";
	public int grade = -1;
	public String major = "";
	public String birth = "XXXX-XX-XX";
	public String address = "";
	public String contact = "XXX-XXXX-XXXX";
	public String state = "재학";

	@Override
	public boolean equals(Object studentNum) {
		boolean result = false;
		if (studentNum instanceof StudentNum) {
			StudentNum other = (StudentNum) studentNum;
			if (other.studentNum.equals(this.studentNum))
				result = true;
		}
		return result;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public String toString() {
		return studentNum + " : " + name;
	}

	@Override
	public int compareTo(StudentNum o) {
		int result = this.studentNum.compareTo(o.studentNum);
		return result;
	}

//	<StudentNum> 지정이전에 사용
//	@Override
////	implements Comparable
//	public int compareTo(Student o) {
////		student가 아니면 오름차순 정렬시 맨 앞으로 튀어나오게 음수값 지정
//		int result = -1;
//		if (o instanceof StudentNum) {
//			StudentNum other = (StudentNum) o;
//			result = this.studentNum.compareTo(other.studentNum);
//		}
//		return result;
//	}
	
}
