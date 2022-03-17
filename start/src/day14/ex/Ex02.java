package day14.ex;
/*
 	Ex02)
 		사각형의 정보를 기억하는 클래스 Nemo 를 제작하시오.
 		필요한 변수와 함수, 생성자는 필요한만큼 추가하고
 		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리가 되도록
 		equals() 함수를 오버라이드 하시오.
 		이 클래스 객체를 출력하면 내용이 출력되도록 toString() 를 오버라이드하시오.
 */
public class Ex02 {

	public Ex02() {
		Nemo n1 = new Nemo(10, 10);
		Nemo n2 = new Nemo(10, 10);
		
		String result = (n1.equals(n2)) ? "같은" : "다른";
		
		System.out.println("n1 과 n2 네모는 " + result + " 네모 입니다.");
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n1 == n2 가로 : " + (n1.getGaro() == n2.getGaro()));
		System.out.println("n1 == n2 세로 : " + (n1.getSero() == n2.getSero()));
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
