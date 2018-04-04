package com.my.web.album.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumController {

	@RequestMapping(value = "/album", method = RequestMethod.GET)
	public String viewAlbumPage() {
		return "album/album";
	}
}
