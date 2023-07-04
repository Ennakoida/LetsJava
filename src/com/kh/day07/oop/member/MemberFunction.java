package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	private Member memArrs[];
	private int index;
	
	public MemberFunction() {
		memArrs = new Member[3];
		index = 0;
	}
	
	public int printMenu() {
		// 회원가입 프로그램
		// 1. 회원정보입력
		// 2. 회원정보출력
		// 3. 프로그램 종료
		// 메뉴 입력 :
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원관리 프로그램 =====");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력 :");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void insertInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원정보입력 =====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("주소 : ");
		sc.nextLine(); // 개행 제거 < 를 먼저 한 번 써줘야 제대로 입력받을 수 있다. 
		String address = sc.nextLine(); // nextLine : 공백, 엔터 포함
//		memArrs[0] = new Member();
//		memArrs[0].setMemberId(memberId);
//		memArrs[0].setMemberPw(memberPw);
//		memArrs[0].setMemberEmail(email);
//		memArrs[0].setMemberAddress(address);
		
		memArrs[index] = new Member(memberId, memberPw, email, address);
		index++;
	}
	
	public void printInfo() {
		System.out.println("===== 회원정보출력 =====");
		for(int i = 0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고,이메일은 %s이며, 주소는 %s입니다.\n"
					, memArrs[i].getMemberId(), memArrs[i].getMemberPw(), memArrs[i].getMemberEmail(), memArrs[i].getMemberAddress());
		}
	}
	
	public void endProgram() {
		System.out.println();
		System.out.println("===== 프로그램 종료 =====");
		System.out.println();
		System.out.println("프로그램이 종료되었습니다.");
	}
}
