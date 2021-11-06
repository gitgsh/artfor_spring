package org.artfor.app.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.artfor.app.web.BoardDTO;

@Mapper
public interface BoardMapper_sh {

	public List<BoardDTO> list();

	public void input(BoardDTO dto);



}
