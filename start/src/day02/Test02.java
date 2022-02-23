package day02;

public class Test02 {
	public static void main(String[] args) {	
		//  문자열 변수를 만드는 방법
		//  	1. 데이터를 직접 입력해서 만드는 방법
	  		String name1 = "홍길동";
		//  	2. 클래스를 new 시켜서 만드는 방법
		   	String name2 = new String("홍길동");
		   
			   	System.out.println("name1 : + name1");
			   	System.out.println("name2 : + name2");
			   	System.out.println("name1 == name2 : " + (name1 == name2));
	}
	// 기본자료형 변수이름;			=> 변수 선언
	// 기본자료형 변수이름 = 데이터; => 변수 선언 & 초기화
	// 클래스 이름 변수 이름;
	// 클래스 이름 = new 클래스이름();
}
