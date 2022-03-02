package day05;

/*
 	나이를 입력받아서
 		유년기
 		10대
 		20대
 		30대
 		40대
 		장년층
 	으로 구분해서 출력하세요.
 */

import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		// 조건이 여러가지인 경우 if ~ else if 구문으로 처리하는 것이 편하다.
		
		// 할일
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("입력 받은 나이 : ");
		// 입력 받아 변수에 기억
		int age = sc.nextInt();
		// 판별 결과 기억
		// 결과 변수 만들고
		String sage = "장년층";
		
		if (age < 10) {
		sage = "유년기";
		} else if (age <20) { // age >= 10 & age < 20; 라는 의미. 범위를 작은 것부터 점점 크게 만들어라.
			sage = "10대";
		} else if (age < 30) {
			sage = "20대";
		} else if (age < 40) {
			sage = "30대";
		} else if(age < 50) {
			sage = "40대";
		} else {
			sage = "장년층";
		}	
	
		// 결과 출력
		System.out.println("입력 받은 나이 " + age + "살은 " + sage + " 입니다.");
		// 자원 반환
		sc.close();	
		
	}
}
