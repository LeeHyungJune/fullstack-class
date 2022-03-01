package day05.ex;

/*
 	Ex05)
 		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
 		
 		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
 		가위, 바위, 보로 가정하고
 		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
 		
 		누가 이겼는지를 확인하는 프로그램을 작성하시오.
 */

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		// 입력 도구
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("가위(1) 바위(2) 보(3) : ");
		int computer = (int)(Math.random() * (3 - 1 + 1) + 1);
		int user = sc.nextInt();
		// 1 => 가위, 2 => 바위, 3 => 보 
		
		if(user == 1) {
			if(computer == 1) {
				System.out.println("둘 다 가위를 낸 관계로 무승부");
			} else if (computer == 2) {
				System.out.println("유저가 가위, 컴퓨터가 바위를 냈으므로 컴퓨터의 승");
			} else if (computer == 3) {
				System.out.println("유저가 가위, 컴퓨터가 보를 냈으므로 유저 승");
			} else {
				System.out.println("잘못된 접근입니다");
			}
		} else if(user == 2) {
			if(computer == 1) {
				System.out.println("유저가 바위, 컴퓨터가 가위를 냈으므로 유저 승");
			} else if (computer == 2) {
				System.out.println("둘 다 바위를 낸 관계로 무승부");
			} else if (computer == 3) {
				System.out.println("유저가 바위, 컴퓨터가 보를 냈으므로 컴퓨터의 승");
			} else {
				System.out.println("잘못된 접근입니다");	
				}
		} else if(user == 3) {
			if(computer == 1) {
				System.out.println("유저가 보, 컴퓨터가 가위를 냈으므로 컴퓨터의 승");
			} else if (computer == 2) {
				System.out.println("유저가 보, 컴퓨터가 바위를 냈으므로 유저 승");
			} else if (computer == 3) {
				System.out.println("둘 다 보를 냈으므로 무승부");
			} else {
				System.out.println("잘못된 접근입니다");	
				}
		} else {
			System.out.println("잘못된 접근입니다");
		}
	}
}