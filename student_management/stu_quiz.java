package quiz;

import java.util.Scanner;
import com.java.dto.Student;

public class stu_quiz {

	public static void main(String[] args) {
		//Å¬·¡½º °¡Á®¿À±â
		Student[] st;
		final int STUDENT_NUM;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ÇÐ»ý ¼ö >");
		//ÀÔ·Â
		STUDENT_NUM = scan.nextInt();scan.nextLine();
		
//		student ÀÎ½ºÅÏ½º »ý¼ºX
//		·¹ÆÛ·±½º¸¸ ¿©·¯ °³ »ý¼ºµÇ¾î null°ªÀÌ ÀúÀåµÇ¾î ÀÖÀ½
//		µû¶ó¼­ ÀÎ½ºÅÏ½º¸¦ ÇÒ´çÇÏ°í °ªÀ» ÀÔ·ÂÇØ¾ß ÇÔ
//		ex) s[0].grade = 1 -> error(null pointer exception)
//			ÀÎ½ºÅÏ½º°¡ ÇÒ´çµÇÁö ¾Ê¾Æ 0¹øÁö¿¡ nullÀÌ ÀúÀåµÇ¾îÀÖÀ½ 
//		ex) s[0] = new Student(); -> ÀÎ½ºÅÏ½º°¡ ÇÒ´çµÊ(new ²À »ç¿ë!)
//		°¢°¢ÀÇ º¯¼ö°¡ ¿©·¯°³°¡ ¾Æ´Ï°í st°¡ ¿©·¯°³°¡ µÊ
		st = new Student[STUDENT_NUM];
		for(int i = 0; i < STUDENT_NUM; i++) {
			st[i] = new Student();
		}

		String menu;

		do {
			System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢  1.ÇÐ»ýµî·Ï  ¦¢  2.ÇÐ»ýÁ¶È¸  ¦¢  3.ÇÐ»ý¼öÁ¤  ¦¢  4.ÇÐ»ý»èÁ¦  ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			System.out.print("¸Þ´º (Á¾·á:q)>");
			menu = scan.nextLine();

//				* switch¹® ¾²´Â¹ý
//				switch(ºñ±³´ë»ó) {
//				case °æ¿ì: ½ÇÇà¹®; break;
//				default : ½ÇÇà¹®;
//				}
			switch (menu) {
			case "1": // ÇÐ»ýµî·Ï
				System.out.println("\n\n");
				System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
				System.out.println("¦¢  1.ÇÐ»ýµî·Ï  												¦¢");
				System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
				// ÇÐ¹ø, ÀÌ¸§, ÇÐ³â, ÇÐ°ú, »ý³â¿ùÀÏ, ÁÖ¼Ò, ¿¬¶ôÃ³, »óÅÂ
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.println("[" + (i + 1) + "¹øÂ° ÇÐ»ý Á¤º¸ ÀÔ·Â]");
					System.out.print("ÇÐ¹ø ex)2305889001 >");
					st[i].studentNum = scan.nextLine();

					System.out.print("ÀÌ¸§ ex)È«±æµ¿ >");
					st[i].name = scan.nextLine();

					System.out.print("ÇÐ³â >");
					st[i].grade = scan.nextInt();
					scan.nextLine();

					System.out.print("ÇÐ°ú ex)Á¤º¸Åë½Å°øÇÐ >");
					st[i].major = scan.nextLine();

					System.out.print("»ý³â¿ùÀÏ ex)2023-05-26 >");
					st[i].birth = scan.nextLine();

					System.out.print("ÁÖ¼Ò (½Ã/µµ ±¸/±º µ¿/¸é) >");
					st[i].address = scan.nextLine();

					System.out.print("¿¬¶ôÃ³ ex)010-1234-5678 >");
					st[i].contact = scan.nextLine();

					System.out.print("»óÅÂ ex)ÀçÇÐ/Á¹¾÷/ÈÞÇÐ/ÀçÀû >");
					st[i].state = scan.nextLine();

					System.out.println("\n\n\n");
					System.out.println("ÇÐ»ýµî·Ï °á°ú È­¸é");
					System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
					System.out.printf("  1.ÇÐ¹ø : %s\n", st[i].studentNum);
					System.out.printf("  2.ÀÌ¸§ : %s\n", st[i].name);
					System.out.printf("  3.ÇÐ³â : %d\n", st[i].grade);
					System.out.printf("  4.ÇÐ°ú : %s\n", st[i].major);
					System.out.printf("  5.»ý³â¿ùÀÏ : %s\n", st[i].birth);
					System.out.printf("  6.ÁÖ¼Ò : %s\n", st[i].address);
					System.out.printf("  7. ¿¬¶ôÃ³ : %s\n", st[i].contact);
					System.out.printf("  8. »óÅÂ : %s\n", st[i].state);
					System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
					System.out.print("¾Æ¹«Å°³ª ´©¸£¼¼¿ä.");
					scan.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "2": // ÇÐ»ýÁ¶È¸

				// ¸Þ´ºÆÇ´Ü
				boolean flag = true;
				while (flag) {

					// ´©Àû
					boolean hasData = false; // haData µ¥ÀÌÅÍ°¡ ÀÖÀ» ¶§ true
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i] != null && st[i].studentNum.length() > 0);
						// ÀüºÎ false°¡ ³ª¿Ô´õ¶óµµ µÚ¿¡ ÇÏ³ª¶óµµ true °ªÀÌ ³ª¿À¸é ÀüºÎ true°¡ µÊ
					}

					if (!hasData) { // µ¥ÀÌÅÍ°¡ ¾ø´Ù¸é if ½ÇÇà
						System.out.println("\n\nÀÔ·ÂµÈ ÇÐ»ýÁ¤º¸°¡ ¾ø½À´Ï´Ù.\n\n");
						break;
					}

					System.out.println("¼ø¹ø\tÇÐ¹ø\tÀÌ¸§\tÇÐ³â\tÇÐ°ú\t»óÅÂ");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("»ó¼¼º¸±â ¹øÈ£(³ª°¡±â:q) >");
					String num = scan.nextLine();

					// q°¡ µé¾î¿À¸é continue¸¦ »ç¿ëÇØ¼­ Èå¸§À» Á¦ÀÏ À§·Î º¸³»¼­ while¹® Á¾·á
					// if¹® ¸»°í switch¹® »ç¿ëÇØ¾ßÇÔ-if¹® »ç¿ëÇÏ¸é nextLineÀ¸·Î ¹Þ¾Æ¼­ \n±îÁö °°ÀÌ µé¾î¿Í¼­ ¿À·ù¹ß»ý
					switch (num) {
					case "q":
					case "Q":
						flag = false;
						continue;
					}

					// ¹®ÀÚ¿­ ¼ýÀÚ·Î º¯È¯
					int index = Integer.parseInt(num) - 1;

					System.out.println("\n\n\n");
					System.out.println("ÇÐ»ýÁ¶È¸ °á°ú È­¸é");
					System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
					System.out.printf("  1.ÇÐ¹ø 	: %s\n", st[index].studentNum);
					System.out.printf("  2.ÀÌ¸§ 	: %s\n", st[index].name);
					System.out.printf("  3.ÇÐ³â 	: %d\n", st[index].grade);
					System.out.printf("  4.ÇÐ°ú 	: %s\n", st[index].major);
					System.out.printf("  5.»ý³â¿ùÀÏ : %s\n", st[index].birth);
					System.out.printf("  6.ÁÖ¼Ò 	: %s\n", st[index].address);
					System.out.printf("  7. ¿¬¶ôÃ³ 	: %s\n", st[index].contact);
					System.out.printf("  8. »óÅÂ 	: %s\n", st[index].state);
					System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
					System.out.print("¾Æ¹«Å°³ª ´©¸£¼¼¿ä.");
					scan.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "3": // ÇÐ»ý¼öÁ¤

				flag = true;
				while (flag) {

					boolean hasData = false;
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i].studentNum != null && st[i].studentNum.length() > 0);
					}

					if (!hasData) {
						System.out.println("\n\nÀÔ·ÂµÈ ÇÐ»ýÁ¤º¸°¡ ¾ø½À´Ï´Ù.\n\n");
						break;
					}

					System.out.println("\n¼ø¹ø\tÇÐ¹ø\tÀÌ¸§\tÇÐ³â\tÇÐ°ú\t»óÅÂ");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("¼öÁ¤ÇÐ»ý ¹øÈ£(³ª°¡±â:q) >");
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
						System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
						System.out.printf("  1.ÇÐ¹ø : %s\n", st[index].studentNum);
						System.out.printf("  2.ÀÌ¸§ : %s\n", st[index].name);
						System.out.printf("  3.ÇÐ³â : %d\n", st[index].grade);
						System.out.printf("  4.ÇÐ°ú : %s\n", st[index].major);
						System.out.printf("  5.»ý³â¿ùÀÏ : %s\n", st[index].birth);
						System.out.printf("  6.ÁÖ¼Ò : %s\n", st[index].address);
						System.out.printf("  7. ¿¬¶ôÃ³ : %s\n", st[index].contact);
						System.out.printf("  8. »óÅÂ : %s\n", st[index].state);
						System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
						System.out.print("¼öÁ¤ Ç×¸ñ ¼±ÅÃ (³ª°¡±â : q)>");
						menu = scan.nextLine();
						switch (menu) {
						case "1": // ÇÐ¹ø
							System.out.print("ÇÐ¹ø >");
							st[index].studentNum = scan.nextLine();
							break;
						case "2": // ÀÌ¸§
							System.out.print("ÀÌ¸§ >");
							st[index].name = scan.nextLine();
							break;
						case "3": // ÇÐ³â
							System.out.print("ÇÐ³â >");
							st[index].grade = scan.nextInt();
							scan.nextLine();
							break;
						case "4": // ÇÐ°ú
							System.out.print("ÇÐ°ú >");
							st[index].major = scan.nextLine();
							break;
						case "5": // »ý³â¿ùÀÏ
							System.out.print("»ý³â¿ùÀÏ >");
							st[index].birth = scan.nextLine();
							break;
						case "6": // ÁÖ¼Ò
							System.out.print("ÁÖ¼Ò >");
							st[index].address = scan.nextLine();
							break;
						case "7": // ¿¬¶ôÃ³
							System.out.print("¿¬¶ôÃ³ >");
							st[index].contact = scan.nextLine();
							break;
						case "8": // »óÅÂ
							System.out.print("»óÅÂ >");
							st[index].state = scan.nextLine();
							break;
						case "q":
						case "Q":
							System.out.print("ÇÐ»ý¼öÁ¤À» Á¾·áÇÕ´Ï´Ù.");
							flag2 = false;
							continue;
						default:
						}
					} while (flag2);
				}
				break;
			case "4": // ÇÐ»ý»èÁ¦
				flag = true;
				while (flag) {

					boolean hasData = false;
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i] != null && st[i].studentNum.length() > 0);
					}

					if (!hasData) {
						System.out.println("\n\nÀÔ·ÂµÈ ÇÐ»ýÁ¤º¸°¡ ¾ø½À´Ï´Ù.\n\n");
						break;
					}

					System.out.println("\n¼ø¹ø\tÇÐ¹ø\tÀÌ¸§\tÇÐ³â\tÇÐ°ú\t»óÅÂ");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("»èÁ¦ÇÐ»ý ¹øÈ£(³ª°¡±â:q) >");
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

					System.out.printf("\n%d¹ø ÇÐ»ýÀ» »èÁ¦Çß½À´Ï´Ù.\n", (index + 1));
					System.out.print("¾Æ¹«Å°³ª ´©¸£¼¼¿ä.");
					scan.nextLine();

				}
				break;
			case "q":
			case "Q": // Á¾·á
				System.out.println("ÇÁ·Î±×·¥À» Á¾·áÇÕ´Ï´Ù.");
				return;
			default:
			}
		} while (true);
		
	}
}
