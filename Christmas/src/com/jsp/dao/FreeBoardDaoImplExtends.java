package com.jsp.dao;

public class FreeBoardDaoImplExtends extends FreeBoardDaoImpl{

	private static FreeBoardDaoImplExtends instance=new FreeBoardDaoImplExtends();
	private FreeBoardDaoImplExtends() {}
	public static FreeBoardDaoImplExtends getInstance() {
		return instance;
	}
	
}
