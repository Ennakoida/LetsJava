package com.kh.day10.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
	
//	Student [] students;
//	int index;
	
	List<Student> stdList;
	
	public StudentFunction() {
//		students = new Student[100];
//		index = 0;
		stdList = new ArrayList<Student>();
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 학생 성적 확인 프로그램 =====");
		System.out.println();
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 재평가 여부 확인");
		System.out.println("5. 프로그램 종료");
		System.out.println();
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("===== 학생 성적 입력 =====");
		
		System.out.println();

		System.out.print("학생 정보 입력");
		// 캡슐화. (private > getter / setter)
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 입력 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 입력 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
//		students[index] = std;
//		index++;
		stdList.add(std);
	}
	
	public void seachInfoByName() {
		// TODO Auto-generated method stub
		System.out.println("학생 정보 이름 검색");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for(Student std : stdList) { // for each
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
	}
	
	public void printInfo() {
//		for(int i = 0; i < stdList.size(); i++) {
////			System.out.println(stdList.get(i).getName() + "/");
//			System.out.println(stdList.get(i).toString());
//		}
		System.out.println("학생 정보 전체 출력");
		for(Student student : stdList) { // stdList 값 -> student 으로 하나씩 돈다.(for each)
			System.out.println(student.toString());
		}
	}
	
	public void checkPass() {
		for(Student student : stdList) {
			int score1 = student.getScore1();
			int score2 = student.getScore2();
		}
	}
}
