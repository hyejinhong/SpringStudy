package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {

	// �Խù� ���
	public List<BoardVO> list() throws Exception;
	
	// �Խù� �ۼ�
	public void write(BoardVO vo) throws Exception;
}
