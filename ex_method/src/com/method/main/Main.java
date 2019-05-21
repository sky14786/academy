package com.method.main;

import com.method.controller.MemberController;
import com.method.model.Member;

public class Main {

	public static void main(String[] args) {
		MemberController mc=new MemberController();
		Member member=mc.enrollMember();
		member.printMember();
		mc.memberUpdate(19);
		member.printMember();
		
		System.out.println(member);
		
		
	}
	
}




