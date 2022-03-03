package day07;

/*
 	6개의 메모리를 배열로 만들고
 	그 안에 랜덤한 숫자(정수)를 입력한 후 출력하세요.
 	1 ~ 45
 */


public class Test02 {

	public static void main(String[] args) {
		// 할일
		// 배열 주소 기억할 변수
		int[] lotto; 
		
		// 배열 생성
		lotto = new int[6];
		int len = lotto.length;
		loop:
		for(int i = 0 ; i < len ; i++) {
			// 랜덤한 정수 생성
			int no = (int)(Math.random() * 45 + 1);
			// 중복검사
			// 지금 만든 번호가 이전에 이미 만들어진 번호면
			// 지금 회차를 다시 반복한다.
			for(int j = 0 ; j < i ; j++) {
				// 이전에 만든 번호 추출
				int tmp = lotto[j];
				
				if(no == tmp) {
					// 이 경우는 지금 만든 번호가 이전 회차에서 이미 만든 번호이므로
					// 지금 회차를 다시 반복한다.
					
					// 회차를 1 감소 시켜주고
					i--;
					// 다음회차 진행.
					continue loop;
					
				}
			}
			
			// 배열에 넣고
			lotto[i] = no;
		
		}
//		System.out.println(lotto[0]);
//		System.out.println(lotto[1]);
//		System.out.println(lotto[2]);
//		System.out.println(lotto[3]);
//		System.out.println(lotto[4]);
//		System.out.println(lotto[5]);
		// 출력
		for(int i = 0 ; i < len ; i++) {
			System.out.print(lotto[i] + " | ");
		}
		System.out.println();
	}
}
