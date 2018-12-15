  package com.jsp.service;

import java.util.List;

import com.jsp.dto.FreeBoardDto;

public interface FreeBoardService {
	
	public void WriteBoard(FreeBoardDto board);
	public void ChangeBoard(FreeBoardDto board);
	public void TerminateBoard(int bno);
	public List<FreeBoardDto> ShowBoardAll();
	public FreeBoardDto ShowBoardParts(int bno);

}
