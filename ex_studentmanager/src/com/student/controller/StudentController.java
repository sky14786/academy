package com.student.controller;

import com.student.model.vo.Student;
import com.student.view.MainMenu;

public class StudentController {
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

	public void update() {
		System.out.println("������");
	}

	public void search() {
		if (Student.getCount() > 0) {
			for (int i = 0; i < Student.getCount(); i++) {
				System.out.println(students[i].printStudent());
			}
		} else {
			System.out.println("���� ��ϵ� �л��� �����ϴ�.");
		}
	}

	public void inputSung() {
		System.out.println("������");
	}

	public void delete() {
		System.out.println("������");
	}

}
