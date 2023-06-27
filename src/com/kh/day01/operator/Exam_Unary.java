package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) {
//		// 단항연산자
//		int a = 1;
//		System.out.println(a++); // 후위연산
//		// -> a = 2
//		System.out.println(++a); // 전위연산
//		// a -> 3
//		System.out.println(a);
		
		// 문제1
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		// a = 11, b = 20, c = 30
		b = (--a) + b;
		// a = 10, b = 30, c = 30
		c = (a++) + (--b);
		// a = 11, b = 29, c = 39
		
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
		
		// 문제2
		boolean flag = true;
		System.out.println(!!!!flag); // true
		
		
		// 문제3
		int x = 100, y = 33, z = 0;
		x--;
		// x = 99, y = 33, z = 0
		z = x-- + --y; // 99 + 32
		// x = 98, y = 32, z = 131
		x = 99 + x++ + x; // 99 + 98 + 99
		// x = 296, y = 32, z = 131
		y = y-- + y + ++y; // 32 + 31 + 32 
		// x = 296, y = 95, z = 131
		
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
	}
}
