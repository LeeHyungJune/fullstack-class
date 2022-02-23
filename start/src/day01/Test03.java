package day01;

public class Test03 {
	// System.out.println("한글 주석 작성 끝...");
	/*
	 클래스 블럭 바로 아래에는 일반명령이 오면 절대로 안 된다.
	 클래스 블럭( {} ) 에 올 수 있는 것은
	 	변수, 함수
	 가 올 수 있다.
	 
	 ==> 이 말은 클래스는 변수와 함수로 구성된다.
	 */
	public static void main(String[] args) {
		System.out.printf("%4s:%5.2f", "파이", 3.14); // 4는 위치, s는 문자열, 5도 위치 .2는 소수점 2자리까지 반영 f는 정수?
		System.out.println();
		System.out.printf("%2s:%5.2f", "원주율", 3.14);
	}
}