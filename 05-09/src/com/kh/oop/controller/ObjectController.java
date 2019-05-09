package com.kh.oop.controller;

import com.kh.oop.model.vo.Person;
import com.kh.oop.model.vo.Car;
import com.kh.oop.model.vo.Member;

public class ObjectController {
	public Member member = new Member();

	public void accessTest() {
		member.printInfo();
	}
}
