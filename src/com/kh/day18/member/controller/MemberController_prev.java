package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;

public class MemberController_prev {
	private List<Member> mList;
	private MemberView view;
	
	public MemberController_prev() {
		view = new MemberView();
		mList = new ArrayList<Member>();
	}
	
	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		int index = -1;
		
		finish :
		while(true) {
			// 회원관리프로그램
			// 1. 회원 정보 등록
			// 2. 회원 정보 수정
			// 3. 회원 정보 삭제
			// 4. 회원 정보 조회 (이름)
			// 5. 회원 전체 정보 조회
			
			int choice = view.printMenu();
			
			switch(choice) {
				case 1 :
					mOne = view.inputMember();
					addMember(mOne);
					break;
				case 2 :
					name = view.inputMemberName(); // 수정할 데이터의 이름을 받음
					index = findIndexByNames(name); // 인덱스 값을 찾음
					mOne = findOneByName(name);		// 수정하지 않는 부분은 기족 데이터 유지되도록 데이터 불러옴
					// 원래 저장된 데이터 mOne
					if(index != -1)
						mOne = view.modifyMember(mOne); // 데이터가 있을 때 수정할 정보 입력 받음
					modifyMember(index, mOne);
					break;
				case 3 :
					name = view.inputMemberName(); // 삭제할 데이터의 이름을 받음 
					index = findIndexByNames(name);
					if(index != -1)
						subMember(index); // 삭제하기
					break;
				case 4 :
					name = view.inputMemberName();
					mOne= findOneByName(name);
					view.printOneMember(mOne);
					break;
				case 5 :
					view.printAllMembers(allMemberList());
					break;
				case 6 :
					break finish;
			}
		}
	}
	
	/**
	 * 회원 정보 수정
	 * @param index 이름으로 찾은 index 값
	 * @param mOne mOne 수정된 정보(데이터)
	 */
	public void modifyMember(int index, Member mOne) {
		mList.set(index, mOne);
	}

	/**
	 * 이름으로 인덱스 찾기
	 * @param name String으로 입력받은 값
	 * @return int값 없으면 -1
	 */
	public int findIndexByNames(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) {
				return i;
			}
		}
		return -1; // 아무것도 찾지 못했을 때
	}
	
	/**
	 * 이름으로 회원 정보 찾기
	 * @param name String으로 입력받은 값
	 * @return Member 객체 리턴, 없으면 null 리턴
	 */
	public Member findOneByName(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) {
				return mList.get(i);
//				view.printOneMember(mList.get(i));
			}
		}
		return null;
	}
	
	/**
	 * 회원 전체 정보 조회
	 * @return
	 */
	public List<Member> allMemberList() {
		return mList;
	}
	
	/**
	 * 회원 정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		mList.add(member);
	}
	
	/**
	 * 회원 정보 삭제
	 * @param index
	 */
	public void subMember(int index) {
		mList.remove(index);
	}
}
