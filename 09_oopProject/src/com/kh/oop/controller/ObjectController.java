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
		//Person.name="������";//����ƽ����
		//Person.age=19;//�ν��Ͻ� ����
		Person.setName("����ö");
		System.out.println(Person.getName());
		
		Person p1=new Person();
		p1.setName("������");
		//p1.age=19;
		System.out.println("static"+p1.getName());
				
		//p1.printPerson();
		//���������ں� ������� ����
		//p1.name;//private �϶��� ���ٺҰ�
		//System.out.println(p1.age);
		//public���� ����Ǿ ������ ����
		//System.out.println(p1.age);
		//p1.printPerson();
		//p1.gender;//default�� ����Ǽ� �Ұ���
		//default�� ������Ű���������� ������ ����
		p1.setName("������");
		System.out.println(p1.getName());
		System.out.println(p1.getMemberId());
		//p1.memberId="p002";
	}
	
	public void initialBlock() {
		Person p=new Person();
		//new Person(19, "������");
		p.printPerson();
		Person p1=new Person();
		p1.printPerson();
		p.printPerson();
		Person p2=new Person();
		p2.printPerson();
	}
	
	
	public void constructorTest() {
		
		//�⺻�����ڸ� �̿��� ��ü����!
		//Employee e=new Employee();
		Employee e=Employee.getEmployee();
		
		e.printEmployee();
		Employee e1=new Employee("������","�ڹ�",100,10,new Date());
		
		Animal dog=new Animal("��",3,"�ǻ�",3.0,20.5);
		Animal dog2=new Animal("��",2,4,30.3);
		dog.printAnimal();
		dog2.printAnimal();
		Animal dogDefault=new Animal();
		dogDefault.printAnimal();
		
		Bus bus1=new Bus();
		Bus bus2=new Bus("�߻�","�߻ǻ߻�", 10, 1000,100,200000);
		bus1.printBus();
		bus2.printBus();
		
	}
	
	

	
}






