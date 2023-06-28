package com.kh.day03.array.exercise;

import java.util.Scanner;

// 반복문_실습문제_02
public class Exercise_ArrayHome2 {
	Scanner sc = new Scanner(System.in);

//	1번
//	1부터 사용자에게 입력 받은 수까지 중에서
//	1) 2와 3의 배수를 모두 출력하고
//	2) 2와 3의 공배수의 개수를 출력하세요.
	public void home2Exercise1() {
		System.out.print("숫자를 하나 입력하세요. : ");
		int num = sc.nextInt(); // 한 개의 값 입력받기
		int cnt = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0)  // 2와 3의 배수
				System.out.print(i + " ");
			
			if(i % 2 == 0 && i % 3 == 0) // 공배수의 수
				cnt++;
		}
		
		System.out.println("\n2와 3의 공배수의 개수 : " + cnt);
	}

	
//  2번
//	다음과 같은 실행 예제를 구현하세요.
//	ex. 정수 입력 : 3
//	*
//	**
//	***
//	**
//	*
	public void home2Exercise2() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = num - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
//	3번	
//  다음과 같은 실행 예제를 구현하세요.
//	ex. 정수 입력 : 4
//  *
//  ***
//  *****
//  *******    
	public void home2Exercise3() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < (2 * i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
//	4번
//	다음과 같은 실행 예제를 구현하세요.
//	ex. 정수 입력 : 5
//	*****
//	*   *
//	*   *
//	*   *
//	*****
	public void home2Exercise4() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			if(i == 0 || i == (num - 1)) {
				for(int j = 0; j < num; j++)
					System.out.print("*");
				System.out.println();
			} else {
				for(int j = 0; j < num; j++) {
					if(j == 0 || j == (num - 1))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();				
			}
		}
	}

//	5번
//	사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//	단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	public void home2Exercise5() {
		System.out.print("숫자를 하나 입력하세요. : ");
		int num = sc.nextInt();
		int cnt = 0;
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) { // 소수 : 1과 자기자신만 배수인 경우
				cnt++;
			}
		}
		
		if(cnt == 0)
			System.out.println(num + "은 소수입니다.");
		else
			System.out.println(num + "은 소수가 아닙니다.");
	}

//	6번
//	위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
//	“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
	public void home2Exercise6() {
		for(;;) {
			System.out.print("숫자를 하나 입력하세요. : ");
			int num = sc.nextInt();
			int cnt = 0;
			
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다.");
				continue; // 재입력
			}
			
			for(int i = 2; i < num; i++) {
				if(num % i == 0) { // 소수 : 1과 자기자신만 배수인 경우
					cnt++;
				}
			}
			
			if(cnt == 0)
				System.out.println(num + "은 소수입니다.");
			else
				System.out.println(num + "은 소수가 아닙니다.");
			
			return; // 제대로 입력 시, 소수 여부 판별 출력 후 종료
		}
	}

	
//	7번
//	2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//	단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	public void home2Exercise7() {
		System.out.print("숫자를 하나 입력하세요. : ");
		int num = sc.nextInt();
		int isPrimeCnt = 0; // 소수 개수
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.print("소수 : ");
		for(int j = 2; j <= num; j++) {
			int cnt = 0; // 소수 판별용 변수
			for(int i = 2; i < j; i++) {
				if(j % i == 0) {
					cnt++;
				}
			}
			
			if(cnt == 0) {
				isPrimeCnt++;
				System.out.print(j + " ");
			}
		}
		System.out.println("\n소수의 개수 : " + isPrimeCnt);
		
	}
}
