package com.kh.day18.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.controller.MemberController;
import com.kh.day18.member.model.vo.Member;

public class MemberView {
	Scanner sc = new Scanner(System.in);
	private MemberController controller;
	
	public MemberView() {
		controller = new MemberController();
	}
	
	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		int index = -1;
		
		finish :
		while(true) {
			// 회원관리프로그램
			// 1. 회원 정보 등록
			// 2. 회원 정보 수정
			// 3. 회원 정보 삭제
			// 4. 회원 정보 조회 (이름)
			// 5. 회원 전체 정보 조회
			
			int choice = this.printMenu();
			
			switch(choice) {
				case 1 :
					mOne = this.inputMember();
					controller.addMember(mOne);
					break;
				case 2 :
					name = this.inputMemberName(); // 수정할 데이터의 이름을 받음
					index = controller.findIndexByNames(name); // 인덱스 값을 찾음
					mOne = controller.findOneByName(name);		// 수정하지 않는 부분은 기족 데이터 유지되도록 데이터 불러옴
					// 원래 저장된 데이터 mOne
					if(index != -1)
						mOne = this.modifyMember(mOne); // 데이터가 있을 때 수정할 정보 입력 받음
					controller.modifyMember(index, mOne);
					break;
				case 3 :
					name = this.inputMemberName(); // 삭제할 데이터의 이름을 받음 
					index = controller.findIndexByNames(name);
					if(index != -1)
						controller.subMember(index); // 삭제하기
					break;
				case 4 :
					name = this.inputMemberName();
					mOne= controller.findOneByName(name);
					this.printOneMember(mOne);
					break;
				case 5 :
					this.printAllMembers(controller.allMemberList());
					break;
				case 6 :
					break finish;
			}
		}
	}
	
	public int printMenu() {
		System.out.println("===== 회원 관리 프로그램 =====");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 조회 (이름)");
		System.out.println("5. 회원 전체 정보 조회");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 >> ");
		int input = sc.nextInt();
		return input;
	}
	
	public Member inputMember() {
		System.out.println("===== 회원 정보 입력 =====");
		System.out.print("아이디   : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름     : ");
		String memberName = sc.next();
		System.out.print("이메일   : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		
		// member.setMemberId(memberId); ... 
		Member member = new Member(memberId, memberPw, memberName, memberEmail, memberPhone);
		
		return member;
	}
	
	public String inputMemberName() {
		System.out.print("이름을 입력해주세요 : ");
		String memberName = sc.next();
		
		return memberName;
	}
	
	public Member modifyMember(Member member) {
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			System.out.print("이메일   : ");
			String memberEmail = sc.next();
			System.out.print("전화번호 : ");
			String memberPhone = sc.next();
			
	//		Member member = new Member(memberPw, memberEmail, memberPhone);
			member.setMemberPw(memberPw);
			member.setMemberEmail(memberEmail);
			member.setMemberPhone(memberPhone);
			
			return member;
		}

	public void printOneMember(Member member) {
		System.out.println("===== 회원 정보 조회 (이름) =====");
		System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 전화번호 : %s\n"
				 		 , member.getMemberId(), member.getMemberName(), member.getMemberEmail(), member.getMemberPhone());
	}
	
	public void printAllMembers(List<Member> mList) {
		System.out.println("===== 회원 전체 정보 조회 =====");
		for(Member member : mList) {
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 전화번호 : %s\n"
							 , member.getMemberId(), member.getMemberName(), member.getMemberEmail(), member.getMemberPhone());
			
		}
	}
}
