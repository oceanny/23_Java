package com.java.dto;

// <StudentNum>�� �ٿ��� ���� object�� ���� �ʰ� ��
public class StudentNum implements Comparable<StudentNum> {
	public static String school = "�̷���";
	public String studentNum = "230601";
	public String name = "----";
	public int grade = -1;
	public String major = "";
	public String birth = "XXXX-XX-XX";
	public String address = "";
	public String contact = "XXX-XXXX-XXXX";
	public String state = "����";

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

//	<StudentNum> ���������� ���
//	@Override
////	implements Comparable
//	public int compareTo(Student o) {
////		student�� �ƴϸ� �������� ���Ľ� �� ������ Ƣ����� ������ ����
//		int result = -1;
//		if (o instanceof StudentNum) {
//			StudentNum other = (StudentNum) o;
//			result = this.studentNum.compareTo(other.studentNum);
//		}
//		return result;
//	}
	
}
