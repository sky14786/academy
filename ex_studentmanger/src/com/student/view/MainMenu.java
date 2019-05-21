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
			System.out.println("====�л����� ���α׷�====");
			System.out.println("1.�л����");
			System.out.println("2.�л�����");
			System.out.println("3.�л���ȸ");
			System.out.println("4.�л������Է�");
			System.out.println("5.�л�����");
			System.out.println("0.���α׷� ����");
			System.out.print("�Է� : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:contoller.enroll();break;
				case 2:contoller.update();break;
				case 3:contoller.search();break;
				case 4:contoller.inputSung();break;
				case 5:contoller.delete();break;
				case 0: System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				default:System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	public Student enrollView() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====�л���� ȭ��====");
		System.out.print("�л��̸� : ");
		String name=sc.nextLine();
		System.out.print("�г�(1~3): ");
		int grade=sc.nextInt();
		System.out.print("��ȣ : ");
		int number=sc.nextInt();
		System.out.print("����(���) : ");
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
		//students//��ü �л�! �ڷ�
		contoller.search();//��ü �л��� ��ȸ
		System.out.print("���� �л��̸� : ");
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
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			return false;
		}
		
	}
	
	
	
}





