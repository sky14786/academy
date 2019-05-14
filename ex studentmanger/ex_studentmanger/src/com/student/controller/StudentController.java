package com.student.controller;

import java.util.Scanner;

import com.student.model.vo.Student;
import com.student.view.MainMenu;

public class StudentController {

	// 객체 배열 선언문
	Student[] students = new Student[5];

	public void mainMenu() {
		new MainMenu().mainMenu();
	}

	public void enroll() {
		Student s = new MainMenu().enrollView();
		if (Student.getCount() < 6) {
			students[Student.getCount() - 1] = s;
		} else {
			System.out.println("더이상 등록할 수 없습니다.");
		}
	}

	public void search() {
		if (Student.getCount() > 0) {
			for (int i = 0; i < Student.getCount(); i++) {
				students[i].printStudent();
			}
		} else {
			System.out.println("등록된 학생이 없습니다.");
		}
	}
//	public void search() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("검색할 학생의 학번을 입력하시오 : ");
//		int input = sc.nextInt();
//		if (Student.getCount() > 0) {
//			for (int i = 0; i < Student.getCount(); i++) {
//				if (input == students[i].getStudentNo()) {
//					students[i].printStudent();
//					break;
//				}
//			}
//			System.out.println("입력한 학번의 학생이 없습니다.");
//		} else {
//			System.out.println("등록된 학생이 없습니다.");
//		}
//	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 학생의 학번을 입력하시오 : ");
		int input = sc.nextInt();
		if (Student.getCount() > 0) {
			for (int i = 0; i < Student.getCount(); i++) {
				if (input == students[i].getStudentNo()) {
					students[i].printStudent();
					System.out.print("삭제하시겠습니까? (Y/N) : ");
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
		System.out.print("수정할 학생의 학번을 입력하시오 : ");
		int input = sc.nextInt();
		if (Student.getCount() > 0) {
			for (int i = 0; i < Student.getCount(); i++) {
				if (input == students[i].getStudentNo()) {
					students[i].printStudent();
					students[i] = new MainMenu().updateView(students[i]);

					System.out.println("수정 완료!");
					students[i].printStudent();
					break;
				}
			}
		}
	}

	public void inputSung() {
		System.out.println("공사중");
	}
	
	

}
