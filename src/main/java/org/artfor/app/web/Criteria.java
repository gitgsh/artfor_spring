package org.artfor.app.web;

public class Criteria {
	
	private int pageNum;
	private int amount;
	
	private String searchCondition; // 검색을 위한 변수 추가
	private String searchKeyword; // 검색을 위한 변수 추가
	
	public Criteria() {
		this(1, 10); // 1페이지, 10개 게시글
	}

	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		return searchCondition==null? new String[] {}: searchCondition.split("");
		//TC이면 T하나 C하나 잘라 배열로 만듦 
	}
	
	public Criteria(int pageNum, int amount, String searchCondition, String searchKeyword) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + pageNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Criteria other = (Criteria) obj;
		if (amount != other.amount)
			return false;
		if (pageNum != other.pageNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + "]";
	}
	
	

	
	
}
