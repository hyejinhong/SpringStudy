package com.board.domain;

public class Page {
	
	private int page;			// ���� ������ ��ȣ
	private int count;			// �Խù� �� ����
	private int postNum = 10;	// �� �������� ��µ� ����
	private int pageNum;		// �������� �� ��ΰ�
	private int displayPost;	// ����� �Խù�
	private int pageNumCnt = 10;// �� ȭ�鿡 ��� ������ �����ٰ���
	private int endPageNum;		// ǥ�õǴ� ������ ������ ��ȣ
	private int startPageNum;	// ǥ�õǴ� ������ ���� ��ȣ
	
	private boolean prev;		// ���� ��ư ��� ����
	private boolean next;		// ���� ��ư ��� ����
	
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
		endPageNum = (int) (Math.ceil((double)page / (double)pageNumCnt) * pageNumCnt); // ǥ�õǴ� ������ ������ ��ȣ
		startPageNum = endPageNum - (pageNumCnt - 1); // ǥ�õǴ� ù��° ������ ��ȣ
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
