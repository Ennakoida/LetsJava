package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MusicFunction {
//	Map<String, String> msMap = new HashMap<String, String>();
	
	List<Music> mList;
	
	public MusicFunction() {
		mList = new ArrayList<Music>();
	}
	
	Scanner sc = new Scanner(System.in);
	
	public int printMenu() {
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int value = sc.nextInt();
		
		return value;
	}
	
	
	public void addLast() {
		System.out.println("=== === 마지막 위치에 곡 추가 === ===");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String musician = sc.next();
//		msMap.put(title, musician);
		Music music = new Music(title, musician);
		mList.add(music);
		System.out.println("[서비스 성공] : 추가 성공! "); // 추가실패
	}

	public void addFirst() {
		System.out.println("=== === 첫 위치에 곡 추가 === ===");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String musician = sc.next();
//		msMap.put(title, musician);
		Music music = new Music(title, musician);
		mList.add(0, music); // 첫번째에 넣겠다 -> add(0, - );
		System.out.println("[서비스 성공] : 추가 성공! "); // 추가실패
	}

	public void showAll() {
		System.out.println("=== === 전체 곡 목록 출력 === ===");
//		int i = 0;
//		for(String key : msMap.keySet()) {
//			i++;
//			System.out.print(i + "번째 노래 -> ");
//			System.out.print("곡명 : " + key);
//			System.out.print(", 가수명 : " + msMap.get(key));
//			System.out.println();
//		}
		
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 노래 -> 곡명 : %s, 가수명 : %s\n", (i + 1), music.getTitle(), music.getMusician());
		}
			
		System.out.println("[서비스 성공] : 조회 성공!"); // 조회실패
	}

	public void select() {
		System.out.println("=== === 특정 곡 검색 === ===");
		System.out.print("검색할 곡 입력 : ");
		String title = sc.next();
		
////		System.out.println("=== === 전체 곡 목록 출력 === ===");
////		int i = 0;
////		for(String key : msMap.keySet()) {
////			if(title.equals(key)) {
////				i++;
////				System.out.print(i + "번째 노래 -> ");
////				System.out.print("곡명 : " + key);
////				System.out.print(", 가수명 : " + msMap.get(key));
////				System.out.println();
////			}
////		}
//		
//		System.out.println("=== === 검색 결과 === ===");
//		for(String key : msMap.keySet()) {
//			if(title.equals(key)) {
//				System.out.print("곡명 : " + key);
//				System.out.print(", 가수명 : " + msMap.get(key));
//				System.out.println();
//			}
//		}
		
		for(Music music : mList) {
			if(music.getTitle().equals(title)) {
				System.out.printf("검색 결과 >> 곡명 : %s, 가수명 : %s\n", music.getTitle(), music.getMusician());
				break;
			}
		}
		
		System.out.println("[서비스 성공] : 조회 성공!"); // 조회 실패
	}

	public void delete() {
		System.out.println("=== === 특정 곡 삭제 === ===");
		System.out.print("삭제할 곡 입력 : ");
		String title = sc.next();
		
//		for(String key : msMap.keySet()) {
//			if(title.equals(key)) {
//				msMap.remove(key, msMap.get(key));
//			}
//		}
		
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				// mList에서 삭제
				mList.remove(i);
				break;
			}
		}
		
		System.out.println("[서비스 성공] : 삭제 성공!"); // 삭제 실패
		
	}

	public void update() {
		System.out.println("=== === 특정 곡 정보수정 === ===");
		System.out.print("수정할 곡 입력 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("수정할 정보 입력(곡명) : ");
		String modTitle = sc.nextLine();
		System.out.print("수정할 정보 입력(가수명) : ");
		String modMusician = sc.nextLine();
		
		Music modMusic = new Music(modTitle, modMusician);
		
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				mList.set(i, modMusic);
			}
		}
	}

	public void orderTitleAsc() {
		System.out.println("=== === 곡명 오름차순 정렬 === ===");
		
	}

	public void orderTitleDesc() {
		System.out.println("=== === 곡명 내림차순 정렬 === ===");
		
	}

	public void orderMusicianAsc() {
		System.out.println("=== === 가수명 오름차순 정렬 === ===");
		
	}

	public void orderMusicianDesc() {
		System.out.println("=== === 가수명 내림차순 정렬 === ===");
		
	}

	public void endProgram() {
		System.out.println("=== === 종료 === ===");
		System.out.println("시스템을 종료합니다.");
	}
	
}
