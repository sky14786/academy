package com.kh.spring.demo.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring.demo.model.vo.Dev;

//devdaoimpl
@Repository
public class DevDaoImpl implements DevDao {

	@Override
	public int insertDev(SqlSession session, Dev dev) {
		return session.insert("dev.insertDev", dev);
	}

	@Override
	public List<Dev> selectDevList(SqlSessionTemplate session) {
		return session.selectList("dev.selectDevList");
	}

	@Override
	public Dev selectDev(SqlSessionTemplate session, int devNo) {
		return session.selectOne("dev.selectDev",devNo);
	}


}
