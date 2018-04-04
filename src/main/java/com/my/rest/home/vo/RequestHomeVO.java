package com.my.rest.home.vo;

import com.my.rest.common.vo.CommonVO;

public class RequestHomeVO extends CommonVO{

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}