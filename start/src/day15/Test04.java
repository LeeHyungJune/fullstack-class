package day15;

/*
 	특정 문자열에서
 	원하는 규칙에 맞는 부분만 추출해서 출력하시오.
 	
 */

import java.util.regex.*;

public class Test04 {

	public Test04() {
		String tel = "HP : 010-1234-5678";
		// 위 전화번호에서 실제 번호만 추출해서 출력하고 싶다.
		// 방법
		// 1. 패턴을 만든다.
		Pattern form = Pattern.compile("01[0-9]-\\d{3,4}-\\d{4}");
		// 2. 검사한다
		Matcher mat = form.matcher(tel);
		// 3. 검사 결과에서 형식에 맞는 부분을 꺼내온다.
		//		사용하는 함수 : find() 	==> 규칙에 맞는 부분이 있는지 확인해주는 함수. 반환값은 true or false
		//						group() ==> 규칙에 맞는 부분을 반환해주는 함수
		if(mat.find()) {
			String hp = mat.group();
			// 출력
			System.out.println("전화번호 : " + hp);
		}
		/*
		 	asdfhg거ㅏ농하!@#$% 중 찾는 거. 내가 기준에 맞춘 것을 찾는 것.
		 */
		
//		boolean bool = mat.matches(); 
	}

	public static void main(String[] args) {
		new Test04();
	}

}
