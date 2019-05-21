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
		
		/*p1.setName("유병승");*/
		
		/*p1.getName().equals("유병승");
		p2.getName().equals("유병승");
		p3.getName().equals("유병승");
		p4.getName().equals("유병승");
		p5.getName().equals("유병승");
		p6.getName().equals("유병승");
		p7.getName().equals("유병승");*/
		
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
		//너무 불편해~! 그래서 우리는 지금 배운 배열을 쓰자!
		//10명 사람을 관리하자
		//10명 프로그램에서 만들어야함 Person class
		Person[] persons=new Person[10];
//		persons[0]=new Person();
//		persons[0].setName("여동규");
//		persons[1]=new Person();
//		persons[1].setName("문은철");
//		persons[2]=new Person("유병승",19,"경기도시흥",180.5);
		Person[] persons2= {new Person(),new Person(),new Person()};
		
		for(int i=0;i<persons.length;i++) {
			persons[i]=new Person();
		}
		
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i].getName());
		}
		
		
	}
	
	
}








