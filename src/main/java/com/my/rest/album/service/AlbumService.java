package com.my.rest.album.service;

import com.my.rest.album.vo.ResponseAlbumVO;

public interface AlbumService {

	public ResponseAlbumVO selectAlbumList(String filePath);
}
