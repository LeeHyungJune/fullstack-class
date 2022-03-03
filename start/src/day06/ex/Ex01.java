package day06.ex;

/*
 	ex 01)
 	
 		3 ~ 100 사이의 정수를 입력받아서
 		이 정수가 소수인지 판단하는 프로그램을 작성하시오.
 		
 		참고)
 			소수
 				: 1 과 자신으로만 나누어지는 수.
 				
 		보너스 문제)
 		
 			3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하시오. continue? 
 			
 */

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받은 정수 : ");
		
		int num = sc.nextInt();
		
		int a = num;
		String msg = "소수";
		for(int i = 2 ; i < a ; i++) {
			if(num % i == 0) {
				a = i;
				msg = "소수가 아닌수";
				break;
			}
		}
		System.out.println(num + " 은 " + msg + " 입니다.");
		sc.close();
		
	}

}
