package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.main.Main;
import com.student.model.vo.Student;

public class MainMenu {
	StudentController contoller=new StudentController();
			//Main.getController();
	
	public void mainMenu()
	{
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("====학생관리 프로그램====");
			System.out.println("1.학생등록");
			System.out.println("2.학생수정");
			System.out.println("3.학생조회");
			System.out.println("4.학생성적입력");
			System.out.println("5.학생삭제");
			System.out.println("0.프로그램 종료");
			System.out.print("입력 : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:contoller.enroll();break;
				case 2:contoller.update();break;
				case 3:contoller.search();break;
				case 4:contoller.inputSung();break;
				case 5:contoller.delete();break;
				case 0: System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				default:System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	public Student enrollView() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====학생등록 화면====");
		System.out.print("학생이름 : ");
		String name=sc.nextLine();
		System.out.print("학년(1~3): ");
		int grade=sc.nextInt();
		System.out.print("번호 : ");
		int number=sc.nextInt();
		System.out.print("성적(평균) : ");
		double sungjuk=sc.nextDouble();
		//Student s=new Student(name,grade,number,sungjuk);
		Student s=new Student();
		s.setName(name);
		s.setGrade(grade);
		s.setNumber(number);
		s.setSungjuk(sungjuk);
		return s;
	}
	
	public  boolean delete(Student[] students) {
		//students//전체 학생! 자료
		contoller.search();//전체 학생이 조회
		System.out.print("지울 학생이름 : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(Student.getCount()>0) {
			for(int i=0;i<Student.getCount();i++) {
				if(name.equals(students[i].getName())) {
					students[i]=null;
					Student.deleteCount();
				}
			}
			return true;
		}
		else {
			System.out.println("등록된 회원이 없습니다.");
			return false;
		}
		
	}
	
	
	
}





