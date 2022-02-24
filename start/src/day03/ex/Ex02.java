package day03.ex;

/*
 		문제 2
 			하나의 숫자를 입력받은 후 (원의 반지름) radius
 			그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 			
 			참고)
 				원의 넓이 : 반지름 * 반지름 * 3.14
 				원의 둘레 : 2 * 반지름 * 3.14
 */

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // import 받은 Scanner 식 적용
		
		System.out.print("원의 반지름 : ");
		String banjirm = sc.nextLine(); // 문자열로 입력 받음
		
		Float radius = Float.parseFloat(banjirm); // 문자열을 실수형으로 변환
		
		System.out.println("입력된 원의 반지름 : " + radius); // 원의 반지름 출력
		System.out.println("원의 넓이 : " + (radius * radius * 3.14)); // 원의 넓이 출력
		
		System.out.println("원의 둘레 : " + (float)(radius * 2 * 3.14)); // 원의 둘레 출력, 2가 정수형이기 때문에 () 앞에 float을 붙여 실수형으로 변환함
		
	}
}
