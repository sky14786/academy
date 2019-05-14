package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainMenu {
	StudentController contoller = new StudentController();

	public void mainMenu() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("====학생관리 프로그램====");
			System.out.println("1.학생등록");
			System.out.println("2.학생수정");
			System.out.println("3.학생조회");
			System.out.println("4.학생성적입력");
			System.out.println("5.학생삭제");
			System.out.println("0.프로그램 종료");
			System.out.print("입력 : ");
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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

	// Controller로부터 호출되어 이름,학년,번호,성적을 입력받고 Student 객체 s를 리턴
	public Student enrollView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====학생등록 화면====");
		System.out.print("학생이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(1~3): ");
		int grade = sc.nextInt();
		System.out.print("번호 : ");
		int number = sc.nextInt();
		System.out.print("성적(평균) : ");
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
			System.out.println("1. 이름 수정 // 2. 학년 수정 // 3. 번호 수정 // 4. 성적 수정 ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.printf("현재 이름 : %s 바꿀 이름 : ", name);
				name = sc.nextLine();
				break;
			case 2:
				System.out.printf("현재 학년 : %s 바꿀 학년 : ", grade);
				grade = sc.nextInt();
				break;
			case 3:
				System.out.printf("현재 번호 : %s 바꿀 번호 : ", number);
				number = sc.nextInt();
				break;
			case 4:
				System.out.printf("현재 성적 : %f 바꿀 성적 : ", sungjuk);
				sungjuk = sc.nextDouble();
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			System.out.print("계속하시겠습니까? (y/n) :");
			char conti = sc.next().charAt(0);
			if (conti != 'y' || conti != 'y') {
				break;
			}
		}
		Student s = new Student(name, grade, number, sungjuk, true);
		return s;
	}

}
