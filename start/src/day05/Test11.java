package day05;

/*
 	구구단 5단을 출력하는데 곱이 5인 경우는 제외하고 출력하세요.
 */

public class Test11 {

	public static void main(String[] args) {
		int dan = 5;
		
		for(int i = 0 ; i < 9 ; i++) {
			int gop = (i + 1);
			if(gop == 5) {
				continue;
			}
			System.out.println(dan + " x " + gop + " = " + (dan * gop));
		}

	}

}
