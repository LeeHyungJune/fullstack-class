package day04.ex;

/*
 	문제 2-1)
 		1. 알파벳을 입력받아서
 			그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성하시오.
 			
 		2. 숫자 또는 알파벳을 입력받아서
 		그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex0201 {
	public static void main(String[] args) {
		// 할일
		// 입력 도구
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.println("입력 받은 문자 : ");
//		System.out.println("입력 받은 숫자 : ");
		// 문자형으로 기억
		String str = sc.nextLine();
//		int a = sc.nextInt();
		// 비교를 위한 변환
		int ch = str.charAt(0);
		// 판별
		String result = (ch >= '0' & ch <= '9') ? ("숫자") : (ch > 9 & ch < 'A') ? ("특수문자") : (
				ch >= 'A' & ch <= 'Z') ? ("대문자") : (
						ch > 'Z' & ch < 'a') ? ("특수문자") : ((ch >= 'a' & ch <= 'z') ? ("소문자") : ("특수문자"));
		// 출력
		System.out.println("결과는 " + result);
	}
}
