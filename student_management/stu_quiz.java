package quiz;

import java.util.Scanner;
import com.java.dto.Student;

public class stu_quiz {

	public static void main(String[] args) {
		//贗楚蝶 陛螳螃晦
		Student[] st;
		final int STUDENT_NUM;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("з儅 熱 >");
		//殮溘
		STUDENT_NUM = scan.nextInt();scan.nextLine();
		
//		student 檣蝶欐蝶 儅撩X
//		溯ぷ楛蝶虜 罹楝 偃 儅撩腎橫 null高檜 盪濰腎橫 氈擠
//		評塭憮 檣蝶欐蝶蒂 й渡ж堅 高擊 殮溘п撿 л
//		ex) s[0].grade = 1 -> error(null pointer exception)
//			檣蝶欐蝶陛 й渡腎雖 彊嬴 0廓雖縑 null檜 盪濰腎橫氈擠 
//		ex) s[0] = new Student(); -> 檣蝶欐蝶陛 й渡脾(new 窕 餌辨!)
//		陝陝曖 滲熱陛 罹楝偃陛 嬴棲堅 st陛 罹楝偃陛 脾
		st = new Student[STUDENT_NUM];
		for(int i = 0; i < STUDENT_NUM; i++) {
			st[i] = new Student();
		}

		String menu;

		do {
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛  1.з儅蛔煙  弛  2.з儅褻��  弛  3.з儅熱薑  弛  4.з儅餉薯  弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			System.out.print("詭景 (謙猿:q)>");
			menu = scan.nextLine();

//				* switch僥 噙朝徹
//				switch(綠掖渠鼻) {
//				case 唳辦: 褒ч僥; break;
//				default : 褒ч僥;
//				}
			switch (menu) {
			case "1": // з儅蛔煙
				System.out.println("\n\n");
				System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
				System.out.println("弛  1.з儅蛔煙  												弛");
				System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
				// з廓, 檜葷, з喇, з婁, 儅喇錯橾, 輿模, 翱塊籀, 鼻鷓
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.println("[" + (i + 1) + "廓簞 з儅 薑爾 殮溘]");
					System.out.print("з廓 ex)2305889001 >");
					st[i].studentNum = scan.nextLine();

					System.out.print("檜葷 ex)�垮瘚� >");
					st[i].name = scan.nextLine();

					System.out.print("з喇 >");
					st[i].grade = scan.nextInt();
					scan.nextLine();

					System.out.print("з婁 ex)薑爾鱔褐奢з >");
					st[i].major = scan.nextLine();

					System.out.print("儅喇錯橾 ex)2023-05-26 >");
					st[i].birth = scan.nextLine();

					System.out.print("輿模 (衛/紫 掘/捱 翕/賊) >");
					st[i].address = scan.nextLine();

					System.out.print("翱塊籀 ex)010-1234-5678 >");
					st[i].contact = scan.nextLine();

					System.out.print("鼻鷓 ex)營з/褸機/�痯�/營瞳 >");
					st[i].state = scan.nextLine();

					System.out.println("\n\n\n");
					System.out.println("з儅蛔煙 唸婁 �飛�");
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
					System.out.printf("  1.з廓 : %s\n", st[i].studentNum);
					System.out.printf("  2.檜葷 : %s\n", st[i].name);
					System.out.printf("  3.з喇 : %d\n", st[i].grade);
					System.out.printf("  4.з婁 : %s\n", st[i].major);
					System.out.printf("  5.儅喇錯橾 : %s\n", st[i].birth);
					System.out.printf("  6.輿模 : %s\n", st[i].address);
					System.out.printf("  7. 翱塊籀 : %s\n", st[i].contact);
					System.out.printf("  8. 鼻鷓 : %s\n", st[i].state);
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
					System.out.print("嬴鼠酈釭 援腦撮蹂.");
					scan.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "2": // з儅褻��

				// 詭景っ欽
				boolean flag = true;
				while (flag) {

					// 援瞳
					boolean hasData = false; // haData 等檜攪陛 氈擊 陽 true
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i] != null && st[i].studentNum.length() > 0);
						// 瞪睡 false陛 釭諮渦塭紫 菴縑 ж釭塭紫 true 高檜 釭螃賊 瞪睡 true陛 脾
					}

					if (!hasData) { // 等檜攪陛 橈棻賊 if 褒ч
						System.out.println("\n\n殮溘脹 з儅薑爾陛 橈蝗棲棻.\n\n");
						break;
					}

					System.out.println("牖廓\tз廓\t檜葷\tз喇\tз婁\t鼻鷓");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("鼻撮爾晦 廓��(釭陛晦:q) >");
					String num = scan.nextLine();

					// q陛 菟橫螃賊 continue蒂 餌辨п憮 �撣尾� 薯橾 嬪煎 爾頂憮 while僥 謙猿
					// if僥 蜓堅 switch僥 餌辨п撿л-if僥 餌辨ж賊 nextLine戲煎 嫡嬴憮 \n梱雖 偽檜 菟橫諦憮 螃盟嫦儅
					switch (num) {
					case "q":
					case "Q":
						flag = false;
						continue;
					}

					// 僥濠翮 璋濠煎 滲��
					int index = Integer.parseInt(num) - 1;

					System.out.println("\n\n\n");
					System.out.println("з儅褻�� 唸婁 �飛�");
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
					System.out.printf("  1.з廓 	: %s\n", st[index].studentNum);
					System.out.printf("  2.檜葷 	: %s\n", st[index].name);
					System.out.printf("  3.з喇 	: %d\n", st[index].grade);
					System.out.printf("  4.з婁 	: %s\n", st[index].major);
					System.out.printf("  5.儅喇錯橾 : %s\n", st[index].birth);
					System.out.printf("  6.輿模 	: %s\n", st[index].address);
					System.out.printf("  7. 翱塊籀 	: %s\n", st[index].contact);
					System.out.printf("  8. 鼻鷓 	: %s\n", st[index].state);
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
					System.out.print("嬴鼠酈釭 援腦撮蹂.");
					scan.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "3": // з儅熱薑

				flag = true;
				while (flag) {

					boolean hasData = false;
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i].studentNum != null && st[i].studentNum.length() > 0);
					}

					if (!hasData) {
						System.out.println("\n\n殮溘脹 з儅薑爾陛 橈蝗棲棻.\n\n");
						break;
					}

					System.out.println("\n牖廓\tз廓\t檜葷\tз喇\tз婁\t鼻鷓");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("熱薑з儅 廓��(釭陛晦:q) >");
					String num = scan.nextLine();

					switch (num) {
					case "q":
					case "Q":
						flag = false;
						continue;
					}

					boolean flag2 = true;
					int index = Integer.parseInt(num) - 1;
					do {
						System.out.println("\n\n\n");
						System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
						System.out.printf("  1.з廓 : %s\n", st[index].studentNum);
						System.out.printf("  2.檜葷 : %s\n", st[index].name);
						System.out.printf("  3.з喇 : %d\n", st[index].grade);
						System.out.printf("  4.з婁 : %s\n", st[index].major);
						System.out.printf("  5.儅喇錯橾 : %s\n", st[index].birth);
						System.out.printf("  6.輿模 : %s\n", st[index].address);
						System.out.printf("  7. 翱塊籀 : %s\n", st[index].contact);
						System.out.printf("  8. 鼻鷓 : %s\n", st[index].state);
						System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
						System.out.print("熱薑 о跡 摹鷗 (釭陛晦 : q)>");
						menu = scan.nextLine();
						switch (menu) {
						case "1": // з廓
							System.out.print("з廓 >");
							st[index].studentNum = scan.nextLine();
							break;
						case "2": // 檜葷
							System.out.print("檜葷 >");
							st[index].name = scan.nextLine();
							break;
						case "3": // з喇
							System.out.print("з喇 >");
							st[index].grade = scan.nextInt();
							scan.nextLine();
							break;
						case "4": // з婁
							System.out.print("з婁 >");
							st[index].major = scan.nextLine();
							break;
						case "5": // 儅喇錯橾
							System.out.print("儅喇錯橾 >");
							st[index].birth = scan.nextLine();
							break;
						case "6": // 輿模
							System.out.print("輿模 >");
							st[index].address = scan.nextLine();
							break;
						case "7": // 翱塊籀
							System.out.print("翱塊籀 >");
							st[index].contact = scan.nextLine();
							break;
						case "8": // 鼻鷓
							System.out.print("鼻鷓 >");
							st[index].state = scan.nextLine();
							break;
						case "q":
						case "Q":
							System.out.print("з儅熱薑擊 謙猿м棲棻.");
							flag2 = false;
							continue;
						default:
						}
					} while (flag2);
				}
				break;
			case "4": // з儅餉薯
				flag = true;
				while (flag) {

					boolean hasData = false;
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i] != null && st[i].studentNum.length() > 0);
					}

					if (!hasData) {
						System.out.println("\n\n殮溘脹 з儅薑爾陛 橈蝗棲棻.\n\n");
						break;
					}

					System.out.println("\n牖廓\tз廓\t檜葷\tз喇\tз婁\t鼻鷓");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("餉薯з儅 廓��(釭陛晦:q) >");
					String num = scan.nextLine();

					switch (num) {
					case "q":
					case "Q":
						flag = false;
						continue;
					}

					int index = Integer.parseInt(num) - 1;

					st[index].studentNum = "";
					st[index].name = "";
					st[index].grade = 0;
					st[index].major = "";
					st[index].birth = "";
					st[index].address = "";
					st[index].contact = "";
					st[index].state = "";

					System.out.printf("\n%d廓 з儅擊 餉薯ц蝗棲棻.\n", (index + 1));
					System.out.print("嬴鼠酈釭 援腦撮蹂.");
					scan.nextLine();

				}
				break;
			case "q":
			case "Q": // 謙猿
				System.out.println("Щ煎斜極擊 謙猿м棲棻.");
				return;
			default:
			}
		} while (true);
		
	}
}
