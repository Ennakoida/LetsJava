package com.kh.day05.oop;

public class Member {
//	2. 회원 Member
//	특성 : 
//	이름 String name, 
//	나이 int age, 
//	직업 String job, 
//	부모직업 String parentJob, 
//	연봉 int annualSalary, 
//	IQ int iq, 
//	형제관계 String siblings, 
//	키 double height, 
//	몸무게 double weight, 
//	재산 long wealth, 
//	돌싱여부 boolean marriedYN, 
//	자녀유무 boolean kidsYN, 
//	자녀관계 String kidName
//	행동 : 
//	찜하기 doHeart, 
//	하트 날리기 sendHeart, 
//	대화하기 goChat, ...
	
	
	// ================================> 필드
	public String name;
	public int age;
	public String job; 
	public String parentJob; 
	public int annualSalary; 
	public int iq; 
	public String siblings; 
	public double height;
	public double weight; 
	public long wealth;
	public boolean marriedYN; 
	public boolean kidsYN;
	public String kidsName;
	
	// ================================> 생성자
	public Member() {
		
	}
	
	// ================================> 메소드
	public void doHeart() {}
	public void sendHeart() {}
	public void goChat() {}
}
