package com.board.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.board.domain.MemberVO;

@Service
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.member";
	
	// ȸ������
	@Override
	public void register(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".register", vo);
	}

}
