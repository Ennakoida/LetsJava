package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberRun {
	static int index = 0;
	public static void main(String[] args) {
		MemberFunction mFunc = new MemberFunction();
		
		finish:
			while(true) {
				int choice = mFunc.printMenu();
				
				switch(choice) {
					case 1:
						mFunc.insertInfo();
						break;
					case 2:
						mFunc.printInfo();
						break;
					case 3:
						mFunc.endProgram();
						break finish;
					default : 
						System.out.println("해당 메뉴는 존재하지 않습니다.");
						break;
				}
			}
			
	}
	
	
	

	


}
