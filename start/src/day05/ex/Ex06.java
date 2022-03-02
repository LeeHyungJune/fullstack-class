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
			
			int n = 0;
			// 유저 입력
			while(true) {
				n += 1;
				System.out.print("사용자 입력 숫자 : ");
				// 전환
				int user = sc.nextInt();
				if(user == 0) {
					System.out.println("프로그램을 종료합니다.");
					// 이 경우는 프로그램을 즉시 종료해야 하므로
					break;
				}
				// 판별
				
				if(computer == user) {
					System.out.println(n + "번째 정답입니다!");
				} else if(computer > user) {
					System.out.println(n + "번째 입력한 수가 더 작습니다.");
					continue;
				} else if(computer < user) {
					System.out.println(n + "번째 입력한 수가 더 큽니다.");
					continue;
					}  else {
					System.out.println("오류 발생");
					break;
				}
			}
			// 자원 반환
			sc.close();	
	}
}
	

