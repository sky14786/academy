package com.method.main;

import com.method.controller.MemberController;
import com.method.model.Member;

public class Main {

	public static void main(String[] args) {
		MemberController mc = new MemberController();

		Member m = mc.enrollMember();
		m.printMember();
	}

}
