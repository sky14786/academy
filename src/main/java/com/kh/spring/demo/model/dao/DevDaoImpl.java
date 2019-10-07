package com.kh.spring.demo.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kh.spring.demo.model.vo.Dev;
//devdaoimpl
@Repository
public class DevDaoImpl implements DevDao {

	@Override
	public int insertDev(SqlSession session, Dev dev) {
		return session.insert("dev.insertDev", dev);
	}

}
