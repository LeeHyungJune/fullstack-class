package day13;

/*
 	25 를 - 3 에서 3 까지의 정수로 나눈 결과를 출력하는 프로그램을 작성하시오
 	필요하면 예외처리도 하시오.
 */

public class Test04 {
	
	public Test04() {
		int no = 25;
		int result = 0;
		
		for(int i = -3 ; i <= 3 ; i++) {
			try {
				result = no / i;
			} catch(Exception e) {
				System.out.println("예외 발생 ] 0으로 나누는 연산을 시도했습니다.");
				result = no;
			}
			System.out.println(no + " / " + i + " = " + result + "입니다.");
		}
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
