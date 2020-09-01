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
	
	// �Խù� ���
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

	// �Խù� �ۼ�
	@Override
	public void write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".write", vo);
	}

	// �Խù� ��ȸ
	@Override
	public BoardVO view(int id) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".view", id);
//		return null;
	}
	
	// �Խù� ��ȸ�� �ø���
	@Override
	public void hit(int id) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".hit", id);
	}

	// �Խù� ����
	@Override
	public void modify(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".modify", vo);
	}

	// �Խù� ����
	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".delete", id);
	}

	// �Խù� ����
	@Override
	public int count(String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		
		HashMap data = new HashMap();
		data.put("searchType", searchType);
		data.put("keyword", keyword);
		
		return sql.selectOne(namespace + ".count", data);
	}


}
