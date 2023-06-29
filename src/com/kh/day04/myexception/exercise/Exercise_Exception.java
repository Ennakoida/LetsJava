package com.kh.day04.myexception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void exercise1() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력받는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		// 1. num1 cannot be resolved to a variable
		// int num1, num2;
		// 2. The local variable num1 may not have been initialized
		// num1 = 0; num2 = 0;
		
		while(true) {			
			try {
				System.out.print("정수를 2개 입력하시오. : ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int result = num1 / num2;			
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.\n", num1, num2, result);
			} catch (ArithmeticException e) { // e : class ArithmeticException 를 참조하는 참조변수
				System.out.println("0으로 나눌 수 없습니다!");
//					exercise1();
			} catch (InputMismatchException e) { // import 해주기
				System.out.println("문자가 아닌 숫자를 입력하세요.");
				sc.next(); // 무한반복 없애기
			}
		}
	}
	
	
	public void practice2() {
		// 세개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("3개의 정수를 입력하세요. : ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				int sum = num1 + num2 + num3;
				
				System.out.println("세 정수의 합 : " + sum);
			} catch (InputMismatchException e) {
				System.out.println("문자가 아닌 정수를 입력하세요.");
				sc.next();
			}			
		}
		
		
	}
}
