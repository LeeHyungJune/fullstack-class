package day04.ex;

/*
 	문제 1)
 		1 ~ 25 중 숫자 3개를 랜덤하게 발생시켜서 
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하시오
 		
 		단, 3항 연산자를 사용해서 처리하세요.
 */

public class Ex01 {
	public static void main(String[] args) {
		// 할일 
		// 랜덤한 숫자 생성
			int a = (int)(Math.random() * (25 - 1) + 1);
			int b = (int)(Math.random() * (25 - 1) + 1);
			int c = (int)(Math.random() * (25 - 1) + 1);
		// 숫자 비교
		int result = (a > b) ? (a) : (b);
		int result2 = (c > result) ? (c) : (result);
		// 결과 출력
		System.out.println("세 숫자 중 가장 큰 숫자는 " + result2 + "입니다.");
	}
}
