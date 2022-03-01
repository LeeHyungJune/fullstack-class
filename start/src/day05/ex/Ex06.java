package day05.ex;

/*
 	Ex06)
 		랜덤하게 정수를 컴퓨터가 만들어 내면
 		그 수를 알아맞추는 게임을 만드시오.
 		
 		ex)
 			발생숫자 : 54
 			
 			사용자 입력 숫자 : 45
 			
 			==> "입력한 수가 더 작습니다."
 			로 메세지를 출력해서 사용자가 숫자를 알아맞추는 게임
 			
 			횟수도 같이 출력되게 하세요.
 			
 */

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 컴퓨터 랜덤
		int computer = (int)(Math.random() * (100 - 1 + 1) + 1);
		// 유저 입력
		System.out.print("사용자 입력 숫자 : ");
		// 전환
		int user = sc.nextInt();
		// 판별
		if(computer == user) {
			System.out.println("정답입니다!");
		} else if(computer > user) {
			System.out.println("입력한 수가 더 작습니다.");
			System.out.print("다시 입력하십시오 : ");
			int restart = sc.nextInt();
			if(computer == user) {
				System.out.println("정답입니다!");
			} else if(computer < user) {
		} else {
			System.out.println("입력한 수가 더 큽니다.");
			System.out.print("다시 입력하십시오 : ");
			int restart1 = sc.nextInt();
		}
		
	}
	}
}
