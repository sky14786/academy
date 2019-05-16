package com.kh.controller;

import com.kh.model.vo.Member;

public class MemberController {
	Member[] member = new Member[5];
	Member mem = new Member();

	public void createMember(String name, String address, String email, int age, double weight, double height) {
		if (mem.getCount() < 6) {
			Member s = new Member(name, address, email, age, weight, height);
			member[mem.getCount()] = s;
			member[mem.getCount()].printMember();
			mem.countPlus();
		} else {
			System.out.println("더 이상 만들수 없습니다.");
		}
	}
}
