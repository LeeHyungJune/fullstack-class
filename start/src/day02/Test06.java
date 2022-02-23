package day02;

public class Test06 {
	/*
 	3.14를 강제 형변환을 이용해서
 	float 타입 변수 pi 에 기억시키고 출력하세요.
	 */

	public static void main(String[] args) {
		float pi; // 변수 선언
		
		//	pi = 3.14; // 안되는 것을 확인. Type mismatch: cannot convert from double to float error.
		// 강제 형변환을 이용한 초기화 
		pi = (float) 3.14;
		System.out.println(pi);
	}
}
