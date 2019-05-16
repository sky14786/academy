package day5.student.controller;

import java.util.Scanner;

import day5.student.model.vo.Student;

public class Controller {
	Student[] students = new Student[3];
	Scanner sc = new Scanner(System.in);

	public void printexample() {
		for (int i = 0; i < students.length; i++) {
			System.out.print("학년 입력 : ");
			students[i].setGrade(sc.nextInt());
			System.out.print("반 입력 : ");
			students[i].setClassroom(sc.nextInt());
			System.out.print("번호 입력 : ");
			students[i].setNumber(sc.nextInt());
			System.out.print("이름 입력 : ");
			students[i].setName(sc.nextLine());
			sc.nextLine();
		}
		for (int i = 0; i < students.length; i++) {
			students[i].information();
		}
	}
}
