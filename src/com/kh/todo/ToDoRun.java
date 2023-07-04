package com.kh.todo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoRun {
	static Scanner sc = new Scanner(System.in);
	static ToDo toDoArr[] = new ToDo[100]; // 할일 목록 배열
	static ToDo doneToDoArr[] = new ToDo[100]; // 완료 목록 배열
	static int listIndex = 0; // 할일누적용 인덱스
	static int doneIndex = 0; // 완료 배열 인덱스
	
	public static void main(String[] args) {
	
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
					default:
						System.out.println("잘못 입력하셨습니다. (1 ~ 5 중 선택)");
						System.out.println();
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
		int choicenum = 0;
		try {
			choicenum = sc.nextInt();
		} catch (InputMismatchException e) { // 숫자 외 입력 시 예외처리
			// >>>>>>>>> 이거 무한루프 뜨는데 왜인지 모르겠네............ <<<<<<<<<<<<
			
		}
		
		return choicenum;
	}

	private static void insertToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 할 일을 추가해 주세요 =====");
		System.out.println();
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		sc.nextLine();
		for(int i = listIndex; i < toDoArr.length; i++) {
			System.out.print("▶ ");
			String list = sc.nextLine();
			
			if(list.equals("*")) {
				System.out.println("초기화면으로 돌아갑니다.");
				System.out.println();
				break;
			}
			toDoArr[i] = new ToDo((listIndex + 1), list);
			
			listIndex++;
		}
	}

	private static void deleteToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 완료한 할 일을 적어주세요 =====");
		System.out.println();
		
		// 저장된 할 일 목록 출력
		System.out.println("할 일 목록 : ");
		for(int i = 0; i < listIndex; i++) { 
			if(toDoArr[i].getIndex() == 0) { // 삭제되어 값이 없으면 출력하지 않고 넘어감
				continue;
			}
			System.out.println(toDoArr[i].getIndex() + ". " + toDoArr[i].getList());
		}
		
		System.out.println();
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		System.out.println();
		
		// 완료한 할 일 선택
		for(int i = 0; i < listIndex; i++) {
			System.out.print("▶ ");
			String doneList = sc.next();
			
			// 초기화면
			if(doneList.equals("*")) { 
				System.out.println();
				System.out.println("초기화면으로 돌아갑니다.");
				System.out.println();
				break;
			}
			
			// 선택한 할 일 삭제(초기화)
			for(int j = 0; j < listIndex; j++) { 
				if(toDoArr[j].getIndex() == Integer.parseInt(doneList)) {
					doneToDoArr[doneIndex] = new ToDo(toDoArr[j].getIndex(), toDoArr[j].getList());
					doneIndex++;
					toDoArr[j].setIndex(0);
					toDoArr[j].setList(null);
				}			
			}
		}
	}

	private static void showLeftToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 남은 할 일 목록 =====");
		System.out.println();
		System.out.println("할 일 목록 : ");
		for(int i = 0; i < listIndex; i++) { 
			if(toDoArr[i].getIndex() == 0) { // 삭제되어 값이 없으면 출력하지 않고 넘어감
				continue;
			}
			System.out.println(toDoArr[i].getIndex() + ". " + toDoArr[i].getList());
		}
		System.out.println();
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		System.out.println();
	}

	private static void showDoneToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("===== 완료한 할 일 목록 =====");
		System.out.println();
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		System.out.println();

		for(int i = 0; i < doneIndex; i++) {
			System.out.println("▶ " + doneToDoArr[i].getIndex() + ". " + doneToDoArr[i].getList());			
		}
		System.out.println();
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
				break; // 이거 이상함 수정하기
			} else {
				System.out.println();
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}			
		}
	}

}
