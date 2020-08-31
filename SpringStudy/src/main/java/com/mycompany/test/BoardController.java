package com.mycompany.test;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller("boardController")
@RequestMapping("/board/")
public class BoardController {

//	@Inject
//	@Autowired
	
	@Resource
	BoardService service;
	
	// 게시물 목록
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void getList(Model model, @RequestParam("page") int page) throws Exception {
		
		int count = service.count();		// 게시물 총 갯수
		int postNum = 10;					// 한 페이지에 몇개 출력?
		int pageNum = (int) Math.ceil((double) count/postNum); // 페이지 갯수
		int displayPost = (page-1) * postNum;
		
		List<BoardVO> list = null;
		list = service.list(displayPost, postNum);

		model.addAttribute("pageNum", pageNum);
		model.addAttribute("list", list);
	}
	
	// 게시물 작성
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public void getWrite() throws Exception {
		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		service.write(vo);
		return "redirect:/board/list";
	}
	
	// 게시물 조회
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public void getView(@RequestParam("id") int id, Model model) throws Exception {
		service.hit(id);
		BoardVO vo = service.view(id);
		model.addAttribute("view", vo);
	}
	
	// 게시물 수정
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
	
	// 게시물 삭제
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String getDelete(@RequestParam("id") int id) throws Exception {
		service.delete(id);
		return "redirect:/board/list";
	}
}
