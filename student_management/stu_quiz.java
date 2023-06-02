package quiz;

import java.util.Scanner;
import com.java.dto.Student;

public class stu_quiz {

	public static void main(String[] args) {
		//Ŭ���� ��������
		Student[] st;
		final int STUDENT_NUM;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л� �� >");
		//�Է�
		STUDENT_NUM = scan.nextInt();scan.nextLine();
		
//		student �ν��Ͻ� ����X
//		���۷����� ���� �� �����Ǿ� null���� ����Ǿ� ����
//		���� �ν��Ͻ��� �Ҵ��ϰ� ���� �Է��ؾ� ��
//		ex) s[0].grade = 1 -> error(null pointer exception)
//			�ν��Ͻ��� �Ҵ���� �ʾ� 0������ null�� ����Ǿ����� 
//		ex) s[0] = new Student(); -> �ν��Ͻ��� �Ҵ��(new �� ���!)
//		������ ������ �������� �ƴϰ� st�� �������� ��
		st = new Student[STUDENT_NUM];
		for(int i = 0; i < STUDENT_NUM; i++) {
			st[i] = new Student();
		}

		String menu;

		do {
			System.out.println("��������������������������������������������������������������������������������������������������������������������������");
			System.out.println("��  1.�л����  ��  2.�л���ȸ  ��  3.�л�����  ��  4.�л�����  ��");
			System.out.println("��������������������������������������������������������������������������������������������������������������������������");
			System.out.print("�޴� (����:q)>");
			menu = scan.nextLine();

//				* switch�� ���¹�
//				switch(�񱳴��) {
//				case ���: ���๮; break;
//				default : ���๮;
//				}
			switch (menu) {
			case "1": // �л����
				System.out.println("\n\n");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������");
				System.out.println("��  1.�л����  												��");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������");
				// �й�, �̸�, �г�, �а�, �������, �ּ�, ����ó, ����
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.println("[" + (i + 1) + "��° �л� ���� �Է�]");
					System.out.print("�й� ex)2305889001 >");
					st[i].studentNum = scan.nextLine();

					System.out.print("�̸� ex)ȫ�浿 >");
					st[i].name = scan.nextLine();

					System.out.print("�г� >");
					st[i].grade = scan.nextInt();
					scan.nextLine();

					System.out.print("�а� ex)������Ű��� >");
					st[i].major = scan.nextLine();

					System.out.print("������� ex)2023-05-26 >");
					st[i].birth = scan.nextLine();

					System.out.print("�ּ� (��/�� ��/�� ��/��) >");
					st[i].address = scan.nextLine();

					System.out.print("����ó ex)010-1234-5678 >");
					st[i].contact = scan.nextLine();

					System.out.print("���� ex)����/����/����/���� >");
					st[i].state = scan.nextLine();

					System.out.println("\n\n\n");
					System.out.println("�л���� ��� ȭ��");
					System.out.println("��������������������������������������������������������������������������������������������������������������������������");
					System.out.printf("  1.�й� : %s\n", st[i].studentNum);
					System.out.printf("  2.�̸� : %s\n", st[i].name);
					System.out.printf("  3.�г� : %d\n", st[i].grade);
					System.out.printf("  4.�а� : %s\n", st[i].major);
					System.out.printf("  5.������� : %s\n", st[i].birth);
					System.out.printf("  6.�ּ� : %s\n", st[i].address);
					System.out.printf("  7. ����ó : %s\n", st[i].contact);
					System.out.printf("  8. ���� : %s\n", st[i].state);
					System.out.println("��������������������������������������������������������������������������������������������������������������������������");
					System.out.print("�ƹ�Ű�� ��������.");
					scan.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "2": // �л���ȸ

				// �޴��Ǵ�
				boolean flag = true;
				while (flag) {

					// ����
					boolean hasData = false; // haData �����Ͱ� ���� �� true
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i] != null && st[i].studentNum.length() > 0);
						// ���� false�� ���Դ��� �ڿ� �ϳ��� true ���� ������ ���� true�� ��
					}

					if (!hasData) { // �����Ͱ� ���ٸ� if ����
						System.out.println("\n\n�Էµ� �л������� �����ϴ�.\n\n");
						break;
					}

					System.out.println("����\t�й�\t�̸�\t�г�\t�а�\t����");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("�󼼺��� ��ȣ(������:q) >");
					String num = scan.nextLine();

					// q�� ������ continue�� ����ؼ� �帧�� ���� ���� ������ while�� ����
					// if�� ���� switch�� ����ؾ���-if�� ����ϸ� nextLine���� �޾Ƽ� \n���� ���� ���ͼ� �����߻�
					switch (num) {
					case "q":
					case "Q":
						flag = false;
						continue;
					}

					// ���ڿ� ���ڷ� ��ȯ
					int index = Integer.parseInt(num) - 1;

					System.out.println("\n\n\n");
					System.out.println("�л���ȸ ��� ȭ��");
					System.out.println("��������������������������������������������������������������������������������������������������������������������������");
					System.out.printf("  1.�й� 	: %s\n", st[index].studentNum);
					System.out.printf("  2.�̸� 	: %s\n", st[index].name);
					System.out.printf("  3.�г� 	: %d\n", st[index].grade);
					System.out.printf("  4.�а� 	: %s\n", st[index].major);
					System.out.printf("  5.������� : %s\n", st[index].birth);
					System.out.printf("  6.�ּ� 	: %s\n", st[index].address);
					System.out.printf("  7. ����ó 	: %s\n", st[index].contact);
					System.out.printf("  8. ���� 	: %s\n", st[index].state);
					System.out.println("��������������������������������������������������������������������������������������������������������������������������");
					System.out.print("�ƹ�Ű�� ��������.");
					scan.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "3": // �л�����

				flag = true;
				while (flag) {

					boolean hasData = false;
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i].studentNum != null && st[i].studentNum.length() > 0);
					}

					if (!hasData) {
						System.out.println("\n\n�Էµ� �л������� �����ϴ�.\n\n");
						break;
					}

					System.out.println("\n����\t�й�\t�̸�\t�г�\t�а�\t����");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("�����л� ��ȣ(������:q) >");
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
						System.out.println("��������������������������������������������������������������������������������������������������������������������������");
						System.out.printf("  1.�й� : %s\n", st[index].studentNum);
						System.out.printf("  2.�̸� : %s\n", st[index].name);
						System.out.printf("  3.�г� : %d\n", st[index].grade);
						System.out.printf("  4.�а� : %s\n", st[index].major);
						System.out.printf("  5.������� : %s\n", st[index].birth);
						System.out.printf("  6.�ּ� : %s\n", st[index].address);
						System.out.printf("  7. ����ó : %s\n", st[index].contact);
						System.out.printf("  8. ���� : %s\n", st[index].state);
						System.out.println("��������������������������������������������������������������������������������������������������������������������������");
						System.out.print("���� �׸� ���� (������ : q)>");
						menu = scan.nextLine();
						switch (menu) {
						case "1": // �й�
							System.out.print("�й� >");
							st[index].studentNum = scan.nextLine();
							break;
						case "2": // �̸�
							System.out.print("�̸� >");
							st[index].name = scan.nextLine();
							break;
						case "3": // �г�
							System.out.print("�г� >");
							st[index].grade = scan.nextInt();
							scan.nextLine();
							break;
						case "4": // �а�
							System.out.print("�а� >");
							st[index].major = scan.nextLine();
							break;
						case "5": // �������
							System.out.print("������� >");
							st[index].birth = scan.nextLine();
							break;
						case "6": // �ּ�
							System.out.print("�ּ� >");
							st[index].address = scan.nextLine();
							break;
						case "7": // ����ó
							System.out.print("����ó >");
							st[index].contact = scan.nextLine();
							break;
						case "8": // ����
							System.out.print("���� >");
							st[index].state = scan.nextLine();
							break;
						case "q":
						case "Q":
							System.out.print("�л������� �����մϴ�.");
							flag2 = false;
							continue;
						default:
						}
					} while (flag2);
				}
				break;
			case "4": // �л�����
				flag = true;
				while (flag) {

					boolean hasData = false;
					for (int i = 0; i < STUDENT_NUM; i++) {
						hasData = hasData || (st[i] != null && st[i].studentNum.length() > 0);
					}

					if (!hasData) {
						System.out.println("\n\n�Էµ� �л������� �����ϴ�.\n\n");
						break;
					}

					System.out.println("\n����\t�й�\t�̸�\t�г�\t�а�\t����");
					for (int i = 0; i < STUDENT_NUM; i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", (i + 1), st[i].studentNum, st[i].name, st[i].grade, st[i].major, st[i].state);
					}
					System.out.print("�����л� ��ȣ(������:q) >");
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

					System.out.printf("\n%d�� �л��� �����߽��ϴ�.\n", (index + 1));
					System.out.print("�ƹ�Ű�� ��������.");
					scan.nextLine();

				}
				break;
			case "q":
			case "Q": // ����
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
			}
		} while (true);
		
	}
}
