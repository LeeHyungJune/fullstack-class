package day03.ex;

/*
  	문제 1)
  		두 개의 숫자를 입력받은 후(가로, 세로)
  		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 구해서
  		결과를 출력하세요.
  		
  		출력형식)
  			
  			가로 : XXXXX
  			세로 : XXXXX
  			사각형 넓이 : 가로 * 세로
  			삼각형 넓이 : 밑변 * 높이 * 1/2
  		참고)
  			자바에서 *기호의 의미
  				연산자로서 곱하기의 의미
  				모든 것을 의미하기도 함
 */

import java.util.*; // 참고) 여기서 * 표시는 모든 것을 의미.

public class Ex01 {
	public static void main(String[] args) {
			// 입력도구 준비하고
			Scanner sc = new Scanner(System.in);
			
			// 입력 메세지 출력
			System.out.print("가로 : ");
			String garo = sc.nextLine(); // 문자열로 입력받는 방법
			/*
			 * 문자열로 입력받아서 처리하는 방법
			// 정수형태의 문자열을 정수로 변환하는 방법
			// Integer.parsInt(문자열);
			int width = Integer.parseInt(garo);
			*/
			
			/*
			 		정수로 입력받는 방법
			 			int 변수이름 = sc.nextInt();
			 */
			// Integer.parsInt(문자열);
			Float width = Float.parseFloat(garo); // 문자열을 실수형으로 변경
			
			
			// 출력
			// System.out.println("입력된 가로 : " + (garo + 20)); // (+) => 결합하는 문자열
			System.out.println("입력된 정수가로 : " + width); // (+) => 더하기
			
			// 입력 메세지 출력
			System.out.print("세로 : ");
//			String sero = sc.nextLine();
//			
//			Float length = Float.parseFloat(sero); // 문자열을 실수형으로 변경
			Float length = sc.nextFloat();		// 실수형으로 입력받음.
			
			//출력
			
			System.out.println("입력된 세로 : " + length);
			
			System.out.println("사각형의 넓이 : " + (width * length)); // 사각형 넓이 구하기
			System.out.println("삼각형의 넓이 : " + (width * length / 2)); // 삼각형 넓이 구하기
			// 자원 반환
			sc.close();	
	}
}
