package com.kh.day03.array.run;

import java.util.Random;
import java.util.Scanner;

import com.kh.day03.array.exercise.Exercise_Array1;
import com.kh.day03.array.exercise.Exercise_ArrayHome1;
import com.kh.day03.array.exercise.Exercise_ArrayHome2;
import com.kh.day03.array.exercise.Exercise_Loop;

public class Run {
	public static void main(String [] args) {
//		Scanner
//		Random
		Exercise_Array1 exArr = new Exercise_Array1();
//		exArr.exercise1(); // Exercise_Array1 class에 있는 exercise1 사용
//		exArr.exercise2(); // Exercise_Array1 class에 있는 exercise2 사용
//		exArr.arrayCopyExercise();
//		exArr.lottoExercise();
		
		Exercise_Loop exLoop = new Exercise_Loop();
//		exLoop.forExercise1(); // Exercise_Loop class 에 있는 forExercise1 사용
//		exLoop.whileExercise2(); // Exercise_Loop class 에 있는 whileExercise2 사용
		
		Exercise_ArrayHome1 exHome1 = new Exercise_ArrayHome1();
//		exHome1.home1Exercise6();
		
		Exercise_ArrayHome2 exHome2 = new Exercise_ArrayHome2();
		exHome2.home2Exercise7();
	}
}
