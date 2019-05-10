package com.kh.oop.controller;

import com.kh.oop.model.vo.Person;
import com.kh.oop.model.vo.Car;
import com.kh.oop.model.vo.Member;

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
}
