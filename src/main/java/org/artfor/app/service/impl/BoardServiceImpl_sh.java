package org.artfor.app.service.impl;

import java.util.List;

import org.artfor.app.service.BoardService;
import org.artfor.app.service.mapper.BoardMapper_sh;
import org.artfor.app.web.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl_sh implements BoardService {

	@Autowired
	BoardMapper_sh mapper;

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
