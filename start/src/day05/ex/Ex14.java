package day05.ex;

/*
 	문제 14)
 		다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하시오.
 		
 		1. 4자리 숫자 abcd는 0 이 들어있지 않고, 모두 다른 숫자이다.
 		2. 첫 번째 숫자(a)가 마지막 숫자(d) 보다 2 큼
 		3. 두 번째 숫자(b)가 세 번째 숫자(c)보다 크다.
 		4. 4자리 숫자를 역순으로 하고 그 수와 4자리를 합하면 16456이 된다.
 */

public class Ex14 {

	public static void main(String[] args) {
		
		
		for(int a > 0 ; a < 10 ; a++) {
		for(int b > 0 ; b < 10 ; b++) {
		for(int c > 0 ; c < 10 ; c++) {
		for(int d > 0 ; d < 10 ; d++) {
			if(a != b & a != c & a != d & b != c & b != d & c != d) {
				if(a == d + 2) {
					if(b > c) {
						if()
				} else {
					System.out.println("조건이 맞지 않습니다.");
				}
				} else {
					System.out.println("조건이 맞지 않습니다.");
			} else {
				System.out.println("조건이 맞지 않습니다.");
			}
			int num = (1000 * a) + (100 * b) + (10 * c) + d; } 
		}
		}
		}
		}
	}
}