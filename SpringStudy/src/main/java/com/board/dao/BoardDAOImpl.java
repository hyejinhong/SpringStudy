package com.board.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;
	
	private String namespace = "com.board.mappers.board";
	
	// 게시물 목록
	@Override
	public List<BoardVO> list(int displayPost, int postNum, String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		HashMap data = new HashMap();
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
		data.put("searchType", searchType);
		data.put("keyword", keyword);
		
		return sql.selectList(namespace + ".list", data);
	}

	// 게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".write", vo);
	}

	// 게시물 조회
	@Override
	public BoardVO view(int id) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".view", id);
//		return null;
	}
	
	// 게시물 조회수 올리기
	@Override
	public void hit(int id) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".hit", id);
	}

	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".modify", vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".delete", id);
	}

	// 게시물 갯수
	@Override
	public int count(String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		
		HashMap data = new HashMap();
		data.put("searchType", searchType);
		data.put("keyword", keyword);
		
		return sql.selectOne(namespace + ".count", data);
	}


}
