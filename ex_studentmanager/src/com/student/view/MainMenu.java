package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainMenu {
	StudentController controller = new StudentController();

	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("====�л����� ���α׷�====");
			System.out.println("1. �л����");
			System.out.println("2. �л�����");
			System.out.println("3. �л���ȸ");
			System.out.println("4. �л������Է�");
			System.out.println("5. �л�����");
			System.out.println("0. ���α׷�����");
			System.out.print("��ȣ �Է� : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				controller.enroll();
				break;
			case 2:
				controller.update();
				break;
			case 3:
				controller.search();
				break;
			case 4:
				controller.inputSung();
				break;
			case 5:
				controller.delete();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("�߸� �ԷµǾ����ϴ�.");

			}
		}
	}

	public Student enrollView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====�л���� ȭ��====");
		System.out.print("�л��̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� (1~3) : ");
		int grade = sc.nextInt();
		System.out.print("��ȣ : ");
		int number = sc.nextInt();
		System.out.print("����(���) : ");
		double sungJuk = sc.nextDouble();

		Student s = new Student(name, grade, number, sungJuk);
		return s;

	}
}
