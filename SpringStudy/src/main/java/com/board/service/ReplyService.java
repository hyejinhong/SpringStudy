package com.board.service;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyService {

	// ��� ��ȸ
	public List<ReplyVO> readReply(int id) throws Exception;
	
	// ��� ����
	public void write(ReplyVO vo) throws Exception;
}
