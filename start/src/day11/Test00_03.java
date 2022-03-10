package day11;

class Test00_03 {
	
	Nemo[] sagak;
	
	public Test00_03() {
		// sagak 변수에 네모 배열을 만들어서 네모객체가 채워지도록 해준다
	}
	
	
	// sagak 세팅해주는 함수
	public void setSagak() {
		sagak = new Nemo[5];
		// 배열에 네모 객체 채워
		for(int i = 0 ; i < sagak.length ; i++) {
			// 가로 세로 만들고
			int garo = (int)(Math.random() * (25 - 5 + 1) + 5);
			int sero = (int)(Math.random() * (25 - 5 + 1) + 5);
			
						
			Nemo n = new Nemo(garo, sero);
			
			sagak[i] = n;
		}
	}
	
	// sagak 배열의 내용을 출력해주는 함수
	public void toPrint() {
		/*
		 	이 함수는 sagak 변수에 기억된 배열에 접근해서
		 	배열 안에 기억된 네모 객체를 하나씩 꺼내서
		 	꺼낸 네모객체의 정보를 출력해주는 기능의 함수
		 	
		 */
		for(int i = 0 ; i < 5 ; i++) {
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
		new Test00_03();
	}

}
