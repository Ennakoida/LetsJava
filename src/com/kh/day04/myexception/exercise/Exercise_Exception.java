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
	
	
	public void exercise2() {
		// 세개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			try {
//				System.out.print("3개의 정수를 입력하세요. : ");
//				int sum = 0;
//				for(int i = 0; i < 3; i++) {
//					System.out.print(i + ">>");
//					sum += sc.nextInt();
//				}
//				
//				System.out.println("세 정수의 합 : " + sum);
//			} catch (InputMismatchException e) {
//				System.out.println("문자가 아닌 정수를 입력하세요.");
//				sc.next();
//			}		
//		}
		
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0;
		for(int i=0; i<3; i++) {
			System.out.print(i + ">>");
//			int num = scanner.nextInt();
			
			try {
				sum += sc.nextInt();			
			}
			catch (InputMismatchException e) { // 정수가 아닐 때만 재입력 무한루프
				System.out.println("정수가 아닙니다. 다시 입력하세요!!"); 
				sc.next(); // 입력한 문자를 제거함
				i--;		// 2에서 다시 1로 i값을 만들어줌. i++만나서 증가하도록 하기 위함
				continue;	// i++로 가게 해줌
			}
		}
		System.out.printf("합은 %d", sum);
	}
	
	
	public void exercise3() {
		// 범위를 벗어난 배열의 접근
		int [] intArrs = new int[5];
		
		try {
			System.out.println(intArrs[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
	
	
	public void exercise4() {
		// 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
		// (NumberFormatException)
		
		String str[] = new String[2];
		str[0] = "1026";
		str[1] = "5.15";
		
		// String -> int
		try {
			int result = Integer.parseInt(str[0]);
			System.out.printf("숫자로 변환된 값은 %d\n", result);
			
			int check = Integer.parseInt(str[1]);
			System.out.printf("숫자로 변환된 값은 %d\n", check);			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다.");
		}
		
//		double check = Double.parseDouble(str[1]);
//		System.out.printf("숫자로 변환된 값은 %.2f", check);
		
	}
}
