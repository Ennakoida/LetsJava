package com.kh.day09.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar openDate = Calendar.getInstance();
		Calendar closeDate = Calendar.getInstance();
		openDate.clear();
		openDate.set(2023, 4, 15, 9, 0);
		closeDate.clear();
//		closeDate.set(2023, 9, 26, 17, 50);
		closeDate.set(2023, 9, 26, 5, 50);
		closeDate.set(Calendar.HOUR_OF_DAY, 17);
		
		printCalendar("현재", today); // Cannot make a static reference to the non-static method printCalendar(String, Calendar) from the type Exam_Calendar
		// -> public ""static"" void printCalendar
		// 또는, new Exam_Calendar().printCalendar("현재", openDate);
		printCalendar("개강일", openDate);
		printCalendar("종강일", closeDate);
		
//		openDate.set(Calendar.HOUR_OF_DAY, 9);
//		openDate.set(Calendar.MINUTE, 0);
//		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(Calendar.MONTH)+1); // 0부터 시작하기때문에 +1을 해줘야함
//		System.out.println(today.get(Calendar.DAY_OF_MONTH)); // 날짜
//		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 요일
//		System.out.println(today.get(Calendar.HOUR_OF_DAY)); // 24시
//		System.out.println(today.get(Calendar.HOUR)); // 12시
//		System.out.println(today.get(Calendar.MINUTE)); // 분
//		System.out.println(today.get(Calendar.SECOND)); // 초
//		System.out.println(today.get(Calendar.MILLISECOND)); // 밀리초
	}
	
	// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
	public static void printCalendar(String title, Calendar cal) {
		int year 		= cal.get(Calendar.YEAR);
		int month 		= cal.get(Calendar.MONTH)+1;
		int day 		= cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek 	= cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay 	= cal.get(Calendar.HOUR_OF_DAY);
		int ampm 	  	= cal.get(Calendar.AM_PM);
		int hour	  	= cal.get(Calendar.HOUR);
		int minute	  	= cal.get(Calendar.MINUTE);
		int second	 	= cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);	
		
		
		System.out.print(title + " ");		
		System.out.print(year + "/" + month + "/" + day + "/");
		
		switch(dayOfWeek) {
			case Calendar.SUNDAY :
				System.out.print("일요일");
				break;
			case Calendar.MONDAY :
				System.out.print("월요일");
				break;
			case Calendar.TUESDAY :
				System.out.print("화요일");
				break;
			case Calendar.WEDNESDAY :
				System.out.print("수요일");
				break;
			case Calendar.THURSDAY :
				System.out.print("목요일");
				break;
			case Calendar.FRIDAY :
				System.out.print("금요일");
				break;
			case Calendar.SATURDAY :
				System.out.print("토요일");
				break;
		}		
		
		System.out.print("(" + hourOfDay + "시) ");
		
		if(ampm == Calendar.AM) 
			System.out.print("오전 ");
		else
			System.out.print("오후 ");
			
		System.out.print( hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
		
		System.out.println();
	}
}

