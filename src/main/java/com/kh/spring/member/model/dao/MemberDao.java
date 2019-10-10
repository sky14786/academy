package com.kh.spring.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.spring.member.model.vo.Member;

//memberdao
public interface MemberDao {

	Member loginMember(SqlSessionTemplate session, Member m);

}
