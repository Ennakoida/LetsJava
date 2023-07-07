package com.kh.todo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoFunction {
	Scanner sc = new Scanner(System.in);
	
	private ToDo toDoArr[]; // 할일 목록 배열
	private ToDo doneToDoArr[]; // 완료 목록 배열
	private int listIndex; // 할일누적용 인덱스
	private int doneIndex; // 완료 배열 인덱스
	
	private SimpleDateFormat trans;
	private Calendar calendar;
	
	public ToDoFunction() {
		toDoArr = new ToDo[100];
		doneToDoArr = new ToDo[100];
		listIndex = 0;
		doneIndex = 0;
		trans = new SimpleDateFormat("yyyy/MM/dd");
		calendar = Calendar.getInstance();
	}
	
	public int printMenu() {
		// TODO Auto-generated method stub
		// http://kor.pe.kr/util/4/charmap.htm
		System.out.println("┌─────── ◈ 할 일 기록하기 ◈ ───────┐");
		System.out.println("│                                  │");
		System.out.println("│    1. 할 일 추가하기             │");
		System.out.println("│    2. 완료한 한 일 삭제하기      │");
		System.out.println("│    3. 남은 할 일 목록 환인하기   │");
		System.out.println("│    4. 완료한 목록 확인하기       │");
		System.out.println("│    5. 종료하기                   │");
		System.out.println("│                                  │");
		System.out.println("└──────────────────────────────────┘");
		System.out.println();
		System.out.print("메뉴 선택 : ");
		int choicenum = 0;
		try {
			choicenum = sc.nextInt();
		} catch (InputMismatchException e) { // 숫자 외 입력 시 예외처리
			sc.next();
		}
		
		return choicenum;
	}

	public void insertToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│     ◈ 할 일을 추가해 주세요 ◈    │");
		System.out.println("└──────────────────────────────────┘");
		System.out.println();
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		sc.nextLine();
		for(int i = listIndex; i < toDoArr.length; i++) {
			System.out.print("▶ 할 일 : ");
			String list = sc.nextLine();
			
			if(list.equals("*")) {
				System.out.println("초기화면으로 돌아갑니다.");
				System.out.println();
				break;
			}
			
			System.out.print("▷▷ 마감일 (yyyy/MM/dd) : ");
			String due = sc.nextLine();
			
			// 마감일 날짜 형식으로 만들어서 저장하기
			long dueDate = 0;
			try {
				Date date = trans.parse(due);
				calendar.setTime(date);
				dueDate = calendar.getTimeInMillis(); 
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			long today = System.currentTimeMillis(); // 오늘 날짜
			int dDay = (int)((dueDate - today) / 1000 / 60 / 60 / 24) + 1; // d-day 계산 (일)
			
			toDoArr[i] = new ToDo((listIndex + 1), list, due, dDay);
			
			listIndex++;
		}
	}

	public void deleteToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│   ◈ 완료한 할 일을 적어주세요 ◈  │");
		System.out.println("└──────────────────────────────────┘");
		System.out.println();
		
		// 저장된 할 일 목록 출력
		System.out.println("할 일 목록 : ");
		for(int i = 0; i < listIndex; i++) { 
			if(toDoArr[i].getIndex() == 0) { // 삭제되어 값이 없으면 출력하지 않고 넘어감
				continue;
			}
//			System.out.println(toDoArr[i].getIndex() + ". " + toDoArr[i].getList());
			System.out.printf("%d. %s%15s\tD-%d\n", toDoArr[i].getIndex(),toDoArr[i].getList(),toDoArr[i].getDue(),toDoArr[i].getdDay());
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
					doneToDoArr[doneIndex] = new ToDo(toDoArr[j].getIndex(), toDoArr[j].getList(), toDoArr[j].getDue(), toDoArr[j].getdDay());
					doneIndex++;
					toDoArr[j] = new ToDo();
				}			
			}
		}
	}

	public void showLeftToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│        ◈ 남은 할 일 목록 ◈       │");
		System.out.println("└──────────────────────────────────┘");
		System.out.println();
		System.out.println("할 일 목록 : ");
		for(int i = 0; i < listIndex; i++) { 
			if(toDoArr[i].getIndex() == 0) { // 삭제되어 값이 없으면 출력하지 않고 넘어감
				continue;
			}
//			System.out.println(toDoArr[i].getIndex() + ". " + toDoArr[i].getList() + "\t\t" + toDoArr[i].getDue() + "\t" + toDoArr[i].getToday());
			System.out.printf("%d. %s%15s\tD-%d\n", toDoArr[i].getIndex(),toDoArr[i].getList(),toDoArr[i].getDue(),toDoArr[i].getdDay());
		}
		System.out.println();
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		System.out.println();
	}

	public void showDoneToDo() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│       ◈ 완료한 할 일 목록 ◈      │");
		System.out.println("└──────────────────────────────────┘");
		System.out.println();
		System.out.println("초기화면으로 돌아가려면 * 를 입력해주세요.");
		System.out.println();

		for(int i = 0; i < doneIndex; i++) {
//			System.out.println("▶ " + doneToDoArr[i].getIndex() + ". " + doneToDoArr[i].getList());	
			System.out.printf("▶ %d. %s%15s\tD-%d\n", doneToDoArr[i].getIndex(),doneToDoArr[i].getList(),doneToDoArr[i].getDue(),doneToDoArr[i].getdDay());
		}
		System.out.println();
	}

	public void endProgram() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│           ◈ 종료하기 ◈           │");
		System.out.println("└──────────────────────────────────┘");
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
