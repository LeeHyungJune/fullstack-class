package day04.ex;

/*
 	문제 4)
 		1000 ~ 3000 명 사이의 숫자를 랜덤하게 발생시켜서
 		이 숫자를 년도로 하는 해는
 		윤년인지 평년인지를 판별해서 출력해주는
 		프로그램을 작성하시오.
 		
 		참고)
 			윤년은 4로 나누어 떨어지고
 				100 나누어 떨어지지 않고
 				400으로 나누어 떨어지는 해.
 */

public class Ex04 {
	public static void main(String[] args) {
		// 할일
		// 랜덤 숫자 생성
		int year = (int)(Math.random() * (3000 - 1000) + 1);
		// 조건식
		String result = (year % 4 == 0) ? ((year % 100 == 0 & year % 4 == 0) ? ("평년") : ((year % 400 == 0 ) ? ("윤년") : ("평년"))) : ("평년");
		// 결과 출력
		System.out.println("이번 연도는 " + year + "년 이며, " + result + "입니다.");
	}
}
