package day12;

public class Dongle extends Figure {
	private int rad;
	private double arround, area;
	
	public Dongle() {}
	
	public Dongle(int rad) {
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	@Override
	public void setArea() {
		// 원 넓이 면적 계산식
		area = rad * rad * Math.PI;
	}
	
	
	public void setArround() {
		// 원 넓이 면적 계산식
		arround = rad * 2 * Math.PI;
	}
	
	@Override
	public void toPrint() {
		// 출력
		System.out.printf("이 원은 반지름이 %3d 이고 둘레가 %6.2f 이고 면적이 %6.2f 입니다", rad, arround, area);
		System.out.println();
	}

}
