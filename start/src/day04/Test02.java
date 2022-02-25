package day04;

public class Test02 {
	public static void main(String[] args) {
		int no1 = 20;
		int no2 = 36;
		
		System.out.println(20 & 36); // 논리 연산자가 아닌 비트 연산자로 적용된다.
		System.out.println(no1 & no2); // 논리 연산자가 아닌 비트 연산자로 적용된다.
		System.out.println(no1 | no2);
		System.out.println(no1 ^ no2);
	}
}
