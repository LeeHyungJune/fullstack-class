package day05.ex;

/*
 	문제 13)
 		랜덤한 두 수를 입력한 후
 		두 수의 최대 공약수를 구하는 프로그램을 작성하시오.
 		
 		최대 공약수 : 
 			두 수의 약수 중 가장 큰 수.
 			두 수를 나눌 수 있는 수 중 제일 큰 수.
 			
 		extra)
 			위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보시오.
 */

public class Ex13 {

	public static void main(String[] args) {
		int one = (int)(Math.random() * (100 - 1 + 1) + 1);
		int two = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		for(int a = 1 ; a < 100 ; a++) {
			if(one % a == 0 && two % a == 0) {
			System.out.println(a + "는 " + one + "과 " + two + "의 공약수입니다.");
			} 
		}
	}
}
