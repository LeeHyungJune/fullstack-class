package day04.ex;

/*
 	문제 5)
	 	3자리 숫자(100 ~ 999)를 입력받아서
	 	이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
	 	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하시오. 
	
	예)
		241 은 200에 가까우므로 41을 빼야한다.
		777 은 800에 가까우므로 23을 더해줘야 한다.
		250 은 300에 가까운 것으로 한다.
 */

import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		// 할일
		// 입력 도구 설정
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("입력 받은 수 : ");
		// 입력 받아 정수형에 저장
		int a = sc.nextInt();
	
		// 숫자 추출
		int b = (a % 100);
	
		// 판별
		int c = (b - 50 >= 0) ? (((a / 100) * 100) + 100) : ((a / 100) * 100);
		
		// 출력
		System.out.println(c);
//		System.out.println(a);		
	}
}
