package com.kh.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());

		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
	}
	
	public void intExample() {
//		int [] nums = new int[3];
		IntList nums = new IntList();
//		nums[0] = 1;
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
//		int result = nums[0];
		int result = nums.get(0);
		System.out.println("result : " + result);
		
//		int size = nums.length;
		int size = nums.size();
		System.out.println("size : " + size);
		
//		nums = {}; nums = new int[3];
		nums.clear();
		System.out.println(nums);
	}
	
	public void objectExample() {
		ObjectList objList = new ObjectList();
		objList.add(10);
		objList.add('월');
		objList.add('A');
		
		Object obj = objList.get(0);
		
		int num = (int) obj; // Type mismatch: cannot convert from Object to int
		// -> 다운캐스팅으로 강제 형변환
		
		Object obj2 = objList.get(1);
		String str = (String)obj2;
		
		char c0ne = (char)objList.get(2);
	}

	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		
		System.out.println("num : " + num);
	}
	
	public void sListExample() {
		List<String> strList = new ArrayList<String>(); 
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i + 1) + "번째 값 : " + strList.get(i));
		}
		
		System.out.println("===================");
		
		strList.add(2, "체리");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i + 1) + "번째 값 : " + strList.get(i));
		}

		System.out.println("===============================");
		
		strList.set(2, "파인애플"); // set : 수정
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i + 1) + "번째 값 : " + strList.get(i));
		}
		
		
		System.out.println("=============================");
		strList.remove(2); // 삭제
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i + 1) + "번째 값 : " + strList.get(i));
		}
		
//		ArrayList<String> aList = new ArrayList<String>();
	}
}
