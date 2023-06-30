package com.kh.day05;

import java.util.Scanner;

import com.kh.day05.oop.Book;
import com.kh.day05.oop.Circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Day05_Run {
//	public static void main(String [] args) {
//		
//		// 객체 생성
//		// new Circle() : 객체
//		// circle : 참조변수
//		Circle circle = new Circle(); // 다 다른 서클 여러개를 만들 수 있음
//		Circle circle2 = new Circle();
//		Circle circle3 = new Circle();
//		Circle circle4 = new Circle();
//		
//		// 결과값이 다 다르다!
//		circle.radius = 100;
//		circle2.radius = 1000;
//		circle3.radius = 10000;
//		
//		System.out.println(circle.getArea());
//		System.out.println(circle2.getArea());
//		System.out.println(circle3.getArea());
//	}
	
	// 재사용이 가능함
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
//		Circle pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
		
		Circle pizza = new Circle(10, "청년피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		// 선언과 초기화를 동시에 함
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "청년도넛";
		Circle donut = new Circle(2, "청년도넛");
		area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f\n", donut.name, area);
		
		// =========================================================
		
		Rectangle rec = new Rectangle();
		System.out.print("너비를 입력해주세요. : ");
		rec.width = sc.nextInt();
		System.out.print("높이를 입력해주세요. : ");
		rec.height = sc.nextInt();
		System.out.println("직사각형의 면적 : " + rec.getArea());
		
		// =========================================================
		
//		Book littlePrince = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생텍쥐페리";
		
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향뎐");
		
		System.out.println(littlePrince.title + ", " + littlePrince.author);
		System.out.println(loveStory.title + ", " + loveStory.author); // loveStory.author 는 없어서 null로 출력
				
	}
}
