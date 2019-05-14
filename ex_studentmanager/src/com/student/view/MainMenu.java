package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainMenu {
	StudentController controller = new StudentController();

	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("====학생관리 프로그램====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생수정");
			System.out.println("3. 학생조회");
			System.out.println("4. 학생성적입력");
			System.out.println("5. 학생삭제");
			System.out.println("0. 프로그램종료");
			System.out.print("번호 입력 : ");
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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못 입력되었습니다.");

			}
		}
	}

	public Student enrollView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====학생등록 화면====");
		System.out.print("학생이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 (1~3) : ");
		int grade = sc.nextInt();
		System.out.print("번호 : ");
		int number = sc.nextInt();
		System.out.print("성적(평균) : ");
		double sungJuk = sc.nextDouble();

		Student s = new Student(name, grade, number, sungJuk);
		return s;

	}
}
