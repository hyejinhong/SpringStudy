package com.board.domain;

import java.util.Date;

public class BoardVO {

	/*
	CREATE TABLE bd (
	id INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	content TEXT NOT null,
	writer VARCHAR(30) NOT NULL,
	regDate TIMESTAMP NOT NULL DEFAULT NOW(),
	hit INT DEFAULT 0,
	PRIMARY KEY (id)
	);
	*/
	
	private int id;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int hit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
