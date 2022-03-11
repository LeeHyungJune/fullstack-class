package day10;

public class Circle {
	private int rad;
	private double arround, area;
	
	public void Circle() {}
	
	public void Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public void setArround() {
		arround = rad * 2 * 3.14;
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
}
