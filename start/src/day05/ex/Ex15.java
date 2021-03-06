package day05.ex;

/*
 	문제 15)
 		구구단을 다음 형식으로 출력하시오.
 		
 		2 x 1 = 2		3 x 1 = 3		4 x 1 = 4		5 x 1 = 5
 		2 x 2 = 4		3 x 2 = 6		4 x 2 = 8		5 x 2 = 10
 		...
 		2 x 9 = 18		3 x 9 = 27		4 x 9 = 36		5 x 9 = 45
 		
 		6 x 1 = 6		7 x 1 = 7		8 x 1 = 8		9 x 1 = 9
 		6 x 2 = 12		7 x 2 = 14		8 x 2 = 16		9 x 2 = 18
 		...
 		6 x 3 = 18		7 x 3 = 21		8 x 3 = 24		9 x 3 = 27
 */

public class Ex15 {

	public static void main(String[] args) {
		for(int i = 0 ; i < 2 ; i++) {
			
			for(int j = 0 ; j < 9 ; j++) {
				
				for(int k = 0; k < 4 ; k++) {
					int dan = 2 + (k * 1) + (i * 4); // i는 0일때와 1일때만 존재. 2단일 때는 0 3단일 때는 1
					int gop = j + 1;
					
					// 출력
					System.out.print(dan + " x " + gop + " = " + (dan * gop) + "\t");
				}
				System.out.println("");
				
			}
			System.out.println("");
		}
	}
}
