package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_Loop {
	// ===================== for ========================
	public void forExercise1(){
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i != 10)
				System.out.print(i + " + ");
			else 
				System.out.print(i + " = ");
			
			sum += i;
		}
		
		System.out.println(sum);
	}

	public void forExercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		
		System.out.print("정수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9) {
			for(int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			
		} else 
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다");
	}
	
	
	// ===================== for double ========================
	public void forDoubleExercise1() {
		// 구구단 출력
		
//		for(int i = 2; i < 10; i++) {
//			System.out.println(i + "단");
//			for (int h = 1; h < 10; h++) {
//				System.out.println(i + " * " + h + " = " + (i * h));
//			}			
//			System.out.println();
//		}
		System.out.println("2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.\n");
		for(int n = 1; n < 10; n++) {
			for(int i = 2; i < 10; i++) {
				System.out.print(i + " * " + n + " = " + (i * n) + "\t");
			}	
			System.out.println();
		}
	}
	
	public void forDoubleExercise2() {
		System.out.println("0시 0분부터 23시 59분까지 출력하기!");
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
//				System.out.println(i + "시 " + j + "분");
				
				// 줄맞춤 해주기 - printf
				// %d : 숫자
				// %s : 문자
				// %f : 실수
				System.out.printf("%2d시 %2d%s\n", i, j, "분");
			}
		}
	}
	
	public void forDoubleExercise3() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	// ===================== while ========================
	public void whileExercise1() {
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
	
	public void whileExercise2() {
//		while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오
		
		int i = 0, sum = 0;
		while (i <= 100) {
			if(i % 2 != 0)
				sum += i;
			
			i++;
		}
		
		System.out.println("1 ~ 100 사이 홀수의 합 : " + sum);
	}
	
}
