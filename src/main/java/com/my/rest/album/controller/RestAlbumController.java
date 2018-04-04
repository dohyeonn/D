package com.my.rest.album.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.rest.album.service.impl.AlbumServiceImpl;
import com.my.rest.album.vo.ResponseAlbumVO;

@RestController
@RequestMapping("/rest/album")
public class RestAlbumController {
	
	@Autowired
	private AlbumServiceImpl albumServiceImpl;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public  ResponseAlbumVO selectAlbumList(@RequestParam(required = false) String filePath) {
		return albumServiceImpl.selectAlbumList(filePath);
	}
	
}
