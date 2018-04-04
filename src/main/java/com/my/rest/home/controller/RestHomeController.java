package com.my.rest.home.controller;

import java.util.logging.Logger;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.my.rest.home.service.impl.HomeServiceImpl;
import com.my.rest.home.vo.HomeVO;
import com.my.rest.home.vo.RequestHomeVO;
import com.my.rest.home.vo.ResponseHomeVO;

@RestController
@RequestMapping("/rest/home")
public class RestHomeController {
	
	private Logger logger = Logger.getLogger(RestHomeController.class.getName());
	
	@Autowired
	private HomeServiceImpl homeServiceImpl;

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public ResponseHomeVO selectData() {
		
		logger.info("/rest/home/info");
		ResponseHomeVO resHomeVO = homeServiceImpl.selectData();
		return resHomeVO;
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public void insertData(@RequestBody RequestHomeVO reqHomeVO) {
		HomeVO homeVO = new HomeVO();
		BeanUtils.copyProperties(reqHomeVO, homeVO);
		homeServiceImpl.insertData(homeVO);
	}
	
	@RequestMapping(value = "/info/{id}", method = RequestMethod.PUT)
	public void updateData(@RequestBody RequestHomeVO reqHomeVO, @PathVariable String id) {
		HomeVO homeVO = new HomeVO();
		BeanUtils.copyProperties(reqHomeVO, homeVO);
		homeServiceImpl.updateData(homeVO, id);
	}
	
	@RequestMapping(value = "/info/{id}", method = RequestMethod.DELETE)
	public void deleteData(@PathVariable String id) {
		homeServiceImpl.deleteData(id);
	}
}
