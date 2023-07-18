package com.kh.day17.oop.motel.view;

import java.util.Scanner;

public class MotelView {
	Scanner sc = new Scanner(System.in);

	public int printMenu() {
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.println("1.입실 2.퇴실 3.방보기 4.종료");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public int inputRoomNumber(String category) {
		System.out.print("몇 번 방에 " + category + "하시겠습니까? ");
		int roomNo = sc.nextInt();
		return roomNo;
	}
}
