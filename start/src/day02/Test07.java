package day02;

public class Test07 {
	public static void main(String[] args) {
		/*
		 	타입이 다른 두 데이터의 연산의 결과는 항상 큰 타입 쪽을 따른다.
		 */
		
//		double no = 3.14;
//		int num = 10;
//		System.out.println(no + num);
		double no = 3.14 + 10;
		
		// 'a'의 다섯 번재 이후 문자를 출력하세요.
		char ch = 'a';
		
		int num = ch + 5;
		
		int num1 = ch;

		// 문자로 변환
		
		char ch1 = (char) num;
		
		System.out.println(no + num1);
		System.out.println("'a' 보다 5번째 이후 문자 : " + ch1);
	}
}
