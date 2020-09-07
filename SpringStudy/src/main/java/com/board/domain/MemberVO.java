package com.board.domain;

import java.util.Date;

public class MemberVO {

	/*
	CREATE TABLE member (
	userId VARCHAR(20) NOT NULL,
	userPw VARCHAR(100) NOT NULL,
	userName VARCHAR(30) NOT NULL,
	regDate TIMESTAMP NOT NULL DEFAULT NOW(),
	PRIMARY KEY(userId)
)
	*/
	
	private String userId;
	private String userPw;
	private String userName;
	private Date regDate;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
