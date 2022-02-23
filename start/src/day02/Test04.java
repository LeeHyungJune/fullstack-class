package day02;

/**
 * 자신의 정보를 기억하고 출력하는 기능의 클래스 
 * @author	이형준
 * @since	2022.02.23
 * @version	v.1.0
 *
 */
public class Test04 {
	/*
	 	자신의 이름, 나이, 이름 첫 문자, 키 를 변수에 기억시키고 출력하세요
	 */
	public static void main(String[] args) {
		// 이름 = name, 나이 = age, 이름 첫 문자 first_initial, 키 = heght.
		String name = "이형준";
		int age = 26;
		char first_initial = '이';
		double height = 178.; // 숫자 뒤에 .을 붙여주는 것으로 실수가 된다. ex) 178.
		
		// 데이터는 남으면 상관없지만 넘치면 데이터의 변형이 올 수 있으므로 주의해야 한다.
		// System.out.println("'가' > '나' : " + ('가' > '나'));
		// 내용 출력	
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이름 첫 문자 : " + first_initial);
		System.out.println("키 : " + height);
		
		//		System.out.println("안녕하세요. 제 이름은 " + name + "이고, "
		//				+ "제 나이는 " + age + "살이며, "
		//						+ "제 성 씨는 " + first_initial + "씨 입니다.");
	}
}
