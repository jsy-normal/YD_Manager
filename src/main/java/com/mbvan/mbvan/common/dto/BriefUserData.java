package com.mbvan.mbvan.common.dto;

/**
 * 
 * data structure for user brief info
 *
 */
public class BriefUserData {
	private Long userId;

	private String userName;

	private String emailAddress;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	
}
