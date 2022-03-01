package day05;

/*
	나이를 입력받아서
		유년기
		10대		: 10 ~ 19 ==> 10	<- age / 10 * 10
		20대		: 20 ~ 29 ==> 10	<- age / 10 * 10
		30대		: 30 ~ 39 ==> 10	<- age / 10 * 10
		40대		: 40 ~ 59 ==> 10	<- age / 10 * 10
		장년층		: 60 ~ 	  ==> 10	<- age / 10 * 10
	으로 구분해서 출력하세요.
 */

import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		// 할일
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("입력 받은 나이 : ");
		// 입력받아서 변수 기억
		int age = sc.nextInt();
		// 판별 및 결과 기억
		// 결과값 변수
		String sage = "장년층";
		
		int gen = age / 10 * 10;
		
		switch (gen) { // break; 가 없으면 유년기와 장년층으로 밖에 나오지 않는다.
		case 0:
			sage = "유년기";
			break;
		case 10:
			sage = "10대";	
			break;
		case 20:
			sage = "20대";
			break;
		case 30:
			sage = "30대";
			break;
		case 40:
			sage = "40대";
			break;
		default:
			sage = "장년층";
		}
		
		// 출력
		System.out.println("입력한 나이 " + age + "는 " + sage + " 입니다.");
	}
}

