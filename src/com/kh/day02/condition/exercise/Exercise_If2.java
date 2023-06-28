package com.kh.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String [] args) {
		//switch 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라. 
		//에스프레소, 카푸치노, 카페라떼는 3500원이고, 아메리카노는 2000원이다.
		
		System.out.println("에스프레소, 카푸치노, 카페라떼, 아메리카노 중 하나를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String coffee = sc.next();
		int price = 0;
		
		switch(coffee) {
			case "에스프레소" :
			case "카푸치노" :
			case "카페라떼" :
				price = 3500;
				break;
			case "아메리카노" :
				price = 2000;
				break;
			default :
				System.out.println("없는 메뉴입니다.");
		}
		
		System.out.println("가격 : " + price);
			
	}
}
