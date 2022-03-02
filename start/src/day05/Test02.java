package day05;

/*
 	정수를 입력받아서
 	그 숫자가 짝수인지 홀수인지를 판별해서 출력하세요.
 	단, 0 인 경우는 0으로 출력하세요.
 */

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력 메세지 출력
		System.out.print("입력 받은 정수 : ");
		// 입력 받아서 변수에 기억
		int num = sc.nextInt();
		// 판별
		String result = "정수"; // 짝수인지 홀수인지를 기억할 변수
		if(num == 0) {
			result = "0";
		}
		
//		if(num != 0 && num % 2 == 0) {
//			result = "짝수"; // 짝수인 경우
//		} else {
//				result = "홀수"; // 홀수인 경우
//			}
		
		/*
		  홀수인 경우
		  if(num != 0 && num % 2 !=0) {
		  	result = "홀수";
		  	}
		 */
		
		if(num != 0 ) {
			if(num % 2 == 0) {
				result = "짝수";
			}
			if(num % 2 == 1) {
				result = "홀수";
			}
		}
		
		// 결과 출력
		System.out.println("입력한 정수는 " + num + "는 " + result + "입니다.");
		// 자원 반환
		sc.close();	
	}

}
