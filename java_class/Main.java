package com.java.main;

import com.java.dto.Score;

public class Main {

	public static void main(String[] args) {
		//�Է�
		Score score1 = new Score();
		score1.stuNum = "31023";
		score1.name = "������";
		score1.kor = 95;
		score1.eng = 85;
		score1.math = 100;
		score1.scien = 90;
		
		Score score2 = new Score();
		score2.stuNum = "20922";
		score2.name = "�̿���";
		score2.kor = 50;
		score2.eng = 60;
		score2.math = 100;
		score2.scien = 100;
		
		//ó��
		score1.total();
		score1.avg();
		
		score2.total();
		score2.avg();
		
		//���
		System.out.println(score1.outputScore());
		System.out.println(score2.outputScore());
	}

}
