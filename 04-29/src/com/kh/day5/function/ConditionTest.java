package com.kh.day5.function;

import java.util.Scanner;

public class ConditionTest {
	public void condition() {
		// ���ǹ� if�� ����غ���!
		int num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("���");
		}
		System.out.println("{}�ۿ� �ִ� ��!");
	}

	public void checkGender() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������?(��,��) : ");
		char gender = sc.nextLine().charAt(0);

		// if (gender == '��') {
		// System.out.println("���ڴ� ���������� ���ÿ�");
		// } else if (gender == '��') {
		// System.out.println("���ڴ� �������� ���ÿ�");
		// } else {
		// System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		// }
		if (gender == '��') {
			System.out.println("���ڴ� ���������� ���ÿ�");
		}
		if (gender == '��') {
			System.out.println("���ڴ� �������� ���ÿ�:");
		}

	}

	public void ssample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ĺ� , ���� �Է� : ");
		if (sc.nextLine().equals("����")) {
			System.out.println("�����Դϴ�");
		}
	}

	public void ssample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();

		if (age >= 8 && age <= 12) {
			System.out.println("�ʵ��̳׿�");
		}
		if (age >= 13 && age <= 16) {
			System.out.println("�ߵ��̳׿�");
		}
		if (age >= 17 && age <= 19) {
			System.out.println("����̳׿�");
		}
	}

	public void ssample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("��׿����ڳ׿� ���ν��~");
		}
	}

	public void sample1() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;

		System.out.print("���� ������ �Է��Ͻÿ� : ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		avg = sum / 3;

		if (sum >= 250) {
			System.out.println("������Դϴ�.");
		}
		if (avg >= 90 && avg <= 100) {
			System.out.println("A�Դϴ�.");
		}
		if (avg >= 80 && avg < 90) {
			System.out.println("B�Դϴ�.");
		}
		if (avg >= 70 && avg < 80) {
			System.out.println("C�Դϴ�");
		}

	}

	public void sample2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("A�� ������ �Է��Ͻÿ� : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("A�� ��׿������Դϴ�");
		}
		System.out.print("B�� ������ �Է��Ͻÿ� : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("B�� ��׿������Դϴ�");
		}
		System.out.print("C�� ������ �Է��Ͻÿ� : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("C�� ��׿������Դϴ�.");
		}
	}

	public void sample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ѱ��� �Է��Ͻÿ� : ");
		if (sc.nextInt() % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

	public void teacherSample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		if (sum > 250) {
			System.out.println("������Դϴ�.");
		}
		if (avg >= 90) {
			System.out.println("A");
		}
		if (avg < 90 && avg >= 80) {
			System.out.println("B");
		}
		if (avg < 80 && avg >= 70) {
			System.out.println("C");
		}
	}

	public void ifElseTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���̴� : ");
		int age = sc.nextInt();

		if (age > 19) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�̼������Դϴ�.");
		}
	}

	public void ifElseSample() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;

		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		sum = kor + mat + eng;
		avg = sum / 3;

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}

	public void ifElseSample2() {
		Scanner sc = new Scanner(System.in);
		String name;
		char gender;
		int classNumber, grade, no;
		double result;

		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = sc.nextLine();
		System.out.print("�г��� �Է��Ͻÿ� : ");
		grade = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		classNumber = sc.nextInt();
		System.out.print("��ȣ�� �Է��Ͻÿ� : ");
		no = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ� ex. M,F : ");
		sc.nextLine();
		if (sc.nextLine().charAt(0) == 'M') {
			gender = '��';
		} else {
			gender = '��';
		}
		System.out.print("������ �Է����ÿ� : ");
		result = sc.nextDouble();

		System.out.printf("%d�г� %d�� %d�� %c�л� %s�� ������ %.2f�̴�.", grade, classNumber, no, gender, name, result);
	}

	public void iElseIfTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		if (age > 19) {
			System.out.println("����� �����̳׿� ����?!");
		} else if (age > 17) {
			System.out.println("����� ����л�!");
		} else if (age > 14) {
			System.out.println("����� ���л�!");
		}
	}

	public void calTest() {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		char oper;

		System.out.print("����1 �Է� : ");
		num = sc.nextInt();
		System.out.print("����2 �Է� : ");
		num2 = sc.nextInt();
		System.out.print("��ȣ�Է� [+,-,/,*] : ");
		oper = sc.next().charAt(0);

		if ((num < 0 || num2 < 0) || (oper != '+' && oper != '-' && oper != '*' && oper != '/')) {
			System.out.println("������ �߸��Է��ϼ̽��ϴ�.");
		} else {
			if (oper == '+') {
				System.out.println(num + "+" + num2 + "=" + (num + num2));
			} else if (oper == '-') {
				System.out.println(num + "-" + num2 + "=" + (num - num2));
			} else if (oper == '*') {
				System.out.println(num + "*" + num2 + "=" + (num * num2));
			} else if (oper == '/') {
				System.out.println(num + "/" + num2 + "=" + (double) ((num / num2)));
			}
		}

//		if (num < 0 || num2 < 0) {
//			System.out.println("�����߸��Է�");
//		} else if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
//			System.out.println("��ȣ�߸��Է�");
//		}

	}

	public void ifSample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		if (num <= 10 && num >= 1) {
			if (num % 2 == 0) {
				System.out.println("¦���Դϴ�");
			} else {
				System.out.println("Ȧ���Դϴ�.");
			}
		}

	}

	public void ifSample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		double height = sc.nextDouble() * 0.01;
		System.out.print("�����Ը� �Է��Ͻÿ� : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);

		String str = "";

		if (bmi >= 30) {
			str = "���Դϴ�";
		} else {
			if (bmi >= 25) {
				str = "��ü���Դϴ�";
			} else {
				if (bmi >= 20) {
					str = "����ü���Դϴ�.";
				} else {
					if (bmi <= 15) {
						str = "��ü���Դϴ�.";
					}
				}
			}
		}

		System.out.println(str);
	}

}
