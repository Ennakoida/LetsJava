package com.kh.day06.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {
	public static void main(String[] args) {
		Book [] books = new Book[2];
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("제목 >> ");
//		String title = sc.nextLine();
//		System.out.print("저자 >> ");
//		String author = sc.nextLine();
////		Book book = new Book(title, author);
//		books[0] = new Book(title, author);
////		books[0] = new Book(); // The constructor Book() is undefined
////		books[0].title = title;
////		books[0].author = author;
//		
//		System.out.println("(" + books[0].title + "," + books[0].author + ")");
//		
		
		for(int i = 0; i < books.length; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			books[i] = new Book(title, author);
			
			System.out.println("(" + books[i].title + "," + books[i].author + ")");		
		}
	}
}
