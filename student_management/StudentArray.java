package com.java.array;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] studentNum;
		String[] name;
		int[] grade;
		String[] major;
		String[] birth;
		String[] address;
		String[] contact;
		String[] state;
		String menu;
		final int STUDENT_NUM;
		System.out.print("학생 수 >");
		STUDENT_NUM = sc.nextInt();
		sc.nextLine();
		studentNum = new String[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		grade = new int[STUDENT_NUM];
		major = new String[STUDENT_NUM];
		birth = new String[STUDENT_NUM];
		address = new String[STUDENT_NUM];
		contact = new String[STUDENT_NUM];
		state = new String[STUDENT_NUM];

//		for (int i = 0; i < STUDENT_NUM; i++) {
//			;
//		}

		do {
			System.out.println("┌───────────────────────────────────────────────────────────────┐");
			System.out.println("│　1. 학생등록　│　2. 학생조회　│　3. 학생수정　│　4. 학생삭제　│");
			System.out.println("└───────────────────────────────────────────────────────────────┘");
			System.out.print("메뉴 (종료 : q)>");
			menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.println("\n\n");
				System.out.println("┌───────────────────────────────────────────────────────────────┐");
				System.out.println("│　1. 학생등록　　　　　　　　　　　　　　　　　　　　　　　　　│");
				System.out.println("└───────────────────────────────────────────────────────────────┘");
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.println(i + 1 + "번째 학생 정보 입력중");
					System.out.print("학번 ex)2305889001 >");
					studentNum[i] = sc.nextLine();
					System.out.print("이름 ex)홍길동 >");
					name[i] = sc.nextLine();
					System.out.print("학년 ex)1 >");
					grade[i] = sc.nextInt();
					sc.nextLine();
					System.out.print("학과 ex)정보통신공학 >");
					major[i] = sc.nextLine();
					System.out.print("생년월일 ex)2023-05-26 >");
					birth[i] = sc.nextLine();
					System.out.print("주소 (시/도 구/군 동/면) ex)서울시 노원구 공릉동 >");
					address[i] = sc.nextLine();
					System.out.print("연락처 ex)010-0000-0000 >");
					contact[i] = sc.nextLine();
					System.out.print("상태 ex)재학/휴학/제적/졸업 >");
					state[i] = sc.nextLine();
					// 출력
					System.out.println("\n");
					System.out.println("학생등록 결과 화면");
					System.out.println("┌────────────────────────────────────┐");
					System.out.printf("　1. 학번 : %s\n", studentNum[i]);
					System.out.printf("　2. 이름 : %s\n", name[i]);
					System.out.printf("　3. 학년 : %d학년\n", grade[i]);
					System.out.printf("　4. 학과 : %s\n", major[i]);
					System.out.printf("　5. 생년월일 : %s\n", birth[i]);
					System.out.printf("　6. 주소 : %s\n", address[i]);
					System.out.printf("　7. 연락처 : %s\n", contact[i]);
					System.out.printf("　8. 상태 : %s\n", state[i]);
					System.out.println("└────────────────────────────────────┘");
				}
				break;

			case "2":
				boolean flag = true;

				boolean hasData = false;
				for (int i = 0; i < STUDENT_NUM; i++) {
					hasData = hasData || studentNum[i] != null && studentNum[i].length() > 0;
				}
				if (!hasData) {
					System.out.println("\n\n");
					System.out.println("입력된 학생정보가 없습니다.");
					System.out.println("\n\n");
					break;
				}
				
				System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", i + 1, studentNum[i], name[i], grade[i], major[i],
							state[i]);
				}
				while (flag) {
					System.out.println("상세보기 번호 (나가기 : q)");
					String num = sc.nextLine();
					
//					if (num == "q" || num == "Q")  nextLine으로 받아서 \n까지 저장이 되어서 등호 사용시 멈추지 않음
					switch (num) {
					case "q": case "Q":
						flag = false;
						continue;
					}

					// String을 int로 형변환하는 메소드
					int index = Integer.parseInt(num) - 1;
					System.out.println("순번\t학번\t이름\t학년\t학과\t생년월일\t주소\t연락처\t상태");
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\t\t%s\t%s\t%s\n", index + 1, studentNum[index], name[index], grade[index], major[index], birth[index], address[index], contact[index], state[index]);
				}
				break;

			case "3":
				flag = true;

				hasData = false;
				for (int i = 0; i < STUDENT_NUM; i++) {
					hasData = hasData || studentNum[i] != null && studentNum[i].length() > 0;
				}
				if (!hasData) {
					System.out.println("\n\n");
					System.out.println("입력된 학생정보가 없습니다.");
					System.out.println("\n\n");
					break;
				}

				System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", i + 1, studentNum[i], name[i], grade[i], major[i],
							state[i]);
				}
				while (flag) {
					System.out.println("수정할 순번 선택 (나가기 : q)");
					String num = sc.nextLine();
					switch (num) {
					case "q": case "Q":
						System.out.println("\n\n");
						System.out.println("학생수정을 종료합니다.");
						System.out.println("\n\n");
						flag = false;
						continue; //return으로 하면 안되나?
					}
					
					boolean flag2 = true;
					int index = Integer.parseInt(num) - 1;
					do {
						System.out.println("\n\n");
						System.out.println("등록된 학생정보");
						System.out.println("┌────────────────────────────────────┐");
						System.out.printf("　1. 학번 : %s\n", studentNum[index]);
						System.out.printf("　2. 이름 : %s\n", name[index]);
						System.out.printf("　3. 학년 : %d학년\n", grade[index]);
						System.out.printf("　4. 학과 : %s\n", major[index]);
						System.out.printf("　5. 생년월일 : %s\n", birth[index]);
						System.out.printf("　6. 주소 : %s\n", address[index]);
						System.out.printf("　7. 연락처 : %s\n", contact[index]);
						System.out.printf("　8. 상태 : %s\n", state[index]);
						System.out.println("└────────────────────────────────────┘");
						System.out.print("수정 항목 선택 (나가기 : q)>");
						menu = sc.nextLine();
						
						switch(menu) {
						case "1": //학번
							System.out.print("학번 ex)2305889001 >");
							studentNum[index] = sc.nextLine();
							break;
						case "2": //이름
							System.out.print("이름 ex)홍길동 >");
							name[index] = sc.nextLine();
							break;
						case "3": //학년
							System.out.print("학년 ex)1 >");
							grade[index] = sc.nextInt();sc.nextLine();
							break;
						case "4": //학과
							System.out.print("학과 ex)정보통신공학 >");
							major[index] = sc.nextLine();
							break;
						case "5": //생년월일
							System.out.print("생년월일 ex)2023-05-26 >");
							birth[index] = sc.nextLine();
							break;
						case "6": //주소
							System.out.print("주소 (시/도 구/군 동/면) ex)서울시 노원구 공릉동 >");
							address[index] = sc.nextLine();
							break;
						case "7": //연락처
							System.out.print("연락처 ex)010-0000-0000 >");
							contact[index] = sc.nextLine();
							break;
						case "8": //상태
							System.out.print("상태 ex)재학/휴학/제적/졸업 >");
							state[index] = sc.nextLine();
							break;
						case "q": case"Q":
							System.out.println("\n\n");
							System.out.printf("%d번 학생수정을 종료합니다.", index + 1);
							System.out.println("\n\n");
							flag2 = false;
							continue;
						default:
							break;
						}
					}while(flag2);
				}
				break;
				
			case "4":
				flag = true;

				hasData = false;
				for (int i = 0; i < STUDENT_NUM; i++) {
					hasData = hasData || studentNum[i] != null && studentNum[i].length() > 0;
				}
				if (!hasData) {
					System.out.println("\n\n");
					System.out.println("입력된 학생정보가 없습니다.");
					System.out.println("\n\n");
					break;
				}
				
				System.out.println("순번\t학번\t이름\t학년\t학과\t상태");
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", i + 1, studentNum[i], name[i], grade[i], major[i],
							state[i]);
				}
				while (flag) {
					System.out.println("삭제할 학생 순번 (나가기 : q)");
					String num = sc.nextLine();
					
					switch (num) {
					case "q": case "Q":
						flag = false;
						continue;
					}
					
					int index = Integer.parseInt(num) - 1;
					studentNum[index] = "";
					name[index] = "";
					grade[index] = 0;
					major[index] = "";
					birth[index] = "";
					address[index] = "";
					contact[index] = "";
					state[index] = "";
					
					System.out.printf("%d번 학생정보를 삭제했습니다.\n", index + 1);
				}
				
				break;
				
			case "q": case "Q":
				break;
				
			default:
			}
			
			System.out.print("이어서 진행하려면 아무키나 누르세요.");
			sc.nextLine();
			System.out.println("\n\n");
			
		} while (true);
	}
}