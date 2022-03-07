package day09.ex;

/*
 	Ex03)
 		사각형의 넓이를 계산하는 프로그램을 작성하시오.
 		
 		길이 랜덤 생성 함수
 		넓이 계산 함수
 		내용 출력 함수
 		
 		
 */

public class Ex03 {
	public Ex03() {
		int len = length();
		int sqr = square(len);
		toPrint(len, sqr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
		
	}
	public int length() {
		int len = (int)(Math.random() * 101);
		return len;
	}
	public int square(int len) {
		int sqr = len * len;
		return sqr;
	}
	public void toPrint(int len, int sqr) {
		System.out.println("랜덤한 사각형의 길이는 " + len + " 이고, 넓이는 " + sqr + " 입니다.");
	}
}
