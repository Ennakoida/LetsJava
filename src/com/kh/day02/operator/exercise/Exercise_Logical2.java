package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		
		System.out.println("문자를 하나 입력하세요.");
		Scanner sc = new Scanner(System.in);
		char word = sc.next().charAt(0); // 문자열에서 첫번째 인덱스값을 자르니까 문자가 됨
		// hello > h만 잘라서 인식
		
		boolean result = (word >= 'A' && word <= 'Z');
		// A : 65 / Z = 90
		
		System.out.println("영어 대문자 확인 : " + result);
	}
}
