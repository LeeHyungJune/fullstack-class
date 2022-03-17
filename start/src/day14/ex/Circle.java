package day14.ex;

public class Circle {
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
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public void setArround() {
		arround = rad * 2 * Math.PI;
	}
	@Override
	public String toString() {
		return "원의 반지름은 " + rad + ", 둘레는 " + arround + ", 면적은 " + area + " 입니다."; 
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Circle nam = (Circle)o;
		
		// 남의 반지름 
		int ban = nam.getRad(); 
		double area2 = nam.getArea();
		
		// 비교
		bool = ban == rad;
		
		return bool;
	}
}
