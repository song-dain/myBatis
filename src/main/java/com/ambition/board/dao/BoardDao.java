package com.ambition.board.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.ambition.board.dto.BoardDto;

@Repository
public class BoardDao {
	
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sql;
	
	private static final String NAMESPACE = "Board_Mapper.";

	public List<BoardDto> select() {
		
		return sql.selectList(NAMESPACE + "select");
	}

}
