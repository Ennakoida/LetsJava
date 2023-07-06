package com.kh.day09.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public static void main(String[] args) {
		// 홍길동/장화/홍련/콩쥐/팥쥐 의 문자열 데이터를
		// '/' 기준으로 잘라서 홍련만 출력하시오.
		
		String str = "홍길동/장화/홍련/콩쥐/팥쥐";

		// split
		String strArr[] = str.split("/");
		
		System.out.println(strArr[2]); // 배열 지정 출력
		
		for(int i = 0; i < strArr.length; i++) { // 일치하는 거 찾기
			if(strArr[i].equals("홍련"))
				System.out.println(strArr[i]);
		}
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(str, "/");
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			if(token.equals("홍련"))
				System.out.println(token);
		}
	}
}
