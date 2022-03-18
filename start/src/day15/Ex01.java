package day15;
/*
 	Ex01 )
 		아이디를 입력받아서
 		입력받은 아이디가 유효한 아이디인지 아닌지를 판별해주는 프로그램을 작성하시오.
 		
 		아이디는
 			첫 글자는 영문대문자로 시작하고
 			두번째부터는 영문숫자를 사용할 수 있다.
 			글자수는 5글자 이상이어야 한다.
 			 
 */
import java.util.*;
import java.util.regex.*;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.nextLine();
		
		Pattern ido = Pattern.compile("[A-Z][a-zA-Z0-9]{4,}");
		
		Matcher mat = ido.matcher(id);
		
		boolean bool = mat.matches();
		
		String str = bool ? "유효한" : "유효하지 않은";
		
		System.out.println("입력된 id [ " + id + " ] 는 " + str + " 아이디입니다.");
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
