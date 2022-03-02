package day05.ex.solv;

/*
	문제 9)
		1 - 2 + 3 - 4 + 5 - 6 ... 했을경우
		어디까지 계산하면 값이 100을 넘는지 출력하세요.
		
		힌트)
		1 + (-2) + 3 + (-4) + ...
		no * -1
*/

public class Ex09_solv {

	public static void main(String[] args) {
		int no = -1;
		int sum = 0;
		int i = 1;
		for(i = 1 ; ; i++) {
			no = no * -1;
			sum = sum + i * no;
			if(sum > 100) {
				break;
		}
	}
	System.out.println("1부터 " + (i * no) + " 까지의 합이 " + sum + " 처음 100을 넘기게 된다");

}
	

}
