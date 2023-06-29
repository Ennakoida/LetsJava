package com.kh.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random_Game {
	public static void main(String[] args) {
		// 가위바위보 게임
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			System.out.println("===== 가위 바위 보 게임 =====");
			System.out.print("숫자를 선택하세요(1. 가위 / 2. 바위 / 3. 보) : ");
			int choice = sc.nextInt();
			int com = rand.nextInt(3) + 1;
			
			
			System.out.println("========== 결과 ==========");
			
			switch (choice) {
			case 1:
				System.out.println("당신은 가위를 냈습니다.");
				break;
			case 2 :
				System.out.println("당신은 바위를 냈습니다.");
				break;
			case 3 : 
				System.out.println("당신은 보를 냈습니다.");
				break;
			default :
				System.out.println("숫자를 잘못 선택하셨습니다.");				
			}
			
			switch (com) {
			case 1:
				System.out.println("컴퓨터는 가위를 냈습니다.");
				break;
			case 2 :
				System.out.println("컴퓨터는 바위를 냈습니다.");
				break;
			case 3 : 
				System.out.println("컴퓨터는 보를 냈습니다.");
				break;		
			}
			
			System.out.println("==========================");
			
			if((choice == 2 && com == 1) || (choice == 3 && com == 2) || (choice == 1 && com == 3)){
				System.out.println("당신이 이겼습니다 ^^*");		
				break;
			} else if((choice == 1 && com == 2) || (choice == 2 && com == 3) || (choice == 3 && com == 1)) {
				System.out.println("당신이 졌습니다. ㅠ.ㅠ");
				break;
			} else {
				System.out.println("비겼습니다 ㅇ.ㅇ");
				System.out.println("다시 선택하세요.");
				System.out.println();
			}
		}
		
	}
}
