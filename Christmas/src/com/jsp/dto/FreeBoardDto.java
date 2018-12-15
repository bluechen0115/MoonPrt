package com.jsp.dto;

import java.util.Date;

public class FreeBoardDto {
	
	private int bno;
	private String writer;
	private String contents;
	private Date WriteDate;
	private String title;
	
	public FreeBoardDto(){}
	
	public FreeBoardDto(int bno, String writer, String contents, Date writeDate, String title) {
		super();
		this.bno = bno;
		this.writer = writer;
		this.contents = contents;
		WriteDate = writeDate;
		this.title = title;
	}

	@Override
	public String toString() {
		return "FreeBoardDto [bno=" + bno + ", writer=" + writer + ", contents=" + contents + ", WriteDate=" + WriteDate
				+ "]";
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getWriteDate() {
		return WriteDate;
	}

	public void setWriteDate(Date writeDate) {
		WriteDate = writeDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	


}
