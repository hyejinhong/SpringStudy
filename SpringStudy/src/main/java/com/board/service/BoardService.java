package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {

	// �Խù� ���
	public List<BoardVO> list(int displayPost, int postNum, String searchType, String keyword) throws Exception;
	
	// �Խù� �ۼ�
	public void write(BoardVO vo) throws Exception;
	
	// �Խù� ��ȸ
	public BoardVO view(int id) throws Exception;
	
	// �Խù� ��ȸ�� �ø���
	public void hit(int id) throws Exception;
	
	// �Խù� ����
	public void modify(BoardVO vo) throws Exception;
	
	// �Խù� ����
	public void delete(int id) throws Exception;
	
	// �Խù� �� ����
	public int count(String searchType, String keyword) throws Exception;
}
