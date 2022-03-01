package day04.ex;

/*
	문제 3)
		게시물을 게시판에 출력하는데
		하나의 페이지에 게시물을 15개를 출력할 예정이다.
		게시물 수를 랜덤하게 발생시켜서
		게시판의 페이지가 몇 페이지가 필요한지를 계산해서
		출력해주는 프로그램을 작성하시오.
		
		참고)
			게시물이 없는 경우는 게시물이 없는 페이지가 적어도 1 페이지는 필요하다.
*/

public class Ex03_01 {

	public static void main(String[] args) {
		// 랜덤 출력
		int a = (int)(Math.random() * (15 - 1 + 1) - 1);
		// 판별
		int result;
		if(15 % a == 0) {
			result = (15 / a) + 1;
		} else {
			result = (15 / a) + 2;
		}
		// 출력
		System.out.println("하나의 페이지에 출력할 게시물은 " + a + "개 이며, 필요한 페이지는 " + result + "페이지 입니다.");
	}

}
