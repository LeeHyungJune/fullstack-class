package day05;

/*
  	구구단 7단을 출력하세요.
 */

public class Test07 {
	public static void main(String[] args) {
		int dan = 7;
		
		for(int i = 0 ; i < 9 ; i++) {
			System.out.println(dan + " x " + (i + 1) + " = " + (dan * (i + 1))); // 괄호 필수. why? int 형, 즉 정수형이기 때문에
		}
	}
}
