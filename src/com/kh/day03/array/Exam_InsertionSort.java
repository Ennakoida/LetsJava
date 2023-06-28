package com.kh.day03.array;

public class Exam_InsertionSort {
	public static void main(String [] args) {
		// 삽입정렬이란?
		// 정렬 알고리즘 중 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 n번 인덱스값을 0번에서 n-1번까지 비교
		
		// {2, 5, 4, 1, 3}
		
		// 1: 2 하고 5 비교 -> 교환X
		// 1: {2, 5, 4, 1, 3}
		
		// 2 : 5 하고 4 비교 -> 교환
		// 2 : {2, 4, 5, 1, 3}
		
		// 3-1 : 5 하고 1 비교 -> 교환
		// 3-1 : {2, 4, 1, 5, 3}
		// 3-2: 4 하고 1 비교 -> 교환
		// 3-2 : {2, 1, 4, 5, 3}
		// 3-3: 2 하고 1 비교 -> 교환
		// 3-3 : {1, 2, 4, 5, 3}
		
		// 4-1 : 5 하고 3 비교 -> 교환
		// 4-1 : {1, 2, 4, 3, 5}
		// 4-2 : 4 하고 3 비교 -> 교환
		// 4-2 : {1, 2, 3, 4, 5}
		
		
		int [] arrs = {2, 5, 4, 1, 3};
		//{2, 5, 4, 1, 3}
		// j = 1
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0 ; j--) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;
				}
			}			
		}
		
		for(int i = 0; i < 5; i++)
			System.out.print(arrs[i] + " ");
		
		
		
//		//{2, 5, 4, 1, 3}
//		// j = 1
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}		
//		// j = 2
////				//{2, 4, 5, 1, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		// j = 3
//		//		//{2, 4, 5, 1, 3}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		//		//{2, 4, 1, 5, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		//		//{2, 1, 4, 5, 3}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		//		//{1, 2, 4, 5, 3}
//		// j = 4
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[3];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;
//		}
//		//{1, 2, 4, 3, 5}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		//{1, 2, 3, 4, 5}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		//{1, 2, 3, 4, 5}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		//{1, 2, 3, 4, 5}
		
		

	}
}
