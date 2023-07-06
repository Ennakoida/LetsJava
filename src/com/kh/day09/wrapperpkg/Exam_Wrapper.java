package com.kh.day09.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Integer su = Integer.valueOf(0); // new 안쓴다
//		su = new Integer(0); // The constructor Integer(int) has been deprecated since version 9 and marked for removal
		// deprecated -> 없어질거임!! 쓰지마삼
//		su = null; // null 체크 가능
		
		// 박싱과 언박싱
		su = Integer.valueOf(1026);
		su = 1026; // 오토-박싱
		
		int suNum = su.intValue();
		suNum = su; // 오토-언박싱
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay);
		
		System.out.println(Character.toLowerCase('A')); // 대 > 소문자
		System.out.println(Character.toUpperCase('a')); // 소 > 대문자
	
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) { // 숫자판별
			System.out.println(c1 + "는 숫자입니다.");
		} 
		
		if(Character.isAlphabetic(c2)) { // 영문자판별
			System.out.println(c2 + "는 영문자입니다.");
		}
	}

}
