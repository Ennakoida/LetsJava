package com.kh.day08.opp.homework.q5;

//	Q5. 아침 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 
//	이 씨는 콩다방에서 4,500원을 내고 라테를 사 마셨습니다.
//	'06-2 객체간 협력'을 참고하여 이 과정을 객체 지향으로 프로그래밍 해보세요.

public class Person {
	String name; // 이름
	int money; // 돈
	
	public Person() {}
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 커피도 먹네
	public void buyCoffee(Cafe cafe, int money) {
		// 돈을 가지고 커피가 나와야 함.
		
		this.money -= money;
		cafe.makeCoffee(money);
	}
	
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.");
	}
}
