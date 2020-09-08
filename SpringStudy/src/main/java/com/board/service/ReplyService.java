package com.board.service;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyService {

	// ´ñ±Û Á¶È¸
	public List<ReplyVO> readReply(int id) throws Exception;
	
	// ´ñ±Û ¾²±â
	public void write(ReplyVO vo) throws Exception;
}
