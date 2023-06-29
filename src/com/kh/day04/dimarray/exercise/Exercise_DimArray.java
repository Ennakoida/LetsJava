package com.kh.day04.dimarray.exercise;

import java.util.Random;

public class Exercise_DimArray {
	
//	5	4	3	2	1	
//	10	9	8	7	6	
//	15	14	13	12	11	
//	20	19	18	17	16	
//	25	24	23	22	21	
	public void exercise1() {
		int arrs[][] = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs[i].length - 1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.print(arrs[i][j] + "\t");
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
//	1	6	11	16	21	
//	2	7	12	17	22	
//	3	8	13	18	23	
//	4	9	14	19	24	
//	5	10	15	20	25	
	public void exercise2() {
		int arrs[][] = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.print(arrs[i][j] + "\t");
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
//	5	10	15	20	25	
//	4	9	14	19	24	
//	3	8	13	18	23	
//	2	7	12	17	22	
//	1	6	11	16	21	
	public void exercise3() {
		int arrs[][] = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs[i].length - 1; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.print(arrs[i][j] + "\t");
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
//	1	2	3	4	5	
//	10	9	8	7	6	
//	11	12	13	14	15	
//	20	19	18	17	16	
//	21	22	23	24	25	
	public void exercise4() {
		int arrs[][] = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k;
					k++;
				}				
			} else {
				for(int j = arrs[i].length - 1; j >= 0; j--) {
					arrs[i][j] = k;
					k++;
				}
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.print(arrs[i][j] + "\t");
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}	
	
//	2차원 배열에 학년별로 1,2학기 성적으로 저장하고
//	4년간 전체 평점 평균을 출력하라.
	public void exercise5() {
		double score[][] = new double[4][2];
		Random rand = new Random();
		double sum = 0;
		int cnt = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "학년\t");
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = (rand.nextDouble() * 2.5) + 2;
				System.out.printf("%d 학기 성적 : %.2f\t", (j + 1), score[i][j]);
				sum += score[i][j];
				cnt++;
			}
			System.out.println();
		}
		
		for(int i = 0; i < score.length; i++) {
			double yearScore = 0;
			for(int j = 0; j < score[i].length; j++) {
				yearScore += score[i][j];
			}
			System.out.printf("%d 학년 평점 : %.2f\n", (i + 1), yearScore);				
		}
				
		System.out.printf("총 평점 : %.2f\n", sum);
		System.out.printf("총 평점 평균 : %.2f\n", sum / cnt);
	}
}
