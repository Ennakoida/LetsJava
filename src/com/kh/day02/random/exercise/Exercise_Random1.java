package com.kh.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String [] args) {
		// 동전 앞뒤 맞추기!!
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		틀렸습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		틀렸습니다.
		
		
		
		while(true) {
			System.out.println("====== 동전 앞 뒤 맞추기 =======");
			System.out.print("숫자를 입력해주세요. (1.앞면 / 2.뒷면) : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			Random rand = new Random();
			int result = rand.nextInt(2)+1;
			// 0 부터 1까지의 랜덤 : nextInt(2)
			// 1 부터 2까지의 랜덤 : nextInt(2) + 1
			
			
			if(num != 1 && num != 2) {
				System.out.println("숫자가 틀렸습니다.");
				continue;
			}
			
			System.out.println("정답 : " + result);
			
			if(num == result)
				System.out.println("맞췄습니다.");
			else
				System.out.println("틀렸습니다.");
			
		}
	}
}


