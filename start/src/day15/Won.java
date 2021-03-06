package day15;

public class Won {
	private int rad;
	private double  arround, area;
	
	public Won() {}
	
	public Won(int rad) {
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
		area = rad * rad * 3.14;
	}
	public void setArround() {
		arround = rad * 2 * 3.14;
	}
	@Override
	public String toString() {
		return "반지름이 " + rad + " 이고 둘레가 " + arround + " 이고, 넓이가 " + area + " 인 원.";
	}
}
