package day05.ex.solv;

/*
	문제 14)
		다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하시오.
		
		1. 4자리 숫자 abcd는 0 이 들어있지 않고, 모두 다른 숫자이다.
		2. 첫 번째 숫자(a)가 마지막 숫자(d) 보다 2 큼
		a  : >= 3 
		     <= 9
		  
		d  : >= 1
		     <= 7
		3. 두 번째 숫자(b)가 세 번째 숫자(c)보다 크다.
		b < c =>  c + 1
		4. 4자리 숫자를 역순으로 하고 그 수와 4자리를 합하면 16456이 된다.
*/

public class Ex14_solv {

	public static void main(String[] args) {
		int a, b, c, d;
		int result = 0;
		
		loop:
		for(a = 3; a <= 9 ; a++) {
			d = a - 2;
			for(b = 2; b < 10 ; b++) {
				
				if(b == a || b == d) {
					continue;
					// 이 경우는 같은 숫자가 발생하는 경우(조건에 맞지 않으)므로 다음 번호를 추출해서 다른 조건을 비교해야 한다.
				} 	
				// 이 라인을 실행하는 경우는 
				// b가 a, d 와 같지 않은 경우.
				for(c = 1; c < b ; c++) {
					if(c == a || c == d || c >= b) {
						continue;
					}
					// 이 행을 실행하는 순간은 필요한 숫자가 모두 만들어졌다.
					// 단지 마지막 조건에 맞는지 검사해주면 된다.
					int no1 = a * 1000 + b * 100 + c * 10 + d;
					int no2 = d * 1000 + c * 100 + b * 10 + a;
					if(no1 + no2 == 16456) {
						// 이 경우는 모든 조건에 맞는 경우이므로
						// 우리가 원하는 숫자가 만들어졌다.
						result = no1;
						
						break loop;
					}
				}
			}
		}
		// 결과 출력
		System.out.println("모든 조건을 만족하는 숫자는 [ " + result + " ] 입니다.");
	}

}
