package day16;

public class Nemo{
	public int width, height;
	public double area;
	
	public Nemo() {}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea(width * height);
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
	public boolean equals(Object o) {
		boolean bool = false;
		// 가로가 같으면 같은 네모로 처리되도록 이퀄스 함수를 오버라이드 하면 됨.
		
		Nemo n = (Nemo) o;
		
		bool = width == n.getWidth();
		
		return bool;
	}
	
	@Override
	public String toString() {
		return String.format("이 사각형은 가로가 %3d, 세로가 %3d, 면적이 %6.2f 입니다.", width, height, area);
	}
	
	@Override
	public int hashCode() {
		return 1; //	이 클래스의 객체는 이제부터 모두 해쉬코드값을 1을 갖는다.
	}
}