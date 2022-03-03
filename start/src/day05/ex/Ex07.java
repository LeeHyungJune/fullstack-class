package day05.ex;

/*
	문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
*/

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 5자리의 숫자 : ");
		
		int a = sc.nextInt();
		int sum = 0;
		int tmp = a;
		
		for(int i = 0 ; i < 5 ; i++) {
			sum += tmp % 10;
			tmp = tmp / 10;
			
			// 자원 반환
			sc.close();	
		}
		System.out.println(sum);
	}
}
////입력도구
//Scanner sc = new Scanner(System.in);
////메세지 출력
//System.out.print("입력한 5자리의 숫자 : ");
////변환
//int a = sc.nextInt();
//int man = a / 10000;
//int chun = a % 10000 / 1000;
//int bak = a % 10000 % 1000 / 100;
//int sib = a % 10000 % 1000 % 100 / 10;
//int il = a % 10000 % 1000 % 100 % 10;
//
//int result = (man + chun + bak + sib + il);
//
//System.out.println("각 자리의 수의 합은 " + result + " 입니다.");