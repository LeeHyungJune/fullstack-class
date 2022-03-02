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

/* 이렇게 사용할 클래스의 경로를 지정하면 
	java.util 패키지 하위에 바로속한 클래스만 사용할 준비를 하게 된다.
	이 예제의 경우는 Scanner 를 사용할 예정인데 직접 * 대신 Scanner 로 명시해도 된다.
	
	적용순서는 * 보다는 클래스 이름을 명시하는 방법을 우선 적용시킨다.
*/

/*
 		A - abcd.txt
 			efg.txt
 		
 		B - abdc.txt
 			xyz.txt
 */
public class Ex02 {
	public static void main(String[] args) {
		// 할일
		// 입력도구 준비
		Scanner sc = new Scanner(System.in); // import 받은 Scanner 식 적용
		
		// 입력 받기 전에 메세지 출력
		System.out.print("원의 반지름 : ");
		
		// 입력받는다. 변수에 기억
		String banjirm = sc.nextLine(); // 문자열로 입력 받음
		Float radius = Float.parseFloat(banjirm); // 문자열을 실수형으로 변환
		
		// 계산하고
		double pi = 3.14;
		
		//원의 넓이 계산
		
		double area = radius * radius * pi;
		
		// 원의 둘레 계산
		double arround = 2 * radius * pi;
		
		// 출력
		System.out.println("입력된 원의 반지름 : " + radius); // 원의 반지름 출력
		System.out.println("원의 넓이 : " + area); // 원의 넓이 출력
		System.out.println("원의 둘레 : " + arround); // 원의 둘레 출력, 2가 정수형이기 때문에 () 앞에 float을 붙여 실수형으로 변환함
		
		
		/*
		 	참고)
		 		형변환에서 큰 타입의 데이터를 작은 타입으로 변환하면
		 		남는 부분은 버린다.
		 */
		int intArea = (int)area;
		int intArround = (int)arround;
		System.out.println(intArea);
		System.out.println(intArround);
		// 자원 반환
		sc.close();	
	}
}
