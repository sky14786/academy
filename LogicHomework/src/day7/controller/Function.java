package day7.controller;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);

	public void calculator() {
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("���깮�� �Է� (*,/,+,-) : ");
		char oper = sc.next().charAt(0);

		switch (oper) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("0���� ������ �����ϴ�.");
				System.out.println(num1 + " / " + num2 + " = " + 0);
			} else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
			break;

		}
	}

	public void totalCalculator() {
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();
		int i, sum = 0;

		if (num1 < num2) {
			i = num1;
		} else {
			i = num2;
		}
		for (i = i; i < (num1 > num2 ? num1 : num2); i++) {
			sum += i;
		}
		System.out.println(i + "����" + (num1 > num2 ? num1 : num2) + "���� �������� �հ� : " + sum);

	}

	public void profile() {
		int age;
		String name, gender, personality;

		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.print("���� : ");
		gender = sc.nextLine();
		sc.nextLine();
		System.out.print("���� : ");
		personality = sc.nextLine();

		System.out.println(name + " " + age + " " + gender + " " + personality);
	}

	public void sungjuk() {
		String name;
		int grade, classNumber, no;
		double result;
		char score, gender;

		System.out.print("�л��Ʒ� : ");
		name = sc.nextLine();
		System.out.print("�г� : ");
		grade = sc.nextInt();
		System.out.print("�� : ");
		classNumber = sc.nextInt();
		System.out.print("��ȣ : ");
		no = sc.nextInt();
		System.out.print("���� (M/F) : ");
		gender = sc.next().charAt(0);
		System.out.print("���� : ");
		result = sc.nextDouble();

		if (result >= 90) {
			score = 'A';
		} else if (result >= 80) {
			score = 'B';
		} else if (result >= 70) {
			score = 'C';
		} else if (result >= 60) {
			score = 'D';
		} else {
			score = 'F';
		}

		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %1.f�̰�, %c �����Դϴ�.", grade, classNumber, no,
				(gender == 'M' ? "���л�" : "���л�"), name, result, score);

	}

	public void printStarNumber() {
		System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}

	public void sumRandomNumber() {
		int random = (int) (Math.random() * 100) + 1;
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + random + "�� �հ� : " + sum);
	}

	public void continueGugudan() {
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("�ܼ� : " + num);
			for (int i = 1; i < 10; i++) {
				if (i % num == 0)
					continue;
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}

	}

	public void shutNumber() {
		int random1 = (int) (Math.random() * 6) + 1;
		int random2 = (int) (Math.random() * 6) + 1;
		int result = random1 + random2;
		char conti;
		System.out.print("�ֻ��� �ΰ��� ���� ���纸�ÿ� (2~12) : ");

		do {
			if (sc.nextInt() == result) {
				System.out.println("������ϴ�.");
				break;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			System.out.print("����Ͻðڽ��ϱ�?(y/n");
			conti = sc.next().charAt(0);
		} while (conti == 'n' || conti == 'N');

	}
}
