package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While1 {
	public static void main(String [] args) {
//		while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 입력한 수의 합을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int input = 0, sum = 0;
		
		while (true) {
			System.out.print("정수를 입력하세요. : ");
			input = sc.nextInt();
			if(input == -1) {
				break;
			}
			sum += input;
		}
		
		// 무한반복 :
		// while(true)
		// for(;;)
		
		
		System.out.println("합 : " + sum);
	}
}
