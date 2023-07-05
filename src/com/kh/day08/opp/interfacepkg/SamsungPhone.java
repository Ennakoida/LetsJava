package com.kh.day08.opp.interfacepkg;

// interface에 extends를 사용할 경우 : 
//The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
	// => extends -> implements

// The type SamsungPhone must implement the inherited abstract method PhoneInterface.recieveCall()
// -> 오버라이딩 해야함

public class SamsungPhone implements PhoneInterface { // interface 상속 : implements

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("여보세요 나야");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("뚜루루루루루루");
	}

	@Override
	public void printLogo() {
		// TODO Auto-generated method stub
		System.out.println("===== samsung ====");
	} 

}
