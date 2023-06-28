package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("논리연산자 예제");
		int num1 = 50, num2 = 30;
		boolean result1, result2, result3, result4;
		
		// 남자이면서 평균평섬 4.3 이상인 사람
		// 컴퓨터공학과 또는 경영학과인 사람
		result1 = (num1 == num2) && (num1 < num2); // false
		result2 = (num1 < num2) || (num1 == num2); // false
		result3 = (num1 > num2) && (num1 != num2); // true
		result4 = (num1 > num2) || (num1 == num2); // true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		// 복사 : ctrl + alt + 하단버튼
	}
}
