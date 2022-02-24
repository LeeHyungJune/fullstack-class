package day03;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("3.14 + 10 : " + 3.14 + 10);
		// 1) "3.14 + 10 : " + 3.14 ==> 3.14 + 10 : 3.14
		// 2) "3.14 + 10 : " + 3.14 + 10 ==> "3.14 + 10 : " + 3.1410
		// 이 식을 "3.14 + 10 : " + 13.14로 만들고 싶다면
		// System.out.println("3.14 + 10 : " + (3.14 + 10)); 괄호를 넣어 우선적으로 계산하도록 해야 함.
	}
}
