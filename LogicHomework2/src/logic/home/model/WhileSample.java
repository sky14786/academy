package logic.home.model;

import java.util.Scanner;

public class WhileSample {
	Scanner sc = new Scanner(System.in);

	public void printUniCode() {
		char input = ' ';
		while (input != '0') {
			System.out.print("���� �Է� : ");
			input = sc.next().charAt(0);
			System.out.println("�����ڵ� : " + (int) input);
		}
	}

	public void sum1To100() {
		int sum = 0, i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1~100 ������ �� : " + sum);
	}

	public void numberGame() {
		int ran = (int) Math.random() * 100 + 1;
		int input = 0;
		while (true) {
			System.out.print("1~100 ���� �Է� : ");
			input = sc.nextInt();
			if (input == ran) {
				System.out.println("�����Դϴ�.");
				break;
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
	}

	public void countCharacter() {
		System.out.print("���ڿ� �Է� : ");
		String input = sc.nextLine();
		int i = 0, count = 0;
		while (i < input.length()) {
			count++;
			i++;
		}
		System.out.println("���� ���� : " + count);
	}

	public void countInChar() {
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		sc.nextLine();
		System.out.print("���� �Է� : ");
		char ch = sc.next().charAt(0);
		int i = 0, count = 0;
		while (i < str.length()) {
			if (ch == str.charAt(i)) {
				count++;
			}
			i++;
		}
		System.out.println("�Է��� ���ڿ� ���� ���� : " + count);
	}
}
