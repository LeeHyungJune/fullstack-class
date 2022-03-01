package day04.ex;

/*
 	문제 1)
 		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰 수, 중간 수, 작은 수를 구분해서 출력하는 프로그램을 작성하세요.
 */

public class Ex01_01 {
	public static void main(String[] args) {
		// 할일
		// 랜덤한 3개 숫자 생성
		int a = (int)(Math.random() * (25 - 1 + 1) + 1);
		int b = (int)(Math.random() * (25 - 1 + 1) + 1);
		int c = (int)(Math.random() * (25 - 1 + 1) + 1);
		// 비교
		int result1 = (a > b) ? (a > c) ? (a) : (c) : (b > c) ? (b) : (c); // 가장 큰 수
		int result2 = (a < b) ? (a < c) ? (a) : (c) : (b < c) ? (b) : (c); // 가장 작은 수
		int result3 = (a > b) ? (a > c) ? (b > c) ? (b) : (c) : (a)
				: (b > c) ? (a > c) ? (a) : (c) : (b);  // 중간 수
		
		// 출력
		System.out.println("세 숫 자 " + a + ", " 
		+ b + ", " + c + " 중 가장 큰 수는 " + result1 
		+ "이고, 중간 수는 " + result3 + "이며, 가장 작은 수는 " + result2 + "입니다.");
		
	}
}
