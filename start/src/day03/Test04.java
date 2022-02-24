package day03;

public class Test04 {
	public static void main(String[] args) {
		int no1 = 5;
		int no2 = 3;
		
		System.out.println("no1 + no2 = " + (no1 / no2)); // 정수타입을 정수로 나눴기 때문에 답 또한 정수로 나옴 5 / 3 = 1
		
		// 나머지가 필요할 경우에는? 나머지가 있을 경우 그 값이 0 보다는 크다는 것
		
		System.out.println("no1 + no2 = " + (no1 + no2));
		System.out.println("no1 - no2 = " + (no1 - no2));
		System.out.println("no1 * no2 = " + (no1 * no2));
		System.out.println("no1 / no2 = " + (no1 / no2));
		System.out.println("no1 % no2 = " + (no1 % no2));
	}
}
