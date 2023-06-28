package com.kh.day02.basic;

public class Exam_PrintSample {
	public static void main(String [] args) {
		System.out.println("개행이 포함된 출력 메소드");
		System.out.print("개행이 없는 출력 메소드");
		System.out.println("<- 바로 옆으로 붙어버림");
		
		// %b : boolean
		System.out.printf("정수 출력 : %d\n", 10); // %d : 정수 // \n : 개행, \t : 탭
		System.out.printf("실수 출력 : %f\n", 10.02); // %f : 실수
		System.out.printf("실수 출력 : %.2f\n", 10.02); // %.nf : 소수점 아래 n자리수까지 출력
		System.out.printf("문자열 출력 : %s\n", "문 자 열"); // %s : 문자열 출력
		System.out.printf("문자 출력 : %c\n", 'A'); // %c : 문자 출력
		System.out.printf("%c반 %s과정 %.2f개강 %.2f종강입니다.", 'F', "공공데이터 개발자", 5.15, 10.26);
		
	}
}
