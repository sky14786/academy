package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
	Scanner sc = new Scanner(System.in);

	public void addDashToken() {
		System.out.print("���ڿ� �� �Է� : ");
		String str = sc.nextLine();
	}

	public void burgerKingMenu() {
		int input, input2, result = 0;
		String list = "";
		char go = ' ';

		System.out.println("�ܹ��� ***************");
		System.out.println("1. �Ұ�����	3500��");
		System.out.println("2. ġŲ����	3200��");
		System.out.println("�߰� ****************");
		System.out.println("3. ����Ƣ��	1000��");
		System.out.println("4. ġ�ƽ	400��");
		System.out.println("5. ������		2000��");
		System.out.println("����� ***************");
		System.out.println("6. �ݶ�		700��");
		System.out.println("7. ���̵�		1200��");
		System.out.println("8. Ŀ��		1000��");
		System.out.println("********************");

		do {
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1: {
				System.out.println("�Ұ����Ÿ� �����ϼ̽��ϴ�.");
				System.out.print("������ ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "�� �ֹ��ϼ̽��ϴ�.");
				result += (input2 * 3500);
				list += "�Ұ����� : " + input2 + "�� - " + (input2 * 3500) + "�� \n";
				break;
			}
			case 2: {
				System.out.println("ġŲ���Ÿ� �����ϼ̽��ϴ�.");
				System.out.print("������ ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "�� �ֹ��ϼ̽��ϴ�.");
				result += (input2 * 3200);
				list += "ġŲ���� : " + input2 + "�� - " + (input2 * 3200) + "�� \n";
				break;
			}
			case 3: {
				System.out.println("����Ƣ�踦 �����ϼ̽��ϴ�.");
				System.out.print("������ ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "�� �ֹ��ϼ̽��ϴ�.");
				result += (input2 * 1000);
				list += "����Ƣ�� : " + input2 + "�� - " + (input2 * 1000) + "�� \n";
				break;
			}
			case 4: {
				System.out.println("ġ�ƽ�� �����ϼ̽��ϴ�.");
				System.out.print("������ ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "�� �ֹ��ϼ̽��ϴ�.");
				result += (input2 * 400);
				list += "ġ�ƽ : " + input2 + "�� - " + (input2 * 400) + "�� \n";
				break;
			}
			case 5: {
				System.out.println("�����带 �����ϼ̽��ϴ�.");
				System.out.print("������ ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "�� �ֹ��ϼ̽��ϴ�.");
				result += (input2 * 2000);
				list += "������ : " + input2 + "�� - " + (input2 * 2000) + "�� \n";
				break;
			}
			case 6: {
				System.out.println("�ݶ� �����ϼ̽��ϴ�.");
				System.out.print("������ ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "�� �ֹ��ϼ̽��ϴ�.");
				result += (input2 * 700);
				list += "�ݶ� : " + input2 + "�� - " + (input2 * 700) + "�� \n";
				break;
			}
			case 7: {
				System.out.println("���̵带 �����ϼ̽��ϴ�.");
				System.out.print("������ ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "�� �ֹ��ϼ̽��ϴ�.");
				result += (input2 * 1200);
				list += "���̵� : " + input2 + "�� - " + (input2 * 1200) + "�� \n";
				break;
			}
			case 8: {
				System.out.println("Ŀ�Ǹ� �����ϼ̽��ϴ�.");
				System.out.print("������ ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "�� �ֹ��ϼ̽��ϴ�.");
				result += (input2 * 1000);
				list += "Ŀ�� : " + input2 + "�� - " + (input2 * 1000) + "�� \n";
				break;
			}
			}

			System.out.print("�߰� �ֹ� �Ͻðڽ��ϱ�?(y/n)");
			go = sc.next().charAt(0);

		} while (go != 'n' || go != 'N');

		System.out.println("* �ֹ��Ͻ� ������ ������ �����ϴ�. *");
		System.out.println("--------------------------------------");
		System.out.print(list);
		System.out.println("----------------------------------------");
		System.out.println("�� ���� : " + result + "��");
	}

	public void isStringAlphabet() {
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		int i = 0;
		boolean flag = false;
		do {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				flag = true;
			} else {
				flag = false;
			}
			i++;
		} while (i < str.length());
		if (flag) {
			System.out.println("��� ���� �����ڴ�.");
		} else {
			System.out.println("������ �ƴϴ�.");
		}
	}
}
