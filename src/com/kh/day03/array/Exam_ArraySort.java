package com.kh.day03.array;

public class Exam_ArraySort {

	public static void main(String[] args) {
		// { 1, 3, 6, 10, 4, 7, 5, 2, 9, 8 }
		// 정렬 알고리즘의 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. ....
		int num1 = 5;
		int num2 = 15;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
	
		// 두 개의 자리를 바꿀 때에는 임시변수가 꼭 필요하다
		int temp; // 임시변수
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		
		int nums[] = { 2, 1, 3 };
		// -> 3, 2, 1
		
		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
				
		
//		for(int i = 0; i < nums.length - 1 ; i++) {
//			if(nums[i] < nums[i+1]) {
//				temp = nums[i];
//				nums[i] = nums[i+1];
//				nums[i+1] = temp;
//			} 
//		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
