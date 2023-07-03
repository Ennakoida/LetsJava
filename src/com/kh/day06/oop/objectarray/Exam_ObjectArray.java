package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {

	public static void main(String[] args) {
//		Circle c = new Circle();
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		
		
		Circle cArray[];
		cArray = new Circle[5];
		
//		Circle c = cArray[0];
		System.out.println(cArray[0]); // 아직 객체 아님 (그냥 공간 -> null)
		// c.radius = 10;
		
		cArray[0] = new Circle(); // 객체가 됨
		System.out.println(cArray[0]); // com.kh.day06.oop.objectarray.Circle@626b2d4a (주소값)
		cArray[0].radius = 10;
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i] = new Circle(); // for문을 이용한 전체 객체 생성
		} // 없으면 -> NullPointerException
		
		cArray[0].radius = 1;
		cArray[1].radius = 2;
		cArray[2].radius = 3;
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		for(int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i].getArea());			
		}
	}

}
