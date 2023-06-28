package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;

		// while(true)
		while(i < 3) {
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			String cal = sc.next();
			int result = 0;
			
			switch(cal) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
			}
			
			System.out.println(num1 + " " + cal + " " + num2 + " = " + result);
			i++;
		}
		
	}
}
