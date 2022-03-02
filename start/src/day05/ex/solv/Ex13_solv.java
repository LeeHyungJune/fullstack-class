package day05.ex.solv;

/*
	문제 13)
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하시오.
		
		최대 공약수 : 
			두 수의 약수 중 가장 큰 수.
			두 수를 나눌 수 있는 수 중 제일 큰 수.
			
		최소 공배수 :
			두 수에 서로 공통으로 존재하는 배수 중 가장 작은 수
			
		extra)
			위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보시오.
*/

import java.util.*;

public class Ex13_solv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1번 메세지 출력
		System.out.print("첫 번째 정수 : ");
		// 1번 데이터 기억
		int no1 = sc.nextInt();
		// 2번 메세지 출력
		System.out.print("두 번째 정수 : ");
		// 2번 데이터 기억
		int no2 = sc.nextInt();
		// 공약수 찾기
		int min = (no1 < no2) ? no1 : no2;
		int result = 1;
		
		for(int i = min ; i > 1 ; i--) {
			if(no1 % i == 0 && no2 % i == 0) {
				result = i;
				// 원하는 숫자를 찾았으므로 더이상 반복작업을 할 이유가 없음.
				break;
			}
		}
		// 결과 출력
		System.out.println("입력 받은 두 수 " + no1 + " , " + no2 + 
				"의 최대 공약수는 " + result + " 입니다.");
		sc.close();
	}
}