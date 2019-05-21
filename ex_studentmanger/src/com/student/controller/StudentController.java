package com.student.controller;

import com.student.model.vo.Student;
import com.student.view.MainMenu;

public class StudentController {
	
	private Student[] students=new Student[5];
	private MainMenu menu;
	
	
	public void mainMenu() {
		menu=new MainMenu();
		menu.mainMenu();
	}
	
	public void enroll() {
		
		Student s=menu.enrollView();
		if(Student.getCount()<6) {
		students[Student.getCount()-1]=s;
		}
		else {
			System.out.println("더이상 등록할 수 없습니다.");
		}
	}
	public void search() {
		if(Student.getCount()>0) {
			for(int i=0;i<Student.getCount();i++)
			{
				students[i].printStudent();
			}
		}
		else {
			System.out.println("등록된 학생이 없습니다.");
		}
	}
	
	public void delete() {
		boolean flag=new MainMenu().delete(students);
		if(flag) {
			System.out.println("삭제완료!");
		}
	}
	public void update() {System.out.println("공사중");}
	public void inputSung() {System.out.println("공사중");}
	
}








