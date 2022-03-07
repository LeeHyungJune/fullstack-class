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
		int num[] = new int[10];
		int num1[] = new int[10];
		
		for(int i = 0 ; i < num.length; i++) {
			num[i] = 'A' + i;
		}
		for(int i = 0 ; i < 100 ; i++) {
			char ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			int idx = ch - 'A';
			int oldcount = num1[idx];
			int newcount = oldcount + 1;
			num1[ch - 'A'] = newcount;
		}
		for(int i = 0 ; i < num1.length ; i++) {
			int arr = num[i];
			char ch = (char) arr ; // 문자의 아스키 코드값을 꺼내서 강제 형변환
			int count = arr; // 카운트 수
			
			// 타이틀 출력
			System.out.print(ch + " [ " + count + " ] : ");
			for(int j = 0 ;  j < count ; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
	}
}
