package com.my.rest.home.service.impl;

import java.util.logging.Logger;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.my.rest.home.service.HomeService;
import com.my.rest.home.vo.HomeVO;
import com.my.rest.home.vo.ResponseHomeVO;

@Service
public class HomeServiceImpl implements HomeService{
	
	private Logger logger = Logger.getLogger(HomeService.class.getName());

	@Override
	public ResponseHomeVO selectData() {
		
		HomeVO homeVO = new HomeVO();
		homeVO.setFirstName("dohyeon");
		homeVO.setLastName("nam");
		
		ResponseHomeVO resHomeVO = new ResponseHomeVO();
		
		BeanUtils.copyProperties(homeVO, resHomeVO);
		
		return resHomeVO;
	}

	@Override
	public void insertData(HomeVO homeVO) {
		logger.info("insert: "+ homeVO);
	}

	@Override
	public void updateData(HomeVO homeVO, String id) {
		logger.info("update: "+ homeVO+", id: "+id);
	}

	@Override
	public void deleteData(String id) {
		logger.info("delete: "+ id);
	}

}
