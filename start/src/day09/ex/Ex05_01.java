package day09.ex;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		int stud[][] = new int[10][5];
//		int sum = 0;
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0 ; j < stud[i].length ; j++) {
				int no = (int)(Math.random() * (100 - 80 + 1) + 80);
				stud[i][j] = no;
//				stud[i][3] = sum;
//				sum += stud[i][j]; 
				
			}
			System.out.println(Arrays.toString(stud[i]));
	}
		
	}
}
