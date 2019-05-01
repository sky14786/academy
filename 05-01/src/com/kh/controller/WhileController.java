package com.kh.controller;

import java.util.Scanner;

public class WhileController {
	public void whileStudy() {
		int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
	}

	public void doWhileStudy() {
		int num3 = 10;
		while (num3 < 10) {
			System.out.println("�̰� ����Ǵ�?");
		}
		do {
			System.out.println("�̰� ����Ǵ�?");
			num3++;
		} while (num3 < 20);

	}

	public void whileExample1() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
	}

	public void whileExample2() {
		int i = 100;
		while (i >= 100) {
			System.out.println(i);
			i--;
		}
	}

	public void whileExample3() {
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void whileExample4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void whileExample5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		int i = 1, sum = 0;
		while (i <= num) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		System.out.print("���� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		int sum = 0;
		int temp;
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if ((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122)) {
				if (temp == ch) {
					sum++;
				}
			} else {
				answer = "Error";
			}
		}

		if (answer.equals("Error")) {
			System.out.println(answer);
		} else {
			System.out.println("���Ե� ���� : " + sum);
		}

	}

	public void exampleAnswer1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��Է� : ");
		String str = sc.nextLine();
		System.out.print("ã�� ���� :");
		char searhChar = sc.next().charAt(0);
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == searhChar) {
				count++;
			}
		}

		System.out.println("ã�� ���� ���� : " + count);
	}

	public void example2() {
//		String age, name, address, height, weight,phone;
		String name, address, phone;
		String result = "";
		double ageAvg = 0, heightAvg = 0, weightAvg = 0;
		int age;
		double height, weight;

		Scanner sc = new Scanner(System.in);
		System.out.print("��� �����Ұų� ? : ");
		int input = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < input; i++) {
			System.out.print("�̸� �Է� : ");
			name = sc.nextLine();
			System.out.print("���� �Է� : ");
			age = sc.nextInt();
			ageAvg += age;
			System.out.print("�ּ� �Է� : ");
			address = sc.nextLine();
			sc.nextLine();
			System.out.print("Ű �Է� : ");
			height = sc.nextDouble();
			heightAvg += height;
			System.out.print("������ �Է� : ");
			weight = sc.nextDouble();
			weightAvg += weight;
			System.out.print("����ó �Է� : ");
			sc.nextLine();
			phone = sc.nextLine();

			result += name + " " + age + "�� " + address + " " + height + "cm " + weight + "kg " + phone + "\n";

		}
		System.out.println("======================================");
		System.out.print(result);
		ageAvg /= input;
		weightAvg /= input;
		heightAvg /= input;
		System.out.printf("��ճ��� %.1f�� / ��� Ű : %.1fCM / ��� ������ : %.1fKg", ageAvg, heightAvg, weightAvg);

	}

	public void example3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("� ���� ? : ");
		int input = sc.nextInt();

	}

	public void breakTest() {
		for (int i = 0;; i++) {
			System.out.print(i + " ");
		}
	}

	public void testExample1() {
		Scanner sc = new Scanner(System.in);
		int ran = (int) (Math.random() * 100 + 1);
		int count = 0;
		while (true) {
			System.out.print("���� �Ѱ� �Է� : ");
			int input = sc.nextInt();
			count++;
			if (input == ran) {
				System.out.println("�����Դϴ�. " + count + "ȸ ���� ������ ���߼̽��ϴ�.");
				break;
			} else if (ran < input) {
				System.out.println("������ �Է��Ͻ� �������� �۽��ϴ�.");
			} else {
				System.out.println("������ �Է��Ͻ� �������� Ů�ϴ�.");
			}
		}
	}

	public void testExample2() {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean isTemp = false;
		System.out.print("������ �Է��ϼ���");
		num = sc.nextInt();

		while (true) {

			if (num > 2) {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						isTemp = false;
						break;
					} else {
						isTemp = true;
					}
				}
				if (isTemp) {
					System.out.println("�Ҽ���");
					break;
				} else {
					System.out.println("�Ҽ��� �ƴϴ�.");
					break;
				}
			} else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���. : ");
				num = sc.nextInt();
			}
		}
	}

	public void testExample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ݾ��� �Է��ϼ��� : ");
		int input = sc.nextInt();
		System.out.print("��ǰ ������ �Է��ϼ��� : ");
		int goods = sc.nextInt();
		int temp = 0, changer = 0;
		int result = input - goods;

		temp = result / 50000;
		result -= (temp * 50000);
		System.out.println("5������ : " + temp);

		temp = result / 10000;
		result -= (temp * 10000);
		System.out.println("1������ : " + temp);

		temp = result / 5000;
		result -= (temp * 5000);
		System.out.println("��õ�� : " + temp);

		temp = result / 1000;
		result -= (temp * 1000);
		System.out.println("õ�� : " + temp);

		temp = result / 500;
		result -= (temp * 500);
		System.out.println("����� : " + temp);

		temp = result / 100;
		result -= (temp * 100);
		System.out.println("��� : " + temp);

		temp = result / 50;
		result -= (temp * 50);
		System.out.println("���ʿ� : " + temp);

		temp = result / 10;
		result -= (temp * 10);
		System.out.println("�ʿ� : " + temp);

	}

}
