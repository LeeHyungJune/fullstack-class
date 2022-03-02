package day06;

/*
 		ex)
	
	
		2 * 1 = 2
		...
		2 * 9 = 18
		
		...
		5 * 1 = 5
		5 * 2 = 10 
		
		이후로 출력되지 않게 하기.
 */

public class Text01 {
	public static void main(String[] args) {
		
		loop:
		for(int i = 0 ; i < 10 ; i++) {
			
			for(int j = 1 ; j < 10 ; j++) {
				if(i == 5 && j == 3) {
					continue loop;
				}
				System.out.println(i + "  x " + j + " = " + (i * j));
			}
			
		}
		
	}
}
