package com.kh.spring.demo.model.service;

import java.util.List;

import com.kh.spring.demo.model.vo.Dev;
import com.kh.spring.member.model.vo.Member;

//devservice
public interface DevService {
	int insertDev(Dev dev);

	List<Dev> selectDevList();

	Dev selectDev(int devNo);

	Member loginMember(String userId, String password);
}	
