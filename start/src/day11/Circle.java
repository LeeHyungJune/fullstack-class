package day11;

public class Circle extends Moyang {
	private int rad;
	private double arround, area;
	
	public Circle() {}
	
	public Circle(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}

	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = rad * rad * 3.14;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public void setArround() {
		arround = rad * 2 * 3.14;
	}
	@Override
	public void toPrint() {
		System.out.printf("반지름이 %3d, 둘레가 %6.2f, 넓이가 %6.2f 인 원\n", rad, arround ,area);
	}
}
