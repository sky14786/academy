package com.kh.controller;

import java.util.Scanner;

public class SwitchController {
	public void switchTest() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===����� ��̴�===");
		System.out.print("��̸� ������(1.�ڵ�,2.����,3.����,4.��Ʃ��) : ");
//		int choice = sc.nextInt();
//		char choice  = sc.next().charAt(0);
		String choice = sc.nextLine();

//		switch (choice) {
//		case 1: System.out.println("������!");
//			break;
//		case 2: System.out.println("�α⼭�� ����....");
//			break;
//		case 3:System.out.println("�α���� ����....");
//			break;
//		case 4:System.out.println("�α⵿����....");
//			break;
//		default:System.out.println("�߸��Է��ϼ̽��ϴ�.");
//			break;

//		switch (choice) {
//		case '��': System.out.println("������!");
//			break;
//		case '��': System.out.println("�α⼭�� ����....");
//			break;
//		case '��':System.out.println("�α���� ����....");
//			break;
//		case '��':System.out.println("�α⵿����....");
//			break;
//		default:System.out.println("�߸��Է��ϼ̽��ϴ�.");
//			break;
//		}

		switch (choice) {
		case "�ڵ�":
			System.out.println("������!");
			break;
		case "����":
			System.out.println("�α⼭�� ����....");
			break;
		case "����":
			System.out.println("�α���� ����....");
			break;
		case "��Ʃ��":
			System.out.println("�α⵿����....");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}

	public void switchExample1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�����̸� [���,�ٳ���,������,Ű��] �� �Է��Ͻÿ� : ");
		String input = sc.nextLine();

		switch (input) {
		case "���":
			System.out.println("����� ������ 1000�� �Դϴ�.");
			break;
		case "�ٳ���":
			System.out.println("�ٳ����� ������ 3000�� �Դϴ�.");
			break;
		case "������":
			System.out.println("�������� ������ 2000�� �Դϴ�.");
			break;
		case "Ű��":
			System.out.println("Ű���� ������ 5000�� �Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");

		}
	}

	public void switchExample2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("********�ʱ� �޴�********");
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("7.����");

		System.out.print("�޴� ��ȣ �Է� : ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			System.out.println("�Է¸޴�����");
			break;
		case 2:
			System.out.println("�����޴�����");
			break;
		case 3:
			System.out.println("��ȸ�޴�����");
			break;
		case 7:
			System.out.println("���α׷��� �����մϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. ���α׷��� �����մϴ�.");
			break;

		}
	}

	public void switchExample3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("********��  ��********");
		System.out.println("������ --------1000");
		System.out.println("��� ----------2000");
		System.out.println("���� ----------1000");
		System.out.println("���� ----------2000");
		System.out.println("Ƣ�� ----------3000");
		System.out.println("��Ƣ�� --------8000");

		System.out.print("�޴���ȣ �Է� : ");
		String input = sc.nextLine();

		switch (input) {
		case "������":
			System.out.println("�����̴� 1000���Դϴ�.");
			break;
		case "���":
			System.out.println("����� 2000���Դϴ�.");
			break;
		case "����":
			System.out.println("������ 1000���Դϴ�.");
			break;
		case "����":
			System.out.println("����� 2000���Դϴ�.");
			break;
		case "Ƣ��":
			System.out.println("Ƣ���� 3000���Դϴ�.");
			break;
		case "��Ƣ��":
			System.out.println("��Ƣ���� 8000���Դϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.");
			break;

		}
	}

	public void switchExample4() {
		System.out.println("********��  ��********");
		System.out.println("a. �ܹ��� --------3000");
		System.out.println("b. ����Ƣ�� ------2000");
		System.out.println("c. ġŲ ----------5000");
		System.out.println("d. ���̴� --------1000");
		System.out.println("e. �ݶ� ----------1000");

		Scanner sc = new Scanner(System.in);
		System.out.print("�޴���ȣ �Է� : ");
		char input = sc.next().charAt(0);

		switch (input) {
		case 'a':
			System.out.println("�ܹ��Ŵ� 3000���Դϴ�.");
			break;
		case 'b':
			System.out.println("����Ƣ���� 2000���Դϴ�.");
			break;
		case 'c':
			System.out.println("ġŲ�� 5000���Դϴ�.");
			break;
		case 'd':
			System.out.println("���̴ٴ� 1000���Դϴ�.");
			break;
		case 'e':
			System.out.println("�ݶ�� 1000���Դϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.");

		}
	}

	public void switchExample5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int input = sc.nextInt();

		switch (input / 10) {
		case 10:
			System.out.println("A�Դϴ�.");
			break;
		case 9:
			System.out.println("A�Դϴ�.");
			break;
		case 8:
			System.out.println("B�Դϴ�.");
			break;
		case 7:
			System.out.println("C�Դϴ�.");
			break;
		case 6:
			System.out.println("D�Դϴ�.");
			break;
		default:
			System.out.println("F");

		}
	}

	public void switchExample6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ������ �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� ������ �Է� : ");
		int mat = sc.nextInt();

		int sum = kor + eng + mat;
		double avg = sum / 3;

		
		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("�հ��Դϴ�.");
		}else{
			if(kor<=40) {
				System.out.println("���� ������ ���� �̴޷� ���հ� �Դϴ�.");
			}else if(eng<=40) {
				System.out.println("���� ������ ���� �̴޷� ���հ� �Դϴ�.");
			}else if(mat<=40) {
				System.out.println("���� ������ ���� �̴޷� ���հ� �Դϴ�.");
			}else {
				System.out.println("��� ������ �̴޷� ���հ� �Դϴ�.");
			}
		}

	}

	public void switchExample7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �޿� �Է� : ");
		int money = sc.nextInt();
		System.out.print("�� ���� �Է� : ");
		int money2 = sc.nextInt();
		System.out.println("======================");
		System.out.println("����� : " + money2);
		double bonus = 0;
		if (money2 >= 5000) {
			System.out.println("���ʽ��� : " + 0.05);
			bonus = money2 * 0.05;
			System.out.println("���ʽ� �ݾ� : " + bonus);
		} else if (money2 >= 3000) {
			System.out.println("���ʽ��� : " + 0.03);
			bonus = money2 * 0.03;
			System.out.println("���ʽ� �ݾ� : " + bonus);
		} else if (money2 >= 1000) {
			System.out.println("���ʽ��� : " + 0.01);
			bonus = money2 * 0.01;
			System.out.println("���ʽ� �ݾ� : " + bonus);
		}
		System.out.println("=================");
		System.out.println("�� �޿� : " + (money + bonus));

	}
}
