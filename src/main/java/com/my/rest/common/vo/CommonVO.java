package com.my.rest.common.vo;

import java.io.Serializable;

public class CommonVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String commonCode;
	private String commonMessage;
	
	public String getCommonCode() {
		return commonCode;
	}
	public void setCommonCode(String commonCode) {
		this.commonCode = commonCode;
	}
	public String getCommonMessage() {
		return commonMessage;
	}
	public void setCommonMessage(String commonMessage) {
		this.commonMessage = commonMessage;
	}
	
}
