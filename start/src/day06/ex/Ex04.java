package day06.ex;

/*
  	ex 04)
  	
  		다음의 형태로 출력하시오.

*****
*****
*****
*****
*****
  		
  		
  		
***** 		
****
***
**
*

    *
   **
  ***
 ****
*****


  *
 ***
*****









 */

public class Ex04 {

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1 ; i < 5 ; i++) {
			for(int j = 1 ; j < i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 5 ; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
