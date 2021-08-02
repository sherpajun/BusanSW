package com.busan.fronend.dto;

import java.sql.Timestamp;


// ~Dto(Data Transfer Object), ~Vo(Value Object) : JavaBean 이라 부름, 테이블에 있는 각 레코드 값을 담는 역활을 하거나
// 화면(View)에서 사용자가 입력하는 값을 저장하는 역할을 함

// lombok.jar를 이용하면 set, get 메소드를 만들지 않아도 기능이 수행됨

public class BBSDto {
	private int articleNum;
	private String id;
	private String title;
	private String content;
	public int getArticleNum() {
		return articleNum;
	}
	public void setArticleNum(int articleNum) {
		this.articleNum = articleNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getWirteDate() {
		return WirteDate;
	}
	public void setWirteDate(Timestamp wirteDate) {
		WirteDate = wirteDate;
	}
	private Timestamp WirteDate;
}
