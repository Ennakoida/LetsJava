package com.kh.todo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ToDo {
	private int index;
	private String list;
	private String due;// 마감일
	private String today; // 오늘 날짜 ->>>>>>>>> 이건 출력할필요없을듯????????????????????
	private int dDay; // d-day
	
	public ToDo() {
		index = 0;
		list = "";
		due = "";
		today = "";
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
	
	public String getToday() {
		return today;
	}
	
	public void setToday(String today) {
		this.today = today;
	}

	public int getdDay() {
		return dDay;
	}

	public void setdDay(int dDay) {
		this.dDay = dDay;
	}
}
