package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args) {
		System.out.println("0시 0분부터 23시 59분까지 출력하기!");
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
//				System.out.println(i + "시 " + j + "분");
				
				// 줄맞춤 해주기 - printf
				// %d : 숫자
				// %s : 문자
				// %f : 실수
				System.out.printf("%2d시 %2d%s\n", i, j, "분");
			}
		}
	}
}
