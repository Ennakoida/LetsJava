package com.kh.day09.exercise;

public class Exercise_Wrapper {
	public static void main(String[] args) {
		// "230515"와 "231026"인 문자열을 계산해서 출력하시오
		String openDay = "230515";
		String closeDay = "231026";
		
		int openDate = Integer.parseInt(openDay);
		int closeDate = Integer.parseInt(closeDay);
		
		System.out.println(openDate);
		System.out.println(closeDate);
		System.out.println("합 : " + (closeDate + openDate));
		System.out.println("차 : " + (closeDate - openDate));
	}
}
