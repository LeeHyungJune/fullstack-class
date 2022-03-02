package day05.ex.solv;

/*
문제 7 ]
	5자리의 숫자를 입력한 후
	각자리의 수의 합을 구하는 프로그램을 작성하세요.
	
	힌트)
		
		***** % 10 ==> 마지막자리만 꺼낸다.
		***** / 10 ==> ****
			<------
*/

import java.util.*;

public class Ex07_solv {

	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력
		System.out.print("다섯 자리 정수 입력 : ");
		// 3. 입력 받아서 변수로 기억
		int no = sc.nextInt();
		
		int sum = 0;
		
		int tmp = no;
		// 4. 반복해서 합 구하고
		for(int i = 0 ; i < 5 ; i++) {
			sum += tmp % 10;
			tmp = tmp / 10;
			
		}
		// 5. 결과 출력
		System.out.println("입력한 수 " + no + "의 각 자리수의 합은 " + sum + " 입니다.");
		sc.close();
	}
	

}
