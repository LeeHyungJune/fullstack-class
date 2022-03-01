package day04.ex;

/*
	문제 5)
 	3자리 숫자(100 ~ 999)를 입력받아서
 	이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하시오. 

예)
	241 은 200에 가까우므로 41을 빼야한다.
	777 은 800에 가까우므로 23을 더해줘야 한다.
	250 은 200에 가까운 것으로 한다.
*/

import java.util.*;

public class Ex05_01 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("입력 받은 수 : ");
		// 숫자 받기
		int num;
		int a = sc.nextInt();
		int b = a % 100;
		if(b > 50) {
			num = 100 - b;
		} else {
			num = b;
		}
		int c;
		if(b > 50) {
			c = (a / 100 + 1) * 100;
		} else {
			c = (a / 100) * 100;
		}
		// 메세지 
		String str;
		if(b > 50) {
			str = "더해줘야 한다.";
		} else {
			str = "빼줘야 한다.";
		}
		// 결과 출력
		System.out.println("입력 받은 수 " + a + "는 " + c + "에 가까우므로 " + num + str);
	}

}
