package org.artfor.app;

import org.artfor.app.service.BoardService_sh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(value = "/")
public class BoardController_detail_sh {

	@Autowired
	BoardService_sh service;

	



}
