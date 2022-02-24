package day03;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		System.out.println('J' + 3.14);
		
		// 'J' 이후의 열 번째 문자는 무엇인가?
		
		// JOptionPane.showMessageDialog(null, "J 이후의 열 번째 문자 : " + ('J' + 10));  ==> 84
		JOptionPane.showMessageDialog(null, "J 이후의 열 번째 문자 : " + (char)('J' + 10));  // ==> 강제 형변환으로 인해 T가 나옴
	}
}
