package com.kh.day10.collection.music;

public class MusicRun {
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		
		end:
		while(true) {
			int value = mFunc.printMenu();
			
			switch(value) {
				case 1  : mFunc.addLast(); 		     break;
				case 2  : mFunc.addFirst(); 	     break;
				case 3  : mFunc.showAll(); 		     break;
				case 4  : mFunc.select(); 		     break;
				case 5  : mFunc.delete(); 		     break;
				case 6  : mFunc.update(); 		     break;
				case 7  : mFunc.orderTitleAsc();     break;
				case 8  : mFunc.orderTitleDesc();    break;
				case 9  : mFunc.orderMusicianAsc();  break;
				case 10 : mFunc.orderMusicianDesc(); break;
				case 0  : mFunc.endProgram(); 	     break end;
				default : System.out.println("잘못선택하셨습니다.");
			}
		}
	}
}
