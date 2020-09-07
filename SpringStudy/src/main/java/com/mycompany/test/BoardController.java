package com.mycompany.test;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.domain.Page;
import com.board.service.BoardService;

@Controller("boardController")
@RequestMapping("/board/")
public class BoardController {

//	@Inject
//	@Autowired
	
	@Resource
	BoardService service;
	
	// �Խù� ���
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void getList(Model model, @RequestParam("page") int page,
			@RequestParam(value="searchType", required=false, defaultValue="title") String searchType,
			@RequestParam(value="keyword", required=false, defaultValue="") String keyword) throws Exception {
		
		Page pagination = new Page();
		
		pagination.setPage(page);
		pagination.setCount(service.count(searchType, keyword));
//		pagination.setSearchTypeKeyword(searchType, keyword);
		pagination.setSearchType(searchType);
		pagination.setKeyword(keyword);

		
		List<BoardVO> list = null;
		list = service.list(pagination.getDisplayPost(), pagination.getPostNum(), searchType, keyword);

		model.addAttribute("list", list);
		model.addAttribute("cur", page);
		model.addAttribute("pagination", pagination);
//		model.addAttribute("searchType", searchType);
//		model.addAttribute("keyword", keyword);
	}
	
	// �Խù� �ۼ�
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public void getWrite(HttpSession session, Model model) throws Exception {
		Object loginInfo = session.getAttribute("member");
		
		if(loginInfo == null) {
			model.addAttribute("msg", false);
		}
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		service.write(vo);
		return "redirect:/board/list?page=1";
	}
	
	// �Խù� ��ȸ
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public void getView(@RequestParam("id") int id, Model model) throws Exception {
		service.hit(id);
		BoardVO vo = service.view(id);
		model.addAttribute("view", vo);
	}
	
	// �Խù� ����
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void getModify(@RequestParam("id") int id, Model model) throws Exception {
		BoardVO vo = service.view(id);
		model.addAttribute("view", vo);
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String postModify(BoardVO vo) throws Exception {
		service.modify(vo);
		return "redirect:/board/view?id="+vo.getId();
	}
	
	// �Խù� ����
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String getDelete(@RequestParam("id") int id) throws Exception {
		service.delete(id);
		return "redirect:/board/list?page=1";
	}
}
