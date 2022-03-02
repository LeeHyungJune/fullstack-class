package day05.ex;

/*
 	문제 10)
 		주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
 */

public class Ex10 {

	public static void main(String[] args) {
		
		// 주사위 2개

		
		
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			for(dice1 = 1 ; ; dice1++) {
			if((dice1 + dice2) == 6) {
				System.out.println(" ( " + dice1 + " , " + dice2 + " ) ");
				System.out.println("합이 6이 되었을 때 dice 1은 " + dice1 + "이고, dice 2는 " + dice2 + " 입니다.");
				break;
				}	
			}
		}	
	}
}
