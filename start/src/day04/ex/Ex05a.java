package day04.ex;

import javax.swing.JOptionPane;

public class Ex05a {
	public static void main(String[] args) {
		// 세자리 정수를 입력받는다.
		String sno = JOptionPane.showInputDialog("세 자리 정수 입력 : ");
		// 정수 형태의 문자열을 정수로 변환해주는 기능을 가지고 있는 함수는 Integer.parseInt(문자열);
		int no = Integer.parseInt(sno);
		
		// 10 단위 이하만 추출해낸다.
		// int num = no - (no / 100 * 100);
		int num = no % 100;

		// num 이 50보다 큰지 판별한다.
		int hap = 0;
		int result = 0;
		
		hap = (num > 50) ? (100 - num) // 76 ==> 100 - 76을 더해줘야 함. 
				: (num);
		// result = num > 50 ? no + hap : no - hap; 
		result = num > 50 ? (no / 100 + 1) * 100 : (no / 100) * 100;
		
		String str = num > 50 ? "더해줘야 한다." : "빼줘야 한다.";
		
		//
		System.out.println("입력한 정수 " + no + " 는 " + result + " 가까우므로 " + hap + " 을 " + str);
		
	}
		
}
