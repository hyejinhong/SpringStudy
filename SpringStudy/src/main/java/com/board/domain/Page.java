package com.board.domain;

public class Page {
	
	private int page;			// 현재 페이지 번호
	private int count;			// 게시물 총 갯수
	private int postNum = 10;	// 한 페이지에 출력될 갯수
	private int pageNum;		// 페이지가 총 몇개인가
	private int displayPost;	// 출력할 게시물
	private int pageNumCnt = 10;// 한 화면에 몇개의 페이지 보여줄건지
	private int endPageNum;		// 표시되는 페이지 마지막 번호
	private int startPageNum;	// 표시되는 페이지 시작 번호
	
	private boolean prev;		// 이전 버튼 출력 여부
	private boolean next;		// 다음 버튼 출력 여부
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
		calculate();
	}
	public int getPostNum() {
		return postNum;
	}
	public int getPageNum() {
		return pageNum;
	}
	public int getDisplayPost() {
		return displayPost;
	}
	public int getPageNumCnt() {
		return pageNumCnt;
	}
	public int getEndPageNum() {
		return endPageNum;
	}
	public int getStartPageNum() {
		return startPageNum;
	}
	public boolean isPrev() {
		return prev;
	}
	public boolean isNext() {
		return next;
	}
	
	private void calculate() {
		endPageNum = (int) (Math.ceil((double)page / (double)pageNumCnt) * pageNumCnt); // 표시되는 마지막 페이지 번호
		startPageNum = endPageNum - (pageNumCnt - 1); // 표시되는 첫번째 페이지 번호
		int endPageNumTmp = (int) (Math.ceil((double) count / (double)pageNumCnt));
		if(endPageNum > endPageNumTmp) {
			endPageNum = endPageNumTmp;
		}
		
		prev = startPageNum == 1 ? false : true;
		next = endPageNum * pageNumCnt >= count ? false : true;

		displayPost = (page-1) * postNum;
		
		System.out.println("endPageNum: " + endPageNum);
	}
}
