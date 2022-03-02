package day04.ex;

/*
		 문제 2 ]
		문자를 임의로 랜덤하게 입력한 후
		그 문자가 대문자이면 소문자로
		소문자이면 대문자로 변환하고 
		만약 특수문자이면 그문자 그대로 
		출력하는 프로그램을 작성하세요.
		
		참고 ]
			아스키 코드는
			
			특수문자 - 숫자( 0 - 9 ) - 
					특수문자 - 영문대문자( A ~ Z ) - 
					특수문자 - 소문자( a ~ z ) - 특수문자
		
		참고 ]
			문자열에서 문자를 추출하는 방법
				
				 문자열.charAt(위치값)
				 
			이때 위치값은 0 부터 시작한다.
			
			예 ]
				"abcd" 에서 두번째 문자를 추출하려면
				
				"abcd".charAt(1) ==> 'b'
				
		'J' -> 'j'
		==> 
		(char)('J' + ('a' - 'A'))
*/

import java.util.*;

public class Ex0202 {
	public static void main(String[] args) {
		// 할일
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("입력 문자 : ");
		// 문자열 저장
		String str = sc.nextLine();
		// 문자열 추출
		char ch = str.charAt(0);
		// 변환
		char result = (ch < 'A') ? (ch) : (
				(ch >= 'A' & ch <= 'Z')) ? (char)(ch + ('a' - 'A')) : (
						(ch > 'Z' & ch < 'a')) ? (ch) : (
								(ch >= 'a' & ch <= 'z') ? (char)(ch - ('a' - 'A')) : (ch));
		// 출력
		System.out.println("출력 문자 : " + result);
		// 자원 반환
		sc.close();	
	}
}
