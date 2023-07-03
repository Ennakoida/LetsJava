package com.kh.todo;

import java.util.Scanner;

public class ToDoRun {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDo toDoArr[] = new ToDo[20]; // 할일 목록 배열
		for(int i = 0; i < toDoArr.length; i++) {
			toDoArr[i] = new ToDo(); 
		}
		
		finish:
			while(true) {
				int choice = printMenu();
				
				switch(choice) {
					case 1:
						insertToDo();
						break;
					case 2:
						deleteToDo();
						break;
					case 3:
						showLeftToDo();
						break;
					case 4:
						showDoneToDo();
						break;
					case 5:
						endProgram();
						break finish;
				}
			}
	}
	
	private static int printMenu() {
		// TODO Auto-generated method stub
		System.out.println("===== 할 일 기록하기 =====");
		System.out.println();
		System.out.println("1. 할 일 추가하기");
		System.out.println("2. 완료한 한 일 삭제하기");
		System.out.println("3. 남은 할 일 목록 환인하기");
		System.out.println("4. 완료한 목록 확인하기");
		System.out.println("5. 종료하기");
		System.out.println();
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	private static void insertToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 할 일을 추가해 주세요 =====");
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		// 반복문 + 받아오기
		System.out.println("▶ ");
		System.out.println("▶ ");
		System.out.println("▶ ");
		
	}

	private static void deleteToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 완료한 할 일을 적어주세요 =====");
		System.out.println();
		System.out.println("할 일 목록 : ");
		// 여기 반복문 처리하기
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("5. ");
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		System.out.println();
		System.out.print("▶ ");
		int doneList = sc.nextInt(); // 이것도 반복문 처리
		System.out.print("▶ ");
		int doneList2 = sc.nextInt(); // 이것도 반복문 처리
		
		// * > 초기화면 처리
	}

	private static void showLeftToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 남은 할 일 목록 =====");
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		// 반복문 + 받아오기
		System.out.println("▶ ");
		System.out.println("▶ ");
		System.out.println("▶ ");
	}

	private static void showDoneToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 완료한 할 일 목록 =====");
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		// 반복문 + 받아오기
		System.out.println("▶ ");
		System.out.println("▶ ");
		System.out.println("▶ ");
	}

	private static void endProgram() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 종료하기 =====");
		while(true) {
			System.out.println();
			System.out.println("종료 시 목록이 초기화됩니다. 종료하시겠습니까? (Y/N)\n");
			System.out.print("확인 : ");
			char endChoice = sc.next().charAt(0);
			
			if(endChoice == 'Y') {
				System.out.println();
				System.out.println("작동을 종료합니다.");
				System.out.println();
				return;
			} else if(endChoice == 'N') {
				System.out.println();
				System.out.println("메뉴 선택 화면으로 돌아갑니다.");
				System.out.println();
				printMenu();
				return;
			} else {
				System.out.println();
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}			
		}
	}

}
