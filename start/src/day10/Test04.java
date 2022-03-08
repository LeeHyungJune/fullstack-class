package day10;

/*
 	Black Pink 멤버의 정보를 기억할 배열을 만들고
 	데이터를 입력하고
 	완성이 되면 내용을 출력하세요.
 	단, 각 멤버의 정보는 Friend 클래스에 기억시키도록 한다.
 */

public class Test04 {
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] naee;
	char gen;
	String addrs;
	
	Friend[] black;
	
	public Test04() {
		// 멤버 변수들 초기화
		setData();
		
		// 배열 완성
		setBlack();
		
		// 출력
		toPrint();
	}
	
	public void setBlack() {
		black = new Friend[4];
		
		// 확보된 공간에 데이터 채워주고
		for(int i = 0; i < black.length ; i ++) {
			black[i] = new Friend();
		}
		
		// 각 방의 객체에 데이터 채워주고
		for(int i = 0 ; i < black.length ; i++) {
			Friend f = black[i];		// 둘 다 주소만 기억.
			
			f.setName(names[i]);
			f.setTel(tels[i]);
			f.setAddr(addrs);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setGen(gen);
			f.setAge(naee[i]);
			
//			black[i] = f; // 주소를 인덱스 위치의 내용과 변수가 공유하기 때문에 의미가 없다.
		}
	}

	// 각 데이터를 초기화 시켜주는 함수
	public void setData() {
		names = new String[] {"제니", "리사", "로제", "지수"};
		tels = new String[] {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-1234-5678"};
		email = new String[] {
				"jennie@githrd.com", "lisa@githrd.com", "rose@githrd.com", "jisu@githrd.com"
		};
		birthday = new String[] {
				"1996/03/08", "1995/04/05", "1997/05/05", "1996/07/07"
		};
		naee = new int[] {27, 28, 26, 27};
		gen = 'F';
		addrs = "ygM";
		
	}
	// Friend 배열 내용 출력해주는 함수
	public void toPrint() {
		// 이 함수가 호출되면 전역변수 black 의 내용을 출력할 일이 있을 때이므로
		// 별도로 데이터를 입력받지 않아도 배열에 접근이 가능하다.
		for(int i = 0; i < black.length ; i++) {

			String name = black[i].getName();
			String addrs = black[i].getAddr();
			String tel = black[i].getTel();
			String mail = black[i].getMail();
			String birth = black[i].getBirth();
			int age = black[i].getAge();
			char gen = black[i].getGen();
			
			System.out.println("이름 : " + name);
			System.out.println("주소 : " + addrs);
			System.out.println("번호 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("생일 : " + birth);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + (gen == 'M' ? "남자" : "여자"));
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		}
	}
	
	public static void main(String[] args) {
		new Test04();

	}

}