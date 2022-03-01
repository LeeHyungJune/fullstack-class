package day05.ex;

/*
 	Ex03)
 		문자열을 입력받아서
 		문자를 한 글자씩 추출해서 출력하세요.
 		
 		참고)
 			문자열의 길이를 알아내는 방법
 				
 				int 변수이름 = 문자열.length();
 */

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("입력받은 문자열 : ");
		// 문자열 받기
		String str = sc.nextLine();
		int len = str.length();
		for(int i = 0 ; i < len ; i++) {
			System.out.println(str.charAt(i));
		}
	}

}
