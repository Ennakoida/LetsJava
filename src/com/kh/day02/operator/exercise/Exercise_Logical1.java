package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		// 변수 num에 초기화
		// 1부터 100사이의 숫자인가? : true
		
		System.out.println("정수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean result = (num >= 1 && num <= 100);
		System.out.println(result);
	
	}
}
