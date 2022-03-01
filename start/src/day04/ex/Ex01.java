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
			int a = (int)(Math.random() * (25 - 1 + 1) + 1);
			int b = (int)(Math.random() * (25 - 1 + 1) + 1);
			int c = (int)(Math.random() * (25 - 1 + 1) + 1);
			
		// 보너스 문제 : -100 ~ 100 사이의 정수를 랜덤하게 발생시켜 보시오.
			//	int no1 = (int)(Math.random() * (100 - (-100) + 1) +1);
			
		// 숫자 비교, 판별해서 변수에 기억.			
		// int max = (a > b) ? ((a > c) ? (a) : (c)) : ((b > c) ? (b) : (c));
		int result = (a > b) ? (a) : (b);
		int result2 = (c > result) ? (c) : (result);
		// 결과 출력
		System.out.println("\"세 숫자 \n\t" + a + ", " + b + ", " + c + "\n 중 가장 큰 숫자는 " + result2 + "입니다.\"");
		/*
		 	참고)
		 		문자열을 표현할 때 문자열 안에 " 기호를 출력하는 방법
		 		==> 
		 			\"
		 		이때 사용한 \ 를 이스케이프문자 라고 부른다.
		 		
		 		많이 사용하는 문자들
		 			
		 			"\		=> 문자열 내에 " 를 표현
		 			\n		=> 한 줄 내림 기호
		 			\r		=> 캐리지리턴.  
		 			\t		=> tab 을 표현
		 			\b		=> backspace. 
		 */
	}
}
