package day05.ex.solv;

/*
문제 8 ]
	숫자형식의 다섯자리 정수형태 문자열을 입력받아서
	각자리 수의 합을 구하는 프로그램을 작성하세요.
	
	문자열로 입력받아서 문자로 변환후 처리하세요.
	
	힌트)
		'0' 을 숫자로 변환하는 방법
			'0' - '0'
			'1' - '0'
*/

import java.util.*;

public class Ex08_solv {

	public static void main(String[] args) {
		// 할일
		Scanner sc = new Scanner(System.in);
		System.out.print("다섯 자리 정수형태 문자 입력 : ");
		String str = sc.nextLine();
		
		// 전체 길이 출력
		int len = str.length();
		
		// 합 기억할 변수 생성
		int sum = 0;
		for(int i = 0 ; i < len ; i++) {
			// 각 자리수를 문자로 꺼낸다.
			char ch = str.charAt(i);
			// 문자를 숫자로 변환
			int num = ch - '0';
			// 합계변수에 입력
			sum += num;
		}
		// 출력
		System.out.println("입력한 숫자 [ " + str + " ] 의 각 자리의 합은 [ " + sum + " ] 입니다.");
		sc.close();
	}

}
