package day11;

public class Test00_04 {
	Nemo[] sagak;
	
	public Test00_04() {
		//배열 세팅
		setSagak();
		
		//출력
		toPrint();
		
	}
	
	// 배열 셋팅해주는 함수
	public void setSagak() {
		sagak = new Nemo[5];
		for(int i = 0 ; i < sagak.length ; i++) {
			sagak[i] = new Nemo((int)(Math.random() * (25 - 5 + 1) + 5), (int)(Math.random() * (25 - 5 + 1) + 5));
		}
	}
	
	public void setRank() {
		// 할일
		for(int i = 0 ; i < sagak.length ; i++) {
			// 각 네모를 꺼내고
			Nemo n = sagak[i];
			// 꺼낸 네모의 면적 꺼내고
			int me = n.getArea();
			
			// 다른 네모들과 면적 비교해서 순위 수정하고
			for(int j = 0 ; j < sagak.length ; j++) {
				// 꺼낸 네모의 순위를 꺼내고
				int na = n.getRank();
				
				// 다른 네모의 면적 꺼내고
				int you = sagak[j].getArea();
				if(me < you) {
					n.setRank(na + 1);
				}
			}
		}
		
	}
	
	/*
	 	네모 순위별로 정렬해서 기억시키고 출력하시오.
	 */
	
	// 배열의 내용 출력해주는 함수
	public void toPrint() {
		for(int i = 0 ; i < 5 ; i++) {
			Nemo n = sagak[i];
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			int round = n.getRound();
			int rank = n.getRank();
		
			// 출력
			System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d이고 둘레는 %2d이고 순위는 %2d 입니다.\n", garo, sero, area, round, rank);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test00_04();
	}

}
