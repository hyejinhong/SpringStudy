package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.ReplyDAO;
import com.board.domain.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;
	
	// ¥Ò±€ ¡∂»∏
	@Override
	public List<ReplyVO> readReply(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.readReply(id);
	}

	// ¥Ò±€ ¿€º∫
	@Override
	public void write(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
	}

}
