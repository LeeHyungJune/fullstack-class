package day05.ex;

/*
 	Ex02 )
 		
 		'A' 부터 문자를 10개를 만들어서 출력하세요.
 */

public class Ex02 {

	public static void main(String[] args) {
		
		for(int i = 'A' ; i < ('A' + 10) ; i++) {
			System.out.print(((char)i) + " ");
		}

	}

}
