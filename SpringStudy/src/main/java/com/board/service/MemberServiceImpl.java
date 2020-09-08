package com.board.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.board.dao.MemberDAO;
import com.board.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	// 회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.register(vo);
	}

	// 로그인
	@Override
	public MemberVO login(MemberVO vo, HttpSession session, RedirectAttributes rttr) throws Exception {
		// TODO Auto-generated method stub
		
		MemberVO login = dao.login(vo);
		
		// 로그인 실패
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		}
		// 로그인 성공
		else {
			session.setAttribute("member", login);
		}
		
		return login;
	}

	@Override
	public boolean idCheck(String userId) throws Exception {
		// TODO Auto-generated method stub
		MemberVO checked = dao.idCheck(userId);

		return checked == null ? true : false;
	}

}
