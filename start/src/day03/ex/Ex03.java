package day03.ex;

/*
 		84232 원을 지불하려고 한다.
 		우리나라 화폐단위로 이 금액을 지불하려면
 		각 단위가 몇 개씩 필요한지 계산해서 출력하세요.
 		
 		화폐단위
 			50000 권
 			10000 권
 			5000	권
 			1000	권
 			500	원
 			100
 			50
 			10
 			1
 			
 */

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(84232 / 50000);
		// 5만원권 부터 1원까지 단위를 정수형으로 설정
		
		int total = 84232;
		
		int tmp = total;
		
		// 5만원권
		int oman = tmp / 50000;
		
		//5만원권 제외한 금액 기억
		tmp = tmp % 50000;
		// tmp %= 50000; // tmp 를 50000 으로 나눈 나머지를 tmp에 대입하세요
		
		// 1만원권
		
		int man = tmp / 10000;
		
		// 1만원권 제외한 금액 기억
		
		tmp = tmp % 10000;
		
		// 5천원권
		
		int ochun = tmp / 5000;
		
		// 5천원권 제외한 금액 기억
		
		tmp = tmp % 5000;
		
		// 1000원권
		
		int chun = tmp / 1000;
		
		// 1000원권 제외한 금액
		
		tmp = tmp % 1000;
		
		// 500원권
		
		int oback = tmp / 500;
		
		// 500원권 제외한 금액
		
		tmp = tmp % 500;
		
		// 100원권 제외한 금액
		
		int back = tmp / 100;
		
		// 100원권 제외한 금액
		
		tmp = tmp % 100;
		
		// 50원권
		
		int oship = tmp / 50;
		
		// 50원권 제외한 금액
		
		tmp = tmp % 50;
		
		// 10원권
		
		int ship = tmp / 10;
		
		// 10원권 제외한 금액
		
		tmp = tmp % 10;
		
		// 1원권
		
		int il = tmp % 10;
		
		// 결과 출력
		
		System.out.println("총 금액 " + total + " 원은 ");
		System.out.println("오만원권 : " + oman + "장 ");
		System.out.println("만원권 : " + man + "장 ");
		System.out.println("오천원권 : " + ochun + "장 ");
		System.out.println("천원권 : " + chun + "장 ");
		System.out.println("오백원권 : " + oback + "장 ");
		System.out.println("백원권 : " + back + "장 ");
		System.out.println("오십원권 : " + oship + "장 ");
		System.out.println("십원권 : " + ship + "장 ");
		System.out.println("일원권 : " + il + "장 ");
				
//		int fm;
//		int m;
//		int fc;
//		int c;
//		int fb;
//		int b;
//		int fs;
//		int s;
//		int il;
//		fm = (int)(money / 50000);
//		m = (int)((money % 50000) / 10000);
//		fc = (int)(((money % 50000) % 10000) / 5000);
//		System.out.println(fc);
//		
	}
}
