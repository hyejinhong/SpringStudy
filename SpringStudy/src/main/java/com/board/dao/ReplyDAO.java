package com.board.dao;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyDAO {
	
	// ¥Ò±€ ¡∂»∏
	public List<ReplyVO> readReply(int id) throws Exception;
	
	// ¥Ò±€ ¿€º∫
	public void write(ReplyVO vo) throws Exception;
}
