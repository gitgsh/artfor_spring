package org.artfor.app;

import java.util.HashMap;
import java.util.Map;

import org.artfor.app.service.GuideService;
import org.artfor.app.web.GuideDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(value = "/guide")
public class GuideController {

	@Autowired
	GuideService service;

	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
    public Map<String, Object> list(ModelAndView mnv, GuideDTO gdto){
       Map<String, Object> map = new HashMap<String, Object>();
       map.put("list2", service.g_list(gdto));
       return map;       
    }

}
