package com.kh.oop.controller;

import java.util.Date;

import com.kh.oop.model.vo.Animal;
import com.kh.oop.model.vo.Bus;
//import com.kh.oop.model.vo.Car;
import com.kh.oop.model.vo.Employee;
import com.kh.oop.model.vo.Person;

public class ObjectController {

	public void accessTest() {
		new Person().printPerson();
		//new Car();
		//Person.name="유병승";//스테틱변수
		//Person.age=19;//인스턴스 변수
		Person.setName("문은철");
		System.out.println(Person.getName());
		
		Person p1=new Person();
		p1.setName("유병승");
		//p1.age=19;
		System.out.println("static"+p1.getName());
				
		//p1.printPerson();
		//접근제한자별 멤버변수 접근
		//p1.name;//private 일때는 접근불가
		//System.out.println(p1.age);
		//public으로 선언되어서 접근이 가능
		//System.out.println(p1.age);
		//p1.printPerson();
		//p1.gender;//default로 선언되서 불가능
		//default는 같은패키지내에서만 접근이 가능
		p1.setName("유병승");
		System.out.println(p1.getName());
		System.out.println(p1.getMemberId());
		//p1.memberId="p002";
	}
	
	public void initialBlock() {
		Person p=new Person();
		//new Person(19, "유병승");
		p.printPerson();
		Person p1=new Person();
		p1.printPerson();
		p.printPerson();
		Person p2=new Person();
		p2.printPerson();
	}
	
	
	public void constructorTest() {
		
		//기본생성자를 이용한 객체생성!
		//Employee e=new Employee();
		Employee e=Employee.getEmployee();
		
		e.printEmployee();
		Employee e1=new Employee("유병승","자바",100,10,new Date());
		
		Animal dog=new Animal("개",3,"뽀삐",3.0,20.5);
		Animal dog2=new Animal("개",2,4,30.3);
		dog.printAnimal();
		dog2.printAnimal();
		Animal dogDefault=new Animal();
		dogDefault.printAnimal();
		
		Bus bus1=new Bus();
		Bus bus2=new Bus("삐뽀","삐뽀삐뽀", 10, 1000,100,200000);
		bus1.printBus();
		bus2.printBus();
		
	}
	
	

	
}






