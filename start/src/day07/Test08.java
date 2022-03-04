package day07;

import java.util.Arrays;

/*
 	정수 10개를 랜덤하게 만들어서 기억하는 배열을 만들고
 	기억된 정수를 내림차순 정렬해서 다시 기억시키고 배열의 데이터를 출력하세요.
 	
 */

public class Test08 {

	public static void main(String[] args) {
		// 배열 생성
		int[] num = new int[10];
		// 데이터 입력
		loop:
		for(int i = 0 ; i < num.length ; i++) {
			int no = (int)(Math.random() * 99 + 1);
			for(int j = 0 ; j < i ; j++) {
				if(num[j] == num[i]) {
					i--;
					continue loop;
				}
			}
			num[i] = no;
		}

		System.out.println(Arrays.toString(num));
		// 정렬한다
		for(int i = 0 ; i < num.length - 1; i++) {
				
				
				for(int j = i + 1 ; j < num.length ; j++) {
					
					/*
					int pre = num[i];
					int post = num[j];
					
					if(post > pre) {
						num[i] = post;
						num[j] = pre;
					}
					 */
					if(num[j] > num[i]) {
						int tmp = num[i];
						num[i] = num[j];
						num[j] = tmp;
					}
			}
		}
		// 배열 출력
		System.out.print("| ");
		for(int no : num) {
			System.out.print(no + " | ");
		}
	}

}
