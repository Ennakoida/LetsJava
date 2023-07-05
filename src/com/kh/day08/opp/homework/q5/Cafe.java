package com.kh.day08.opp.homework.q5;

public abstract class Cafe {
	String name;
	
	public Cafe() {}
	
	public Cafe(String name) {
		this.name = name;
	}
	
	
	// 커피를 만들어줌
	abstract public void makeCoffee(int money);
//	{
//		if(money == 4000) {
//			System.out.println("주문하신 아이스 아메리카노 한 잔 나왔습니다.");
//		} else if(money == 4500) {
//			System.out.println("주문하신 아이스 라떼 한 잔 나왔습니다.");
//		}
//	}
} 
