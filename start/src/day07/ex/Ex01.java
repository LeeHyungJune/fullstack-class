package day07.ex;

import java.util.Arrays;

/*
 	ex 01)
 		'A' - 'J' 까지의 문자를 랜덤하게 100개 만들고
 		각문자의 출현횟수를 기억할 배열을 만들어서
 		회수만큼 '*'로 출력해주는 프로그램을 작성하세요.
 		
 		ex)
 		
 			A [5] : *****
 			B [3] : ***
 			
 			...
 			J [7] : *******
 */

public class Ex01 {

	public static void main(String[] args) {
		int[] numCount = new int[10];
		
		for(int i = 0 ; i < numCount.length ; i++) {
			numCount[i] = 'A' + i;
			System.out.println((char)(numCount[i]));
		}
		int count = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int no = (int)(Math.random() * ('J' - 'A' + 1) + 'A');
			
			if(numCount[i] == no) {
				
			}
		}
		for(int i = 0 ; i < numCount.length ; i++) {
			count = numCount[i];
			System.out.print(i + " : ");
			for(int j = 0 ; j < count ; j++) {
				System.out.print("*");
			}
			
		}
	}

}
