package com.my.rest.album.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.my.rest.album.service.AlbumService;
import com.my.rest.album.util.AlbumUtil;
import com.my.rest.album.vo.AlbumVO;
import com.my.rest.album.vo.ResponseAlbumVO;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Override
	public ResponseAlbumVO selectAlbumList(String filePath) {
		
		String DefaultFilePath = "C://dev//img";
		
		if(!StringUtils.isEmpty(filePath)) {
			DefaultFilePath = DefaultFilePath + "//" + filePath;
		}
		
		File file = new File(DefaultFilePath);
		
		ResponseAlbumVO responseAlbumVO = new ResponseAlbumVO();
		List<AlbumVO> AlbumList = new ArrayList<AlbumVO>();
		AlbumVO vo = null;
		
		if(!file.exists()) {
			return responseAlbumVO;
		}
		
		File[] fileList = file.listFiles();
		for(File fileInfo : fileList) {
			vo = new AlbumVO();
			vo.setFileName(fileInfo.getName());
			vo.setFilePath(fileInfo.getPath());
			vo.setLastModified(AlbumUtil.castLongToDateString(fileInfo.lastModified()));
			vo.setTotalSpace(AlbumUtil.castByteToGigaByte(fileInfo.getTotalSpace()));
			vo.setUsableSpace(AlbumUtil.castByteToGigaByte(fileInfo.getUsableSpace()));
			vo.setIsDirectory(fileInfo.isDirectory());
			vo.setIsImageFile(AlbumUtil.isValidationImage(fileInfo));
			
			AlbumList.add(vo);
		}
		
		responseAlbumVO.setTotal(AlbumList.size());
		responseAlbumVO.setResult(AlbumList);
		
		return responseAlbumVO;
	}

}
