package day05.ex;

/*
		1 부터 정수를 더해갔을때 그합이 5000을 초과하는 수는 몇부터인지 출력하세요.
			
		힌트 ]
			처음 합이 5000이 넘는 순간 반복문을 종료한다.
*/

public class Ex01_01 {

	public static void main(String[] args) {
		
		int num = 0;
		
		for(int i = 1; true ; i++) {
			num = num + (i + 1);
			if(num > 5000) {
				break;
			}
		}
		System.out.println("처음 합이 5000을 넘어가는 순간의 num 값은 " + num +"입니다.");
	}

}
