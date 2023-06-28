package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		// 구구단 출력
		
//		for(int i = 2; i < 10; i++) {
//			System.out.println(i + "단");
//			for (int h = 1; h < 10; h++) {
//				System.out.println(i + " * " + h + " = " + (i * h));
//			}			
//			System.out.println();
//		}
		System.out.println("2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.\n");
		for(int n = 1; n < 10; n++) {
			for(int i = 2; i < 10; i++) {
				System.out.print(i + " * " + n + " = " + (i * n) + "\t");
			}	
			System.out.println();
		}
	}
}
