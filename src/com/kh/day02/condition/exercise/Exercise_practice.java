package com.kh.day02.condition.exercise;

public class Exercise_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// && : 앞 연산이 false 면 뒤 계산 X
		// || : 앞 연산이 true 면 뒤 계산 X
		
		// (구글클래스룸) 연습문제 1번 -2
		int aNum = 70;
		int bNum = 55;
		boolean result1, result2, result3, result4;
		
		result1 = (aNum == bNum) || (aNum++ < 100);
		//			false			true
		// aNum : 71, bNum : 55, result1 : true
		result2 = (aNum < bNum) && (--bNum < 55); //&&연산자일때 앞이 false면 뒤에 계산 안함
		//			false		
		// aNum = 71, bNum : 55, result : false
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		//			true			true
		// aNum : 72, bNum : 54, result3 : true
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		//			true
		// aNum : 73, bNum : 54, result4 : true
		System.out.println(aNum + "\n" + bNum);
	}

}
