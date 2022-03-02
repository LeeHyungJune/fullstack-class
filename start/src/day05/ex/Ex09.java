package day05.ex;

/*
 	문제 9)
 		1 - 2 + 3 - 4 + 5 - 6 ... 했을경우
 		어디까지 계산하면 값이 100을 넘는지 출력하세요.
 */

public class Ex09 {

	public static void main(String[] args) {
		
		int num = 0;
		int i = 0;
		for(i = 1 ; ; i++) {
			if(i % 2 == 0) {
				num -= i;
			} else {
				num += i;
			}
			if(num > 100) {
				break;
			}
			
		}
		System.out.println("100까지 넘어가는데 i 값은 " + i +"이고, 결과는 " + num);
	}
}
