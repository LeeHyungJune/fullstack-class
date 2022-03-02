package day05.ex;

/*
	Ex05)
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하시오.
		
	풀이)
		컴퓨터 - 사람 으로 계산해서 
		
				컴퓨터
				1		2		3
	사람	1	0		1		2
			2	-1		0		1
			3	-2		-1		0
			
			여기서
				비긴 경우 값 = 0
				사람이 이긴 경우 값 = -1, 2
				컴퓨터가 이긴 경우 값 = 1, -2
*/

import java.util.*;

public class Ex05_solv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		// 메세지 출력
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요!\n게임종료는 0을 입력하세요! : ");
		// 변수 기억
		int user = sc.nextInt();
		// 입력된 숫자가 종료 숫자면 바로 종료
		if(user == 0) {
			System.out.println("##### 프로그램을 종료합니다. #####");
			break;
		}
		
		String ustr = "가위";
		switch(user) {
		case 1:
			ustr = "가위";
			break;
		case 2:
			ustr = "바위";
			break;
		case 3:
			ustr = "보";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			continue; // 조건식으로 다시 가서 처음부터 실행
		}
		

		
		// 컴퓨터 랜덤
		int computer = (int)(Math.random() * (3 - 1 + 1) + 1);
		
		String cstr = "가위";
		switch(computer) {
		case 2:
			cstr = "바위";
			break;
		case 3:
			cstr = "보";
			break;
		}
		
		//조건에 따라 결과 출력
		
		String msg = "비";
		int result = computer - user;
		if(result == 1 ^ result == -2) {
			msg = "컴퓨터가 이";
//			System.out.println("컴퓨터는 " + cstr + ", 사람은 " + ustr + " 로/으로 컴퓨터가 이겼습니다.");
		} else if(result == -1 ^ result == 2) {
			msg = "당신이 이";
//			System.out.println("컴퓨터는 " + cstr + ", 사람은 " + ustr + " 로/으로 당신이 이겼습니다.");
		} else if(result == 0){
//			System.out.println("컴퓨터는 " + cstr + ", 사람은 " + ustr + " 비겼습니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println("컴퓨터는 " + cstr + "\n사람은 " + ustr + "\n결과는 " + msg + "겼습니다.");
		}
		// 자원 반환
		sc.close();	
	}
}	
