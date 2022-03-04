package day07.ex;

/*
 	ex 03)
 		반지름 5개를 기억하는 배열을 만들고
 		랜덤하게 반지름을 만들어서 기억시키고
 		각각의 원의 넓이를 계산해서 출력해주는 프로그램을 작성하시오.
 		넓이도 배열에 기억시켜주시오.
 */

public class Ex03 {

	public static void main(String[] args) {
		// 원의 반지름 기억
		int[] a = new int[5];
		
		for(int i = 0; i < a.length ; i++) {
			int no = (int)(Math.random() * (10 - 1 + 1) + 1);
			a[i] = no;
			double b = (double)(a[i] * a[i] * 3.14);
			System.out.print(b + " , ");
		}
		
	}

}
