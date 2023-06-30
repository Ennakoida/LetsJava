package com.kh.day05.oop.exercise;

public class Rectangle {
//	너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 
//	너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
//	Rectangle 클래스를 만들어라.
	public int width, height; // 필드
	
	public Rectangle() { // 생성자
		// 초기화 (필드에서도 할 수 있지만, 원칙은 생성자에서 쓰는거임)
		width = 0;
		height = 0;
	};
	
	public int getArea() { // 메소드
		return width * height;
	}
}
