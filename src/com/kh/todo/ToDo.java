package com.kh.todo;

public class ToDo {
	private int index;
	private String list;
	
	public ToDo() {
		index = 0;
		list = "";
	}
	
	public ToDo(int index, String list) {
		this.index = index;
		this.list = list;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}
}
