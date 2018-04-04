package com.my.rest.home.service;

import com.my.rest.home.vo.HomeVO;
import com.my.rest.home.vo.ResponseHomeVO;

public interface HomeService {

	public ResponseHomeVO selectData();
	
	public void insertData(HomeVO homeVO);
	
	public void updateData(HomeVO homeVO, String id);
	
	public void deleteData(String id);
}
