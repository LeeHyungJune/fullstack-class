package day04.ex;

/*
	문제 1)
		1 ~ 25 중 숫자 3개를 랜덤하게 발생시켜서 
		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하시오
		
		단, 3항 연산자를 사용해서 처리하세요.
*/

public class Ex01_02 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * (25 - 1 + 1) +1);
		int b = (int)(Math.random() * (25 - 1 + 1) +1);
		int c = (int)(Math.random() * (25 - 1 + 1) +1);
		int result;
		
		if(a > b && a > c) {
			result = a;
		} else if (b > a && b > c) {
			result = b;
		} else {
			result = c;
		}
	System.out.println("3 숫자 중 가장 큰 수는 " + result + "입니다.");
	}
}
	
	
	
	
	
	