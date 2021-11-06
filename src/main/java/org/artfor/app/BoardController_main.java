package org.artfor.app;

import java.util.List;

import org.artfor.app.service.BoardService;
import org.artfor.app.web.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(value = "/")
public class BoardController_main {

	@Autowired
	BoardService service;
	
	@RequestMapping(value="/" , method = RequestMethod.GET)
	public String home() { //git test~
		return "home";
	}
	
	@RequestMapping(value="/list.do" , method = RequestMethod.GET)
	public List<BoardDTO> list() {
		List<BoardDTO> list = service.list();
		System.out.println(list);
		return list;
	}
	@RequestMapping(value="/input.do" , method = RequestMethod.POST)
	public void input(@RequestBody BoardDTO dto) {
		System.out.println("input......");
		System.out.println(dto);
		service.input(dto);

	}
	@RequestMapping(value="/detail.do" , method = RequestMethod.POST)
	public void detail(@RequestBody BoardDTO dto) {
		System.out.println("detail......");
		System.out.println(dto);
		service.input(dto);

	}
	
}
