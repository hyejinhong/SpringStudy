package com.board.domain;

import java.util.Date;

public class ReplyVO {

	/*
	CREATE TABLE reply (
	id int NOT NULL,
	rid int NOT NULL auto_increment,
	content TEXT NOT NULL,
	writer VARCHAR(30),
	regDate TIMESTAMP NOT NULL DEFAULT NOW(),
	PRIMARY KEY(rid),
	FOREIGN KEY(id)
	REFERENCES bd(id)
	)
	*/
	
	private int id;
	private int rid;
	private String content;
	private String writer;
	private Date regDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
