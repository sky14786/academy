package com.kh.spring.demo.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.spring.demo.model.vo.Dev;

//devdao
public interface DevDao {
	int insertDev(SqlSession session, Dev dev);
}
