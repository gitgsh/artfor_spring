package org.artfor.app.service.impl;

import java.util.List;

import org.artfor.app.service.BoardService_my;
import org.artfor.app.service.mapper.BoardMapper_my;
import org.artfor.app.web.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl_my implements BoardService_my {

	@Autowired
	BoardMapper_my mapper;

	@Override
	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		return mapper.list();
	}

	@Override
	public void input(BoardDTO dto) {
		// TODO Auto-generated method stub
		mapper.input(dto);
	}


}
