package com.java.exam;

public class score_switch {
	
	scoreT scr = new scoreT();
	
	public void repeat() {
		scr.menu = scr.menu();
		switch (scr.menu) {
		case 1:
			scr.stu_num = scr.stuN();
			scr.scoreArr();
			break;
		case 2:
			if (scr.hasData()) {
				scr.scores();
			}
			break;
		case 3:
			if (scr.hasData()) {
				scr.scorePrint();
			}
			break;
		case 4:
			if (scr.hasData()) {
				scr.max();
				scr.total();
				scr.avg();
				System.out.println("최고 점수: " + scr.max);
				System.out.println("평군 점수: " + scr.avg);
			}
			break;
		case 5:
			System.out.println("프로그램 종료");
			return;
		default:
		}
	}
	
}
