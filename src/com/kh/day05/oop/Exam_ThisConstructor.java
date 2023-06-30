package com.kh.day05.oop;

public class Exam_ThisConstructor {
	public static void main(String [] args) {
		Book2 book = new Book2();
		Book2 loveStory = new Book2("충향뎐");
		System.out.println(loveStory.title + ", " + loveStory.author);
//		Circle2 circle = new Circle2();
//		circle.radius = 10;
//		System.out.println("원의 넓이는 " + circle.getArea());
	}
	
}

// The type Circle is already defined -> Circle2
class Circle2 {
	public int radius;
	public String name;
	
	public Circle2() {
		Circle2 circle = new Circle2();
		circle.radius = 10;
		System.out.println("원의 넓이는 " + circle.getArea());
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

class Book2 {
	public String title, author;
	
	public Book2() {
		System.out.println("Book2 생성자 호출됨");
	}
	
	public Book2(String title) {
//		this.title = title;
//		Book2(title, "작자미상");
		this(title, "작자미상");
	}
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
}