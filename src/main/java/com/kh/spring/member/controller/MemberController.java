package com.kh.spring.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring.member.model.service.MemberService;
import com.kh.spring.member.model.vo.Member;

//membercontroller
@Controller
public class MemberController {
	@Autowired
	private MemberService service;

	@RequestMapping("/member/memberLogin.do")
	public String memberLogin(Member m) {
		Member member = service.loginMember(m);
		return "redirect:/";
	}
}
