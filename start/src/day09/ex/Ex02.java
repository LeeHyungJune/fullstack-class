package day09.ex;

/*
 	Ex02)
 		반지름 하나를 랜덤하게 입력한 후
 		원의 넓이, 원의 둘레
 		를 계산해서 출력하는 프로그램을 작성하시오.
 		
 		반지름 랜덤하게 만들어주는 함수
 		넓이 계산 함수, 둘레 계산 함수, 출력 함수.
 		를 각각 만들어서 작성하시오.
 		
 		넓이: 반지름 * 반지름 * 3.14. 둘레 : 반지름 * 2.
 */

public class Ex02 {
	public Ex02() {
		int rad = radius();
		double area = area1(rad);
		double sqr = square(rad);
		toPrint(rad, area, sqr);
		
	}
	public static void main(String[] args) {
		new Ex02();

	}
	public int radius() {
		int rad = (int)(Math.random() * 101);
		
		return rad;
	}
	public double area1(int rad) {
		double area = 0;
		area = (double)(rad * rad * 3.14); 
		
		return area;
	}
	public double square(int rad) {
		double sqr = 0;
		sqr = (double)(rad * 2 * 3.14);
		return sqr;
	}
	public void toPrint(int rad, double area, double sqr) {
		System.out.print("랜덤한 원의 반지름은 " + rad + " 이고, 넓이는 " + area + " 이고, 둘레는 " + sqr + " 입니다.");
	}
	
}
