package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {

	// 게시물 목록
	public List<BoardVO> list(int displayPost, int postNum, String searchType, String keyword) throws Exception;
	
	// 게시물 작성
	public void write(BoardVO vo) throws Exception;

	// 게시물 조회
	public BoardVO view(int id) throws Exception;
	
	// 게시물 조회수 올리기
	public void hit(int id) throws Exception;
	
	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;
	
	// 게시물 삭제
	public void delete(int id) throws Exception;
	
	// 게시물 갯수
	public int count(String searchType, String keyword) throws Exception;
}
