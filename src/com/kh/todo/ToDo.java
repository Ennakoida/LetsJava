package com.kh.todo;

public class ToDo {
	private int index;
	private String list;
	private String due;// 마감일
	private int dDay; // d-day
	
	public ToDo() {
		index = 0;
		list = "";
		due = "";
		dDay = 0;
	}
	
	public ToDo(int index, String list) {
		this.index = index;
		this.list = list;
	}
	
	public ToDo(int index, String list, String due, int dDay) {
		this.index = index;
		this.list = list;
		this.due = due;
		this.dDay = dDay;
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
	
	public String getDue() {
		return due;
	}
	
	public void setDue(String due) {
		this.due = due;
	}

	public int getdDay() {
		return dDay;
	}

	public void setdDay(int dDay) {
		this.dDay = dDay;
	}
}
