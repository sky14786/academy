package com.kh.spring.demo.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import com.kh.spring.demo.model.vo.Dev;

//devdao
public interface DevDao {
	int insertDev(SqlSession session, Dev dev);

	List<Dev> selectDevList(SqlSessionTemplate session);
}
