package com.kh.day08.opp.abstractpkg.exercise;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		// a와 b를 합하여 리턴
		return a + b;
	}

	@Override
	public int subStract(int a, int b) {
		// a와 b를 빼서 리턴
		return a - b;
	}

	@Override
	public double average(int[] a) {
	// 배열을 입력받아 평균을 구한 뒤 그 값을 리턴
		int sum = 0, length = a.length;
		for(int i = 0; i < length; i++) {
			sum += a[i];
		}
		return (double)sum / length;
	}

}
