package com.student.controller;

import java.util.Scanner;

import com.student.model.vo.Student;
import com.student.view.MainMenu;

public class StudentController {

	// ��ü �迭 ����
	Student[] students = new Student[5];

	public void mainMenu() {
		new MainMenu().mainMenu();
	}

	public void enroll() {
		Student s = new MainMenu().enrollView();
		if (Student.getCount() < 6) {
			students[Student.getCount() - 1] = s;
		} else {
			System.out.println("���̻� ����� �� �����ϴ�.");
		}
	}

	public void search() {
		if (Student.getCount() > 0) {
			for (int i = 0; i < Student.getCount(); i++) {
				students[i].printStudent();
			}
		} else {
			System.out.println("��ϵ� �л��� �����ϴ�.");
		}
	}
//	public void search() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�˻��� �л��� �й��� �Է��Ͻÿ� : ");
//		int input = sc.nextInt();
//		if (Student.getCount() > 0) {
//			for (int i = 0; i < Student.getCount(); i++) {
//				if (input == students[i].getStudentNo()) {
//					students[i].printStudent();
//					break;
//				}
//			}
//			System.out.println("�Է��� �й��� �л��� �����ϴ�.");
//		} else {
//			System.out.println("��ϵ� �л��� �����ϴ�.");
//		}
//	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �л��� �й��� �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		if (Student.getCount() > 0) {
			for (int i = 0; i < Student.getCount(); i++) {
				if (input == students[i].getStudentNo()) {
					students[i].printStudent();
					System.out.print("�����Ͻðڽ��ϱ�? (Y/N) : ");
					char temp = sc.next().charAt(0);
					if (temp == 'y' || temp == 'Y') {
						for (int j = i; j < Student.getCount(); j++) {
							students[j] = students[j + 1];
						}
						Student.deleteStudnet();
						break;
					}
				}
			}
		}
	}

	public void update() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �л��� �й��� �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		if (Student.getCount() > 0) {
			for (int i = 0; i < Student.getCount(); i++) {
				if (input == students[i].getStudentNo()) {
					students[i].printStudent();
					students[i] = new MainMenu().updateView(students[i]);

					System.out.println("���� �Ϸ�!");
					students[i].printStudent();
					break;
				}
			}
		}
	}

	public void inputSung() {
		System.out.println("������");
	}
	
	

}
