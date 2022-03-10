package day11;

public class Test00_02 {

	public Test00_02() {
	Nemo[] sagak = new Nemo[5];
		// 만들어진 배열에 사각형 채워주는 함수 호출
		setArr(sagak);
		// 출력
		toPrint(sagak);
	}
	// 만들어진 배열에 사각형 채워주는 함수 호출
	public void setArr(Nemo[] sagak) {
		// 할일
		// 건네받은 배열의 길이 만큼 먼저 네모객체 채워주기
		for(int i = 0 ; i < sagak.length ; i++) {
			int garo = (int)(Math.random() * (25 - 5 + 1) + 5);
			int sero = (int)(Math.random() * (25 - 5 + 1) + 5);
			int area = (int)(Math.random() * (25 - 5 + 1) + 5);
						
			Nemo n = new Nemo(garo, sero);
			sagak[i] = n;
			// sagak[i] = new Nemo((int)(Math.random() * (25 - 5 + 1) + 5), (int)(Math.random() * (25 - 5 + 1) + 5));
		}
	}
	
	public void toPrint(Nemo[] sagak) {
		for(int i = 0 ; i < sagak.length ; i++) {
			Nemo n = sagak[i];
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
		
			// 출력
			System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 입니다.\n", garo, sero, area);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test00_02();
	}

}
