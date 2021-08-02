package com.busan.fronend.dto;

import java.sql.Timestamp;


// ~Dto(Data Transfer Object), ~Vo(Value Object) : JavaBean �̶� �θ�, ���̺� �ִ� �� ���ڵ� ���� ��� ��Ȱ�� �ϰų�
// ȭ��(View)���� ����ڰ� �Է��ϴ� ���� �����ϴ� ������ ��

// lombok.jar�� �̿��ϸ� set, get �޼ҵ带 ������ �ʾƵ� ����� �����

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
