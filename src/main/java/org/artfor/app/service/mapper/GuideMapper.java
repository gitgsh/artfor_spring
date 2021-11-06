package org.artfor.app.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.artfor.app.web.GuideDTO;

@Mapper
public interface GuideMapper {
	public List<GuideDTO> g_list(GuideDTO gdto);
}
