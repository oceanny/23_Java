package com.java.variable;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		
		int kor, eng, math, scien;
		int total;
		float avg;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�.");
		System.out.print("���� : ");
		kor = scan.nextInt();
		System.out.print("���� : ");
		eng = scan.nextInt();
		System.out.print("���� : ");
		math = scan.nextInt();
		System.out.print("���� : ");
		scien = scan.nextInt();
		//���� ���� ����� �Էµǵ��� ��ȿ�� ��ġ�� �ؾ���
		
		/*kor = 95; eng = 65; math = 75; scien = 80;*/
		total = (kor + eng + math + scien);
		avg = (total * 10 / 4) / 10f;
		//�����Ⱚ ���� ����
		
		/*System.out.println("����\t����\t����\t����");
		System.out.printf("%d\t%d\t%d\t%d\n", kor, eng, math, scien);*/
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		
		//5/18 ���ǹ� ����
		char score = ' ';
		if (avg >= 90) score = 'A';
		else if (avg >= 80)	score = 'B';
		else if (avg >= 70) score = 'C';
		else if (avg >= 60) score = 'D';
		else score = 'F';
		//if ���� ��������� �� ���̸� {} ���� ����
		
		System.out.println("���� : " + score);
		scan.close();
		
	}

}
