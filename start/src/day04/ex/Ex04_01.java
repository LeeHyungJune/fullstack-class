package day04.ex;

/*
	문제 4)
		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서
		이 숫자를 년도로 하는 해는
		윤년인지 평년인지를 판별해서 출력해주는
		프로그램을 작성하시오.
		
		참고)
			윤년은 4로 나누어 떨어지고
				100 나누어 떨어지지 않고
				400으로 나누어 떨어지는 해.
*/

// import java.util.*;

public class Ex04_01 {

	public static void main(String[] args) {
		// 입력도구 준비
//		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		int year = (int)(Math.random() * (3000 - 1000 + 1) + 1);
		// 조건문 작성
		String result;
		if(year % 4 == 0) {
			if(year % 100 != 0) {
				if(year % 400 == 0) {
					result = "윤년";
				} else {
					result = "평년";
				}
			} else {
				result = "평년";
			} 
			} else {
				result = "평년";
		}
		
		// 결과 출력
		System.out.println("랜덤하게 나온 연도는 " + year + "년 이며, 이 연도는 " + result + "입니다.");
		
	}

}
