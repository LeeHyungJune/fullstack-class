package day05.ex;

/*
 	문제 12)
 		5자리 숫자 하나를 입력받아서 
 		이 숫자가 회문수인지 아닌지 판별하는 프로그램을 작성하시오.
 		
 		참고)
 			회문수란?
 				첫 번째 자리수와 마지막 자리수
 				두번째 자리수와 마지막에서 두 번째 자리수
 				...
 				가 동일한 수를 말한다.
 		
 		abcde 라는 수가 있다면
 		a == e
 		b == d
 			일 때 회문수가 된다.
 			
 				
 */

import java.util.*;	

public class Ex12 {
	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("입력 받은 수 : ");
		// 추출
		int num = sc.nextInt();
		// 판별
		
		if(num / 10000 == num % 10) {
			if(num % 10000 / 1000 == num % 100 / 10) {
				System.out.println("입력받은 수 " + num + "은 회문수 입니다.");
			} else {
				System.out.println("입력받은 수 " + num + "은 회문수가 아닙니다.");
			} 
		} else {
			System.out.println("입력받은 수 " + num + "은 회문수가 아닙니다.");
		}
		// 자원 반환
		sc.close();	
	}
}
