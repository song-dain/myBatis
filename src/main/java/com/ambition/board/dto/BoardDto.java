package com.ambition.board.dto;

import java.sql.Date;

public class BoardDto {
	
	private String boardNo;
	private String nickname;
	private String boardtitle;
	private String boardBody;
	private java.sql.Date createDate;
	
	public BoardDto(String boardNo, String nickname, String boardtitle, String boardBody, Date createDate) {
		super();
		this.boardNo = boardNo;
		this.nickname = nickname;
		this.boardtitle = boardtitle;
		this.boardBody = boardBody;
		this.createDate = createDate;
	}
	public String getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}
	public String getNickName() {
		return nickname;
	}
	public void setNickName(String nickName) {
		this.nickname = nickName;
	}
	public String getBoardtitle() {
		return boardtitle;
	}
	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}
	public String getBoardBody() {
		return boardBody;
	}
	public void setBoardBody(String boardBody) {
		this.boardBody = boardBody;
	}
	public java.sql.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.sql.Date createDate) {
		this.createDate = createDate;
	}
	

}
