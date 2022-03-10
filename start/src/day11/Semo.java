package day11;

public class Semo extends Moyang {
	private int width, height;
	private double area;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() { // overloagding
		area = width * height / 2.;
	}
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	/*
	 	Overriding 규칙
	 		1. 함수의 원형을 유지한다
	 			반환값 타입 + 함수이름 + 매개변수리스트
	 		2. 접근지정자는 같거나 넓은 방향으로...
	 		3. 예외처리는 같거나 좁은 방향으로...
	 */
	public void topPrint() {
		System.out.printf("밑변이 %3d 높이가 %3d 넓이가 %6.2f 인 삼각형\n", width, height, area);
	}
}
