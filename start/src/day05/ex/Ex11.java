package day05.ex;

/*
 	문제 11)
 		2x + 4y = 10 의 방정식의 결과를 출력하세요.
 		
 		단, x, y는 모두
 			0 <= x, y <= 10
 		사이의 숫자이다.
 */

public class Ex11 {

	public static void main(String[] args) {
		for(int x = 0 ; x <= 10 ; x++) {
		for(int y = 0 ; y <= 10 ; y++) {
				if((2 * x) + (4 * y) == 10) {
					System.out.println("2x + 4y = 10을 만족하는 x는 " + x + "이며, y는 " + y + " 입니다.");
					break;
				}
		}
		}
		

	}

}
