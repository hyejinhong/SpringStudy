package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {

	// �Խù� ���
	public List<BoardVO> list() throws Exception;
	
	// �Խù� �ۼ�
	public void write(BoardVO vo) throws Exception;

	// �Խù� ��ȸ
	public BoardVO view(int id) throws Exception;
	
	// �Խù� ����
	public void modify(BoardVO vo) throws Exception;
}
