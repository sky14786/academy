package com.ooparr.controller;

import com.ooparr.model.vo.Person;

public class OppArrController {

	public void baiscTest() {
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		Person p4=new Person();
		Person p5=new Person();
		Person p6=new Person();
		Person p7=new Person();
		Person p8=new Person();
		Person p9=new Person();
		Person p10=new Person();
		
		/*p1.setName("������");*/
		
		/*p1.getName().equals("������");
		p2.getName().equals("������");
		p3.getName().equals("������");
		p4.getName().equals("������");
		p5.getName().equals("������");
		p6.getName().equals("������");
		p7.getName().equals("������");*/
		
		/*printPerson();
		p2.printPerson();
		p3.printPerson();
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
		p7.printPerson();*/
		
		/*
		 * for(int i=1;i<11;i++) { "p"+i.printPerson }
		 */
		//�ʹ� ������~! �׷��� �츮�� ���� ��� �迭�� ����!
		//10�� ����� ��������
		//10�� ���α׷����� �������� Person class
		Person[] persons=new Person[10];
//		persons[0]=new Person();
//		persons[0].setName("������");
//		persons[1]=new Person();
//		persons[1].setName("����ö");
//		persons[2]=new Person("������",19,"��⵵����",180.5);
		Person[] persons2= {new Person(),new Person(),new Person()};
		
		for(int i=0;i<persons.length;i++) {
			persons[i]=new Person();
		}
		
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i].getName());
		}
		
		
	}
	
	
}








