package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainMenu {
	StudentController contoller = new StudentController();

	public void mainMenu() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("====�л����� ���α׷�====");
			System.out.println("1.�л����");
			System.out.println("2.�л�����");
			System.out.println("3.�л���ȸ");
			System.out.println("4.�л������Է�");
			System.out.println("5.�л�����");
			System.out.println("0.���α׷� ����");
			System.out.print("�Է� : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				contoller.enroll();
				break;
			case 2:
				contoller.update();
				break;
			case 3:
				contoller.search();
				break;
			case 4:
				contoller.inputSung();
				break;
			case 5:
				contoller.delete();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}

	// Controller�κ��� ȣ��Ǿ� �̸�,�г�,��ȣ,������ �Է¹ް� Student ��ü s�� ����
	public Student enrollView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====�л���� ȭ��====");
		System.out.print("�л��̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(1~3): ");
		int grade = sc.nextInt();
		System.out.print("��ȣ : ");
		int number = sc.nextInt();
		System.out.print("����(���) : ");
		double sungjuk = sc.nextDouble();
		Student s = new Student(name, grade, number, sungjuk, false);
		return s;
	}

	public Student updateView(Student student) {
		Scanner sc = new Scanner(System.in);
		String name = student.getName();
		int grade = student.getGrade(), number = student.getNumber();
		double sungjuk = student.getSungjuk();
		while (true) {
			System.out.println("1. �̸� ���� // 2. �г� ���� // 3. ��ȣ ���� // 4. ���� ���� ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.printf("���� �̸� : %s �ٲ� �̸� : ", name);
				name = sc.nextLine();
				break;
			case 2:
				System.out.printf("���� �г� : %s �ٲ� �г� : ", grade);
				grade = sc.nextInt();
				break;
			case 3:
				System.out.printf("���� ��ȣ : %s �ٲ� ��ȣ : ", number);
				number = sc.nextInt();
				break;
			case 4:
				System.out.printf("���� ���� : %f �ٲ� ���� : ", sungjuk);
				sungjuk = sc.nextDouble();
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
			System.out.print("����Ͻðڽ��ϱ�? (y/n) :");
			char conti = sc.next().charAt(0);
			if (conti != 'y' || conti != 'y') {
				break;
			}
		}
		Student s = new Student(name, grade, number, sungjuk, true);
		return s;
	}

}
