package day5.student.controller;

import java.util.Scanner;

import day5.student.model.vo.Student;
import day5.student.model.vo.Test;

public class Run {
	
	public static void main(String[] args) {
		Student s1=new Student(3,1,1,"ȫ�浿");
		Student s2=new Student(4,3,2,"������");
		Student s3=new Student(2,7,5,"������");
		System.out.println(s1.information());
		System.out.println(s2.information());
		System.out.println(s2.information());
		
		Student[] students=new Student[3];
		students[0]=new Student(3,1,1,"ȫ�浿");
		students[1]=new Student(4,3,2,"������");
		students[2]=new Student(2,7,5,"������");
		
		System.out.println(students[0].information());
		System.out.println(students[1].information());
		System.out.println(students[2].information());
		
		System.out.println("====for�̿����====");
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].information());
		}
		
		for(int i=0;i<students.length;i++) {
			students[i]=new Student();
		}
		students[0].setName("ȫ�浿");
		students[0].setGrade(3);
		students[0].setNumber(1);
		students[0].setClassroom(1);
		
		students[1].setName("������");
		students[1].setGrade(4);
		students[1].setNumber(2);
		students[1].setClassroom(3);
		
		students[2].setName("������");
		students[2].setGrade(2);
		students[2].setNumber(5);
		students[2].setClassroom(7);
		
		for(int i=0;i<students.length;i++) {
			switch(i) {
			case 0 : students[i]=new Student(3,1,1,"ȫ�浿"); break;
			case 1 : students[i]=new Student(4,3,2,"������"); break;
			case 2 : students[i]=new Student(2,7,5,"������"); break;
			}
		}
		//�Է¹޾� ��ü�� ���� ���
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
//			System.out.print("�г� : ");
//			int grade=sc.nextInt();
//			System.out.print("�� : ");
//			int classroom=sc.nextInt();
//			System.out.print("��ȣ : ");
//			int number=sc.nextInt();
//			sc.nextLine();
//			System.out.print("�̸� : ");
//			String name=sc.nextLine();
//			
//			students[i]=new Student(grade,classroom,number,name);
			//Student s=new Student();
			students[i]=new Student();
			System.out.print("�г� : ");
			//s.setGrade(sc.nextInt());
			students[i].setGrade(sc.nextInt());
			System.out.print("�� : ");
			//s.setClassroom(sc.nextInt());
			students[i].setClassroom(sc.nextInt());
			System.out.print("��ȣ : ");
			//s.setNumber(sc.nextInt());
			students[i].setNumber(sc.nextInt());
			sc.nextLine();
			System.out.print("�̸� : ");
			//s.setName(sc.nextLine());
			students[i].setName(sc.nextLine());
			//students[i]=s;
		}
		
		
		
		for(Student s : students) {
			//System.out.println(s.information());
			System.out.println(s);
		}
		Test t=new Test();
	
	}
	

}






