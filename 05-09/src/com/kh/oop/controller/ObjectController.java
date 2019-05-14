package com.kh.oop.controller;

import com.kh.oop.model.vo.Person;
import com.kh.oop.model.vo.Member;

import java.util.Date;

import com.kh.oop.model.vo.Employee;

public class ObjectController {
	public Member member = new Member();

	public void accessTest() {
		member.printInfo();
	}

	public void initialBlock() {
		Person p = new Person();
		p.printPerson();
		Person p1 = new Person();
		p1.printPerson();
	}

	public void constructorTest() {
		Employee e = Employee.getEmployee();
		e.printEmployee();
		Employee ee = new Employee("À¯º´½Â", "ÀÚ¹Ù", 100, 10, new Date());
		ee.printEmployee();
	}
}
