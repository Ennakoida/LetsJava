package com.kh.day08.opp.interfacepkg;

public interface PhoneInterface {
//	private String name; // Illegal modifier for the interface field PhoneInterface.name; only public, static & final are permitted
	// ->  private 사용 불가
	
//	public String NAME; // The blank final field NAME may not have been initialized -> 초기화
	public String NAME = "";
	
	public static final int TIME_OUT = 10000;
	
//	public abstract void receiveCall() {} //Abstract methods do not specify a body -> {} 삭제
	public abstract void receiveCall();
	void sendCall();
	abstract void printLogo();
	
	public default void showLogo() {
		// 디폴트 메소드
		// 하위 호환성을 위해서 작성
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
	
}
