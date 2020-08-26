package com.mycompany.test;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.BoardVO;
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
	public void getList(Model model) throws Exception {
		List<BoardVO> list = null;
		list = service.list();
		
		model.addAttribute("list", list);
	}
	
	// �Խù� �ۼ�
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public void getWrite() throws Exception {
		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		service.write(vo);
		return "redirect:/board/list";
	}
}
