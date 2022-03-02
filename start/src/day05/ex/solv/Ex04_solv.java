package day05.ex.solv;

/*
	Ex04)
	
		전기요금을 계산해주는 프로그램을 작성하세요
		
		전기요금표
		
					코드		기본요금		사용요금
		가정용		1			3800			245
		산업용		2			2400			157
		교육용		3			2900			169
		상업용		4			3200			174
		
		전기요금은
			기본요금 + 사용량 * 사용요금
			
		사용자 코드와 사용량을 입력하면
		전기요금을 계산해서 출력해주는 프로그램을 작성하세요
*/

import java.util.*;

public class Ex04_solv {

	public static void main(String[] args) {
		// 할일
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		while(true) {
		// 입력 메세지 출력
		System.out.print("사용용도 코드를 입력하세요! \n\t가정용\t1\n\t산업용\t2\n\t교육용\t3\n\t상업용\t4\n\t종료\t0\t\n입력 코드 : ");
		// 입력 받아서 변수에 기억
		int code = sc.nextInt();
		/*
		 	블로킹 함수(Blocking Method)
		 		: 특정 상황이 될때까지 그 함수에서 실행을 멈추고 기다리는 함수.
		 */
		if(code == 0) {
			System.out.println("프로그램을 종료합니다.");
				// 이 경우는 프로그램을 즉시 종료해야 하므로
				break;
			}
		// 입력 메세지 출력
		System.out.print("사용량 : ");
		int use = sc.nextInt();
		// 입력 받아서 변수에 기억
		String yd = "가정용";	
		int money = 0;
			switch(code) {
			case 1:
				yd = "가정용";
				money = 3800 + 245 * use;
				System.out.println("입력된 코드는 가정용으로 사용량은 " + 
						use + " 이고,\n총 전기요금은 " + (3800 + 245 * use) + "원 입니다.");
				break;
			case 2:
				yd = "산업용";
				money = 2400 + 157 * use;
//				System.out.println("입력된 코드는 산업용으로 사용량은 " 
//						+ use + " 이고,\n총 전기요금은 " + (2400 + 157 * use) + "원 입니다.");
				break;
			case 3:
				yd = "교육용";
				money = 2900 + 169 * use;
//				System.out.println("입력된 코드는 교육용으로 사용량은 " 
//						+ use + " 이고,\n총 전기요금은 " + (2900 + 169 * use) + "원 입니다.");
				break;
			case 4:
				yd = "상업용";
				money = 3200 + 174 * use;
//				System.out.println("입력된 코드는 상업용으로 사용량은 "
//						+ use + " 이고,\n총 전기요금은 " + (3200 + 174 * use) + "원 입니다.");
				break;
			default:
				System.out.println("사용자 코드를 잘못 입력하셨습니다.");
			} 
			System.out.println("입력된 코드는 " + yd + " 으로 사용량은 "
					+ use + " 이고,\n총 전기요금은 " + money + "원 입니다.");
			System.out.println("--------------------------------------------");
	}
		// 자원 반환
		sc.close();	
	}
}
