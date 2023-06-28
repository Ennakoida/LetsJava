package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
