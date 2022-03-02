package day05.ex;

/*
문제 8 ]
	숫자형식의 다섯자리 정수형태 문자열을 입력받아서
	각자리 수의 합을 구하는 프로그램을 작성하세요.
	
	문자열로 입력받아서 문자로 변환후 처리하세요.
*/

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		//할일
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("문자열 입력 : ");
		// 문자 기억
		String str = sc.nextLine();
		
		int sum = 0;

		// 문자 변환
		for(int i = 0 ; i < 99999 ; i++) {
			int no = str.charAt(i);
			
		}
		
		// 합
		sc.close();
	}

}
