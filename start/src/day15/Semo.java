package day15;

public class Semo implements Comparable {
	private int width, height;
	private double area;
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public void setArea() {
		area = width * height / 2.0;
	}
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
	@Override
	public String toString() {
		return "밑변이 " + width + "이며 높이가 " + height + " 이고, 면적이 " + area + " 인 삼각형.";
	}
	
	@Override
	public int compareTo(Object o) {
		// 나와 다른 Semo 를 비교하는 기능이므로
		// 입력된 데이터를 Semo 타입으로 강제 형변환 해준다.
		Semo s = (Semo) o;
		
		// 정렬 기준은 높이 height 를 기준으로 내림차순으로 할 예정
		int result = height - s.getHeight();
		
		return -result;
	}

}
