package com.kh.day03.array.exercise;

import java.util.Scanner;

// 반복문_실습문제_01
public class Exercise_ArrayHome1 {
	Scanner sc = new Scanner(System.in);

    //1번
    //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
    //단, 입력한 수는 1보다 크거나 같아야 합니다.
    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	public void home1Exercise1() {
		System.out.print("숫자를 하나 입력하세요. : ");
		int num = sc.nextInt(); // 한 개의 값 입력받기
		int numArr[] = new int[num]; // 배열 선언
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		} else {
			for(int i = 0; i < num; i++) {
				numArr[i] = i + 1;
			}			
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(numArr[i] + " ");
		}
	}	
	

    //2번
    //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
    //단, 입력한 수는 1보다 크거나 같아야 합니다.
	public void home1Exercise2() {
		System.out.print("숫자를 하나 입력하세요. : ");
		int num = sc.nextInt();
		int numArr[] = new int[num];
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		} else {
			for(int i = 0; i < num; i++) {
				numArr[i] = i + 1;
			}			
		}
		
		for(int i = num; i > 0; i--) {
			System.out.print(numArr[i - 1] + " ");
		}
	}	
	
	
    //3번
    //1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
	public void home1Exercise3() {
		System.out.print("숫자를 하나 입력하세요. : ");
		int num = sc.nextInt();
//		int numArr[] = new int[num];
		int sum = 0;
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		} else {
//			for(int i = 0; i < num; i++) {
//				numArr[i] = i + 1;
//				sum += numArr[i];
//			}
			for(int i = 0; i <= num; i++) {
				sum += i;
			}		
		}
		
		System.out.println("정수의 합 : " + sum);
	}	
	
	
    //4번  
    //사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	public void home1Exercise4() {
		System.out.print("숫자를 두 개 입력하세요. : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		} else {
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i = num1; i >= num2; i--) {
					System.out.print(i + " ");
				}
			}
		}
	}	
	
	
    //5번
    // 사용자로부터 입력 받은 숫자의 단을 출력하세요.
	public void home1Exercise5() {
		System.out.print("출력할 단을 입력하세요. : ");
		int num = sc.nextInt();
		
		System.out.println(num + "단");
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}	
	
	
    //6번  
    //사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
    //단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
	public void home1Exercise6() {
		System.out.print("출력을 시작할 단을 입력하세요. : ");
		int num = sc.nextInt();
		
//		for(int dan = num; dan < 10; dan++) {
//			System.out.println(dan + "단");
//			for(int i = 1; i < 10; i++) {
//				System.out.println(dan + " * " + i + " = " + (dan * i));
//			}			
//			System.out.println();
//		}
		
		
		if(num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			return;
		}
		
		for(int i = 1; i < 10; i++) {
			for(int dan = num; dan < 10; dan++) {
				System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
			}
			System.out.println();
		}		
	}	
	
}
