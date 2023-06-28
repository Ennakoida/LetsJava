package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	public void exercise1() {
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 5개를 입력하시오. : ");
		int nums[] = new int[5];
		int max = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
//			if (nums[i] <= 0) {
//				System.out.println("양수를 입력해주세요.");
//				break;
//			}
			if(max < nums[i])
				max = nums[i];
		}
		
//		for(int i = 0; i < nums.length; i++) {
//			if(max < nums[i])
//				max = nums[i];
//		}
		
		System.out.println("최댓값 :" + max);
	}
	
	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라. (단, 배열의 크기는 5이다.)
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하시오.");
		
		int arr [] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i]; 
		}

		System.out.println("평균 : " + (double)sum / arr.length); // 하나 형변환 해주면 나머지 하나 자동 형변환
	}
	
	
	// 배열 복사
	public void arrayCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 230515-1231514 -> 230515-1******
		// 231026-1231515 -> 231026-1******
		
		System.out.print("주민번호를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		String memberNum = sc.next();
		
		char origin[] = new char[14];
		char copy[] = new char[14];
		
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		
		for(int i = 0; i < origin.length; i++) { // 깊은복사
			if(i < 8) 					// 성별자리 전까지 차례대로 값을 대입
				copy[i] = origin[i];
			else 						// 성별자리 이후에는 * 처리
				copy[i] = '*';
		}
		
		for(int i = 0; i < origin.length; i++)
			System.out.print(copy[i]);
	}
	
	
	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		
		Random rand = new Random(); // 난수생성
		int lotto[] = new int[6]; // 추첨 번호 6개
		
		for(int i = 0; i < lotto.length; i++) {
			// 일단 추출부터... 
			lotto[i] = rand.nextInt(45) + 1; // 1 ~ 45 중 난수

			// 중복없이추출
		}
		
	}
	
}
