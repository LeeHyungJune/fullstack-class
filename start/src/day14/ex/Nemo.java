package day14.ex;

public class Nemo {
	private int garo, sero, area;
	
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	public void setArea() {
		area = garo * sero;
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
	public String toString() {
		return "이 사각형의 가로는 " + garo + ", 세로는 " + sero + ", 면적은 " + area + " 입니다.";
	}
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Nemo nam = null;
		try {			
			nam = (Nemo)o;
		} catch(Exception e) {
			
		}
		// 가로 세로 
		int ngaro = nam.getGaro();
		int nsero = nam.getSero();
		
		// 둘 다 같아야 트루
		
		bool = ngaro == garo && nsero == sero;
		
		return bool;
	}
}
