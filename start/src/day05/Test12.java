package day05;
/*
 	구구단을 출력하세요.
 */
public class Test12 {
	public static void main(String[] args) {
		
		for(int i = 2 ; i < 9 ; i++) { // 2단 부터 9단까지
			
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
			}
			System.out.println();	
		}
	}
}
