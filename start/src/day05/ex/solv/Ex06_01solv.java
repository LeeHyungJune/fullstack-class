package day05.ex.solv;

/*
문제 6 ]
	랜덤하게 정수를 컴퓨터가 만들어 내면
	그 수를 알아맞추는 게임을 만드세요.
	
	예 ]
		
		발생숫자 : 54
		
		사용자입력숫자 : 45
		
		==> "입력한 수가 더 작습니다."
		로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
		
	단, 입력횟수가 5번을 초과하는 순간 컴퓨터의 승리로 처리하고
	프로그램이 종료되게 하세요.
*/

import java.util.*;

public class Ex06_01solv {

	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 2. 랜덤한 숫자 만들고 
		int computer = (int)(Math.random() * (100 + 1));
		// 3. 반복해서 처리
		for(int i = 0 ; i < 5 ; i++) { // 횟수 제한이 있기 때문에 카운터 변수가 있는 for 반복문 사용하도록 한다.
			
		
		// 메세지 출력
		System.out.print("숫자 입력 : ");
		// 3-1. 사용자가 숫자 입력
		int no = sc.nextInt();
		// 3-2. 비교해서 결과 확인
			if(no == computer) {
				System.out.println("입력한 수 " + no + "가 정답입니다.");
				// 정답을 맞췄으므로 반복을 종료
				break;
			} else if(no > computer) {
				System.out.println("큰 수를 입력했습니다.");
			} else if(no < computer) {
				System.out.println("작은 수를 입력했습니다.");
				continue;
			}
			
			if(i == 4) {
				System.out.println("게임에서 졌습니다.");
			}
		}
		sc.close();
	}

}
