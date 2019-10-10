package com.kh.spring.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.member.model.dao.MemberDao;
import com.kh.spring.member.model.vo.Member;
//memberserivceimpl
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public Member loginMember(Member m) {
		return dao.loginMember(session,m);
	}

}
