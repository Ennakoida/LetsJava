package com.kh.day01;

public class Hello {
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		int i = 20, s = 0;
		char a;
		
		a = '?';
		s = sum(i, 10);
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}

// 주석 : ctrl + shift + c
// 한 줄 지우기 : ctrl + d