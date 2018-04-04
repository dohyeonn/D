package com.my.rest.album.vo;

import java.io.Serializable;

public class AlbumVO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String fileName;
	private String filePath;
	private String lastModified;
	private long TotalSpace;
	private long usableSpace;
	private boolean isDirectory;
	private boolean isImageFile;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public long getTotalSpace() {
		return TotalSpace;
	}
	public void setTotalSpace(long totalSpace) {
		TotalSpace = totalSpace;
	}
	public long getUsableSpace() {
		return usableSpace;
	}
	public void setUsableSpace(long usableSpace) {
		this.usableSpace = usableSpace;
	}
	public boolean getIsDirectory() {
		return isDirectory;
	}
	public void setIsDirectory(boolean isDirectory) {
		this.isDirectory = isDirectory;
	}
	public boolean getIsImageFile() {
		return isImageFile;
	}
	public void setIsImageFile(boolean isImageFile) {
		this.isImageFile = isImageFile;
	}
	
}
