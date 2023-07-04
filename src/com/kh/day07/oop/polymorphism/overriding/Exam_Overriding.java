package com.kh.day07.oop.polymorphism.overriding;

public class Exam_Overriding {
	
	static void paint(Shape shape) {
		// 1. 오버라이딩은 상속관계에서 사용가능
		// 2. 오버러ㅏ이딩은 다 똑같고 실행문만 다르게
		// 3. 오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있음
		shape.draw(); // 동적 바인딩
		// 오버라이딩 되어잇으면 오버라이딩 되어있는 메소드로 출력함
		// 업캐스팅에 의해 슈퍼 클래스 레퍼런스로 오버라이딩된 메소드 호출 -> 동적 바인딩
	}
	
//	static void paint(Line line) {
//		line.draw();
//	}
//	
//	static void paint(Circle circle) {
//		circle.draw();
//	}
//	
//	static void paint(Rect rect) {
//		rect.draw();
//	}
//	
	public static void main(String[] args) {
		paint(new Line());
		paint(new Circle());
		paint(new Rect());
//		Line line = new Line();
//		line.draw();
//		
//		Circle circle = new Circle();
//		circle.draw();
	}
}
