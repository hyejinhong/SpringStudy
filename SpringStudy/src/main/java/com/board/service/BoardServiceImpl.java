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
	
	// 게시물 목록
	@Override
	public List<BoardVO> list(int displayPost, int postNum, String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(displayPost, postNum, searchType, keyword);
//		return null;
	}

	// 게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
	}

	// 게시물 조회수
	@Override
	public BoardVO view(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(id);
//		return null;
	}

	// 게시물 조회수 올리기
	@Override
	public void hit(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.hit(id);
	}

	
	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	// 게시물 총 갯수
	@Override
	public int count(String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return dao.count(searchType, keyword);
	}


}
