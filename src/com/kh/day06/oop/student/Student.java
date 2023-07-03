package com.kh.day06.oop.student;

public class Student {
	// 이름
	// 첫번째 성적
	// 두번째 입력
	// 평균 출력
	
	private String name;
	private int score1, score2;
	
	public Student() {
		
	}
	
	public Student(String name, int score1, int score2) {
		this.name= name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public double getAvg() {
		double avg = (double)(score1 + score2) / 2;
		return avg;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getFirstScore() {
		return this.score1;
	}

	public int getSecondScore() {
		return this.score2;
	}
	
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFirstScore(int score1) {
		this.score1 = score1;
	}
	
	public void setSecondScore(int score2) {
		this.score2 = score2;
	}
}
