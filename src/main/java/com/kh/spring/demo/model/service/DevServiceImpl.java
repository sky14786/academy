package com.kh.spring.demo.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.demo.model.dao.DevDao;
import com.kh.spring.demo.model.vo.Dev;
import com.kh.spring.member.model.vo.Member;

//devserviceimpl
@Service
public class DevServiceImpl implements DevService {
	@Autowired
	private DevDao dao;
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public int insertDev(Dev dev) {
		return dao.insertDev(session, dev);
	}

	@Override
	public List<Dev> selectDevList() {
		return dao.selectDevList(session);
	}

	@Override
	public Dev selectDev(int devNo) {
		return dao.selectDev(session,devNo);
	}

	@Override
	public Member loginMember(String userId, String password) {
		return null;
	}

}
