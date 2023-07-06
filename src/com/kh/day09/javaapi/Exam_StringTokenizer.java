package com.kh.day09.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		String query = "name=kite&addr=seoul&age=21";
		String [] words = query.split("&"); // split -> 배열
		
//		StringTokenizer st = new StringTokenizer(query, "&");
		StringTokenizer st = new StringTokenizer(query, "&=");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
	}
}
