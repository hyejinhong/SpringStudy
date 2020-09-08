package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.board.domain.ReplyVO;

@Service
public class ReplyDAOImpl implements ReplyDAO {

	@Inject SqlSession sql;
	
	private static String namespace = "com.board.mappers.reply";
	
	// ¥Ò±€ ¡∂»∏
	@Override
	public List<ReplyVO> readReply(int id) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace + ".readReply", id);
	}

	// ¥Ò±€ ¿€º∫
	@Override
	public void write(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".write", vo);
	}

}
