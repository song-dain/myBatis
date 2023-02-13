package com.ambition.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ambition.board.dao.BoardDao;
import com.ambition.board.dto.BoardDto;

public class BoardService {
	
	@Autowired
	BoardDao boardDao;

	public List<BoardDto> select() {
		
		List<BoardDto> boardList = boardDao.select();
		
		return boardList;
	}

}
