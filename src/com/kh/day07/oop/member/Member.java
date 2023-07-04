package com.kh.day07.oop.member;

public class Member {
	// 입력받을 거 3개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	
	private String memberId, memberPw, memberEmail, memberAddress;
	
	public Member() {
		
	}
	
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}

	public String getMemberId() {
		return this.memberId;
	}

	// 매개변수의 값을 받아 저장
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return this.memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberEmail() {
		return this.memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberAddress() {
		return this.memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
	
}
