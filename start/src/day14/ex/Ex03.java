package day14.ex;
/*
 	Ex03)
 		학생 한 명의 성적을 관리하는 클래스 Student 를 작성하시오,
 		기억할 내용은
 			반, 이름, 국어, 영어, 수학, 총점
 		을 기억하도록 하고
 		필요한 기능(함수)는 필요한 만큼 추가해주시오.
 		단, 학생의 반과 이름이 같으면 같은 학생으로 처리되도록 하시오.
 		학생 변수를 출력하면 모든 내용이 출력되도록 오버라이드 하시오.
 */
public class Ex03 {

	public Ex03() {
		Student s1 = new Student (1, "둘리", 80, 90, 80);
		Student s2 = new Student (1, "둘리", 80, 90, 80);
		
		String str = (s1.equals(s2)) ? "같은" : "다른";
		
		System.out.println("s1 과 s2 학생은 " + str + " 학생입니다");
		System.out.println("s1 :  " + s1);
		System.out.println("s2 :  " + s2);
		
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
