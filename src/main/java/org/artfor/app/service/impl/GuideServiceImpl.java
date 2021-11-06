package org.artfor.app.service.impl;

import java.util.List;

import org.artfor.app.service.GuideService;
import org.artfor.app.service.mapper.GuideMapper;
import org.artfor.app.web.GuideDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuideServiceImpl implements GuideService {
	
	@Autowired
	GuideMapper mapper;

	@Override
	public List<GuideDTO> g_list(GuideDTO gdto) {
		// TODO Auto-generated method stub
		return mapper.g_list(gdto);
	}

}
