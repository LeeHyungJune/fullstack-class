package day05.ex;

/*
Ex02_01 ]
	3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
	단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
*/

public class Ex02_01 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * (10 - 3 + 1) + 1);
		
		int len = length(a);
		
		for(int i = 0 ; i < len ; i++) {
			char ch = (char)(Math.random() * ('z' - 'a' + 1) + 'a');
			System.out.println(ch);
		}
//		System.out.println("랜덤한 정수의 길이는 " + a + "이며, 그 길이로 하는 영어 단어는 " + "b" + "입니다.");
	}
	

}
