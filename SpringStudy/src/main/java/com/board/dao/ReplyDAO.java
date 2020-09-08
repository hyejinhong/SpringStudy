package com.board.dao;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyDAO {
	
	// ��� ��ȸ
	public List<ReplyVO> readReply(int id) throws Exception;
	
	// ��� �ۼ�
	public void write(ReplyVO vo) throws Exception;
}
