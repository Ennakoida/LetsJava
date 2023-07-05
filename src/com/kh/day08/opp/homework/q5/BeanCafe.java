package com.kh.day08.opp.homework.q5;

public class BeanCafe extends Cafe {
	@Override
	public void makeCoffee(int money) {
		if(money == Menu.BEAN_AMERICANO)
			System.out.println("아메리카노 준비해드리겠습니다.");
		else if(money == Menu.BEAN_LATTE)
			System.out.println("라떼 준비해드리겠습니다.");
		else 
			System.out.println("금액이 더 필요합니다.");
	}
}
