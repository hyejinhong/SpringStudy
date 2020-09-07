package com.board.service;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.board.domain.MemberVO;

public interface MemberService {
	// ȸ������
	public void register(MemberVO vo) throws Exception;
	
	// �α���
	public MemberVO login(MemberVO vo, HttpSession session, RedirectAttributes rttr) throws Exception;
}
