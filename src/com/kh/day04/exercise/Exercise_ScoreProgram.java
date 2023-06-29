package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select = 0, kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0;
//		boolean flag = true;
		
//		while(flag) {
		finish : // 종료지점 선택 (break finish;)
		while(true) {
			System.out.println("======= 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();		
				
				sum = kor + eng + math;
				avg = (double) sum / 3;
				
				break;
				
			case 2:						
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + sum);
				System.out.printf("평균 : %.2f\n", avg);
				
				break;
				
			case 3:
				System.out.println("====== 종료 ======");
				System.out.println("프로그램을 종료합니다.");
//				flag = false;
//				break;
				break finish;
				
			default :
				System.out.println("잘못입력하셨습니다. 메뉴(1~3)를 선택해주세요.");
			}
		}
		
		
		
			
	}
}
