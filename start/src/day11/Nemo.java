package day11;

public class Nemo {
	private String name;
	private int garo, sero, area, round, rank;
	
//	{
//		rank = 1;	// 초기화 블럭을 이용한 초기화
//	}
	
	// 기본 생성자
	public Nemo() {}
	
	// 입력받은 데이터를 셋팅해서 객체로 만들 수 있는 생성자
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		setRound();
		rank = 1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
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
	public void setArea() {
		area = garo * sero;
	}
	public int getRound() {
		
		return round;
	}

	public void setRound(int round) {
		
		this.round = round;
	}
	public void setRound() {
		round = 2 * (garo + sero);
	}
	
	@Override
	public String toString() {
		return "Nemo [name=" + name + ", garo=" + garo + ", sero=" + sero + ", area=" + area + ", round=" + round
				+ ", rank=" + rank + "]";
	}
	
	
	
}
