package com.board.dao;

import com.board.domain.MemberVO;

public interface MemberDAO {

	// ȸ������
	public void register(MemberVO vo) throws Exception;
	
	// �α���
	public MemberVO login(MemberVO vo) throws Exception;
}
