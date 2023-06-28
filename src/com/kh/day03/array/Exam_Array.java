package com.kh.day03.array;

public class Exam_Array {
	public static void main(String [] args) {
		int num = 0;
		int nums [] = new int[10]; // 배열할당 // => int [] nums;
		// nums는 배열의 주소, []는 연산이다.
		// []에는 숫자가 들어가 1칸씩 이동하여 값을 가져온다.
		nums[0] = 2;
		System.out.println(nums[0]);
		
		System.out.println("배열의 크기 : " + nums.length);
		// 배열의 할당 후 값 초기화를 하지 않으면 자료형의 기본값이 들어감
		// int의 기본값 : 0, String의 기본값 : null
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
	}
}
