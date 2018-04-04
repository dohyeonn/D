package com.my.rest.album.vo;

import java.util.List;

import com.my.rest.common.vo.CommonVO;

public class ResponseAlbumVO extends CommonVO {

	private static final long serialVersionUID = 1L;

	private long total;
	private List<AlbumVO> result;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<AlbumVO> getResult() {
		return result;
	}
	public void setResult(List<AlbumVO> result) {
		this.result = result;
	}
	
}
