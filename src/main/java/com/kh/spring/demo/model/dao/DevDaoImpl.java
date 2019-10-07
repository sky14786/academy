package com.kh.spring.demo.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.spring.demo.model.vo.Dev;
//devdaoimpl
public class DevDaoImpl implements DevDao {

	@Override
	public int insertDev(SqlSession session, Dev dev) {
		return session.insert("dev.insertDev", dev);
	}

}
