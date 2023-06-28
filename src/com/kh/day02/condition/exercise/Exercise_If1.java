package com.kh.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String [] args) {
		//점수와 학년을 입력 받아 60점 이상이면 합격, 
		//미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
		
		System.out.println("점수와 학년을 출력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int grade = sc.nextInt();
		String result;
		
		if (grade == 4) {
			if (score >= 70)
				result = "합격";
			else
				result = "불합격";
		} else {
			if (score >= 60)
				result = "합격";
			else
				result = "불합격";
		}
		
//		if(score >= 60) {
//			if(grade != 4) {
//				//합격
//			} else if(score >= 70) {
//				// 합격
//			} else {
//				// 불합격
//			}
//		} else {
//			// 불합격
//		}
		
		
		System.out.println(result);
		
	}
}
