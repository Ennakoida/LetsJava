package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	static int index = 0;
	public static void main(String[] args) {
		Student stdArr[] = new Student[2];
		
		for(int i = 0; i < stdArr.length; i++) {
			stdArr[i] = new Student();
		}
		
		finish:
		while(true) {
			int choice = printMenu();
			
			switch(choice) {
				case 1:
					// 1. 선택 시
					// 1번째 학생 정보 입력
					// 학생 이름 입력 : 일용자
					// 1차 점수 입력 : 60
					// 2차 점수 입력 : 55
					// => 1명씩 입력받도록 하거나
					// 2명 한꺼번에 입력받도록 하세요
					InsertScore(stdArr);
					break;
				case 2:
					// 2. 선택 시
					// 1번째 학생 정보 출력
					// 일용자 학생의 점수는
					// 1차 점수 : 60, 2차 점수 : 55 입니다.
					printScore(stdArr);
					break;
				case 3:
					evaluate(stdArr);
					break;
				case 4:
					endProgram();
					break finish;
			}
		}
		
	}
	
	public static int printMenu() {
		// 학생 성적 확인 프로그램
		// 1. 학생 성적 입력
		// 2. 학생 성적 출력
		// 3. 재평가 여부 확인
		// 4. 프로그램 종료
		// 메뉴 입력 : 4
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생 성적 확인 프로그램 =====");
		System.out.println();
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.println();
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		
		// 오버로딩
//		System.out.println(1);
//		System.out.println('A');
//		System.out.println("Hello Java");
//		System.out.println(true);
		return choice;
	}
	
	public static void InsertScore(Student stdArr[]) {
		// 학생 이름 입력 : 일용자
		// 1차 점수 입력 : 60
		// 2차 점수 입력 : 55
		// => 1명씩 입력받도록 하거나
		// 2명 한꺼번에 입력받도록 하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("===== 학생 성적 입력 =====");
		
		System.out.println();
		if(index > 1) {
			System.out.println("학생 2명의 정보를 이미 입력하셨습니다.");
			System.out.println();
			return;
		}
		System.out.print((index + 1) + "번째 학생 이름 입력 : ");
		// 캡슐화. (private > getter / setter)
		String name = sc.next();
		stdArr[index].setName(name);
		System.out.print("1차 점수 입력 : ");
		int score1 = sc.nextInt();
		stdArr[index].setFirstScore(score1);
		System.out.print("2차 점수 입력 : ");
		int score2 = sc.nextInt();
		stdArr[index].setSecondScore(score2);
		index++;
		
		System.out.println();	

		
//		index = 0;
//		for(int i = 0; i < stdArr.length; i++) {
//			System.out.println();
//			System.out.print((i + 1) + "번째 학생 이름 입력 : ");
//			stdArr[i].name = sc.next();
//			System.out.print("1차 점수 입력 : ");
//			stdArr[i].score1 = sc.nextInt();
//			System.out.print("2차 점수 입력 : ");
//			stdArr[i].score2 = sc.nextInt();
//			index++;
//		}
	}
	
	public static void printScore(Student stdArr[]) {
		// 1번째 학생 정보 출력
		// 일용자 학생의 점수는
		// 1차 점수 : 60, 2차 점수 : 55 입니다.
		System.out.println();
		System.out.println("===== 학생 성적 출력 =====");
		
		for(int i = 0; i < index; i++) {
			System.out.println();
			System.out.println(stdArr[i].getName() + " 학생의 점수는");
			System.out.println("1차 점수 : " + stdArr[i].getFirstScore() + "점, 2차 점수 : " + stdArr[i].getSecondScore() + "점 입니다.");
		}
		
		System.out.println();
	}
	
	public static void evaluate(Student stdArr[]) {
		// 1번째 일용자 학생의 확인결과
		// 통과했습니다.

		// 1번째 일용자 학생의 확인결과
		// 1차 시험 재평가 대상자입니다.
		
		// 1번째 일용자 학생의 확인결과
		// 2차 시험 재평가 대상자입니다.
		
		// 1번째 일용자 학생의 확인결과
		// 1차 시험 재평가 대상자입니다.
		// 2차 시험 재평가 대상자입니다.
		
		// 재평가 기준 설명
		// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		// 1. 점수가 40점 미만인 경우 과락으로 재평가 대상자가 된다.
		// 2. 1차 점수와 2차 점수의 평균은 60점을 넘겨야 통과한다.
		// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의 과목은 재평가를 본다.
		
		// 1차 점수 : 60점, 2차 점수 : 60점
		// 1차 점수 : 100점, 2차 점수 : 20점(2차만 재평가)
		// 1차 점수 : 59점, 2차 점수 : 60점(1차만 재평가);
		// 결론 : 평균 60점이 넘어야함, 넘었는데 재평가보는 경우있음.
		// 평균 60점이 넘지 않으면 재평가(60점 미만만 재평가)		
		System.out.println();
		System.out.println("===== 재평가 여부 확인 =====");
		System.out.println();
		for(int i = 0; i < index; i++) {
			int firstScore = stdArr[i].getFirstScore();
			int secondScore = stdArr[i].getSecondScore();
			System.out.println((i + 1) + "번째 " + stdArr[i].getName() + " 학생의 확인결과");
			
			if(stdArr[i].getAvg() >= 60) {
//				if(firstScore < 40)
//					System.out.println("1차 시험 재평가 대상자입니다.");
//				if(secondScore < 40)
//					System.out.println("2차 시험 재평가 대상자입니다.");
//				if(firstScore >= 40 && secondScore >= 40)
//					System.out.println("통과했습니다.");
				if(firstScore < 40)
					System.out.println("1차 시험 재평가 대상자입니다.");
				else if(secondScore < 40) // 60을 넘기려면 둘 다 40 미만으로는 안됨!! (if if 써도 된다)
					System.out.println("2차 시험 재평가 대상자입니다.");
				else 
					System.out.println("통과했습니다.");
			} else {
				if(firstScore < 60)
					System.out.println("1차 시험 재평가 대상자입니다.");
				if(secondScore < 60)
					System.out.println("2차 시험 재평가 대상자입니다.");
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void endProgram() {
		System.out.println();
		System.out.println("===== 프로그램 종료 =====");
		System.out.println();
		System.out.println("프로그램이 종료되었습니다.");
	}
}




//학생 성적 확인 프로그램
// 1. 학생 성적 입력
// 2. 학생 성적 출력
// 3. 재평가 여부 확인
// 4. 프로그램 종료
// 메뉴 입력 : 4

// 1. 선택 시
// 1번째 학생 정보 입력
// 학생 이름 입력 : 일용자
// 1차 점수 입력 : 60
// 2차 점수 입력 : 55
// => 1명씩 입력받도록 하거나
// 2명 한꺼번에 입력받도록 하세요

// 2. 선택 시
// 1번째 학생 정보 출력
// 일용자 학생의 점수는
// 1차 점수 : 60, 2차 점수 : 55 입니다.

// 3. 선택 시
// 1번째 일용자 학생의 확인결과
// 통과했습니다.

// 1번째 일용자 학생의 확인결과
// 1차 시험 재평가 대상자입니다.

// 1번째 일용자 학생의 확인결과
// 2차 시험 재평가 대상자입니다.

// 1번째 일용자 학생의 확인결과
// 1차 시험 재평가 대상자입니다.
// 2차 시험 재평가 대상자입니다.

// 4. 선택시
// 프로그램이 종료되었습니다.

// 재평가 기준 설명
// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
// 1. 점수가 40점 미만인 경우 과락으로 재평가 대상자가 된다.
// 2. 1차 점수와 2차 점수의 평균은 60점을 넘겨야 통과한다.
// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의 과목은 재평가를 본다.
