package com.oop2.controller;

import java.util.ArrayList;

import com.oop2.model.vo.Person;
import com.oop2.model.vo.Student;
import com.oop2.model.vo.Teacher;

public class Oop2Controller extends Person{

	public void basicTest() {
		Person p=new Person();
		Student s=new Student("유병승",19,"경기도",99,"자바");
		Teacher t=new Teacher();
		s.equals(t);
		/*
		 * s.Person(); s.Student();
		 */
		//addr="경기도";//protected 가능
		//name="유병승";//private 불가능
		
		System.out.println(s.getName()+s.getAge()+s.getAddr());
		
		//System.out.println(s.plus(10, 20));
		//System.out.println(p.plus(10, 20));
		
		System.out.println(s.toString());
		System.out.println(p.toString());
		
		
		
//		s.setName("유병승");
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






