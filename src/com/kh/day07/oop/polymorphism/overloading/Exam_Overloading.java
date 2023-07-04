package com.kh.day07.oop.polymorphism.overloading;


// 오버로딩
class Weapon {
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
}


public class Exam_Overloading {
	public static void main(String[] args) {
		// 오버로딩
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('A');
		System.out.println("Hello Java");
		System.out.println(true);
	}
}
