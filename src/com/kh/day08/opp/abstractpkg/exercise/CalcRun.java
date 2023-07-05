package com.kh.day08.opp.abstractpkg.exercise;

public class CalcRun {
	public static void main(String[] args) {
	//	Calculator calc = new Calculator();
		// 추상 클래스는 객체 생성 안됨... // Cannot instantiate the type Calculator
		
		Calculator calc = new GoodCalc(); // 업캐스팅 (다형성)
		
		int [] a = {1, 2, 3, 4, 5};
		System.out.printf("합 : %d\n", calc.add(1, 2));
		System.out.printf("차 : %d\n", calc.subStract(20, 10));
		System.out.printf("평균 : %.2f", calc.average(a));
	}	
}
