package com.java.inheritance;

import java.util.Scanner;

public class 주소메인 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String menu = null;
//		지도 map = null;

		System.out.println("1. 국가　2. 시　3. 구　4. 동　5. 종료");
		System.out.println("주소 검색 구분을 입력");
		menu = sc.nextLine();
		
//		컴파일 상 에러나지 않지만 map이 가리키는 곳 가면 유성구가 아니고 지도라서 에러 발생함
//		지도 map = new 지도();
//		오른쪽은 지도 이상 범위의 클래스가 선언되어야 함
//		ex) 대한민국 map = new 대전();
		지도 map = new 유성구();
		map.get주소();
		((유성구)map).get동();
		
		switch (menu) {
		case "1":
			map =  new 세계();
			break;
		case "2":
			map = new 대한민국();
			break;
		case "3":
			map = new 대전();
			break;
		case "4":
			map = new 유성구();
			break;
		case "5":
			break;
		default:
		}

//		유성구 찾기
//		지도 map1 = new 유성구();

		System.out.println(map.주소());
		
//		map이 가리키는 인스턴스에 유성구의 내용 존재 여부를 true / false로 출력
//		instanceof Object는 무조건 true : 모든 클래스의 조상 클래스
		System.out.println("유성구 인스턴스 : " + (map instanceof 유성구));
		
	}

}
