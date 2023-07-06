package com.kh.todo;

public class ToDoRun {
	
	public static void main(String[] args) {
		ToDoFunction tdFunc = new ToDoFunction();
	
		finish:
			while(true) {
				int choice = tdFunc.printMenu();
				
				switch(choice) {
					case 1:
						tdFunc.insertToDo();
						break;
					case 2:
						tdFunc.deleteToDo();
						break;
					case 3:
						tdFunc.showLeftToDo();
						break;
					case 4:
						tdFunc.showDoneToDo();
						break;
					case 5:
						tdFunc.endProgram();
						break finish;
					default:
						System.out.println("잘못 입력하셨습니다. (1 ~ 5 중 선택)");
						System.out.println();
				}
			}
	}

}
