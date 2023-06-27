package com.kh.day01.basic;

public class Exam_DataType {
	public static void main(String [] args){
		// 기본형
		// boolean 1byte, char 2byte, byte 1byte, short 2byte, int 4byte, long 8byte 
		// float 4byte, double 8byte
		
		// 참조형
		// String
		
		boolean result = true;
		char fChar = 'a';
		String sStr = "Hello Java";
		
		// 정수
		byte bNum = 127; // 128은 못넣음. byte 최대값 : 128
		short sNum = 32767;
		int iNum = 214748367;
		long lNum = 214748368l; // 접미사 l을 붙여야함
		
		// 실수 
		float fNum = 23.0626f; // 접미사 f를 붙여야함
		double dNum = 23.1026;
	}
}
