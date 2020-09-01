package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	// �Խù� ���
	@Override
	public List<BoardVO> list(int displayPost, int postNum, String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(displayPost, postNum, searchType, keyword);
//		return null;
	}

	// �Խù� �ۼ�
	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
	}

	// �Խù� ��ȸ��
	@Override
	public BoardVO view(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(id);
//		return null;
	}

	// �Խù� ��ȸ�� �ø���
	@Override
	public void hit(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.hit(id);
	}

	
	// �Խù� ����
	@Override
	public void modify(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(vo);
	}

	// �Խù� ����
	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	// �Խù� �� ����
	@Override
	public int count(String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return dao.count(searchType, keyword);
	}


}
