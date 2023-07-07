package com.kh.day10.collection.student;

public class Student {
	// 이름
	// 점수1
	// 점수2
	private String name;
	private int score1;
	private int score2;
	
	public Student() {}
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	// getter : 매개변수x 반환형o
	public String getName() {
		return name;
	}
	
	// setter : 매개변수o 변환형	x
	public void setName(String name) {
		this.name = name;
	}
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public int getScore2() {
		return score2;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : " + this.name + ", score1 : " + this.score1 + ", score2 : " + this.score2;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.name + this.score1 + this.score2).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student) obj;
			return this.hashCode() == std.hashCode();
		} 
		return false;
	}
}
