package com.kh.day05.oop;

class StaticSample {
	public int num;
	
	public static int input;
	
	public void sampleMethod() {
		
	}
	
	public void goodMethod() {
		
	}
	
	public static void originMethod() {
		input = 1225;
	}
}


public class Exam_Static {
	public static void main(String [] args) {
		StaticSample.input = 10; // static 있으면 new 없이도 바로 사용할 수 있음
		StaticSample.originMethod(); // 함수도 static 있으면 바로 사용 가능
		System.out.println(StaticSample.input);
		
		StaticSample sample = new StaticSample();
		sample.num = 26;
	}
}