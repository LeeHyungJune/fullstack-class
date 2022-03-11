package day12;

public class Nemo extends Figure {
	private int garo, sero, area;
	
	public Nemo() {}
	
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	
	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public void setArea() {
		// 사각형 면적 셋팅하는 기능
		area = garo * sero;
	}

	@Override
	public void toPrint() {
		// 사각형 내용 출력하는 기능
		System.out.printf("이 사각형은 밑변이 %3d 이고 높이고 %3d 이고 면적이 %3d 입니다", garo, sero, area);
		System.out.println();
	}

}
