package com.oop2.controller;

import java.util.ArrayList;

import com.oop2.model.vo.Person;
import com.oop2.model.vo.Student;
import com.oop2.model.vo.Teacher;

public class Oop2Controller extends Person{

	public void basicTest() {
		Person p=new Person();
		Student s=new Student("������",19,"��⵵",99,"�ڹ�");
		Teacher t=new Teacher();
		s.equals(t);
		/*
		 * s.Person(); s.Student();
		 */
		//addr="��⵵";//protected ����
		//name="������";//private �Ұ���
		
		System.out.println(s.getName()+s.getAge()+s.getAddr());
		
		//System.out.println(s.plus(10, 20));
		//System.out.println(p.plus(10, 20));
		
		System.out.println(s.toString());
		System.out.println(p.toString());
		
		
		
//		s.setName("������");
//		s.setAge(19);
//				
//		System.out.println(s.getName());
//		System.out.println(s.getAge());
//		
//		t.getName();
//		t.getAge();
//		t.getpNum();
//		s.getpNum();
//		
		
		ArrayList list=new ArrayList();
		list.equals(list);
		
	

	
	
	
	
	
}






