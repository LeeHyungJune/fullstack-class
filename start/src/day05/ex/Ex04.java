package day05.ex;

/*
 	Ex04)
 	
 		전기요금을 계산해주는 프로그램을 작성하세요
 		
 		전기요금표
 		
 					코드		기본요금		사용요금
 		가정용		1			3800			245
 		산업용		2			2400			157
 		교육용		3			2900			169
 		상업용		4			3200			174
 		
 		전기요금은
 			기본요금 + 사용량 * 사용요금
 			
 		사용자 코드와 사용량을 입력하면
 		전기요금을 계산해서 출력해주는 프로그램을 작성하세요
 */

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("사용자 코드 : ");
		int code = sc.nextInt();
//		System.out.println();
		System.out.print("사용량 : ");
		int use = sc.nextInt();
		// 코드
		int[] num1 = {1, 3800, 245};
		int[] num2 = {2, 2400, 157};
		int[] num3 = {3, 2900, 169};
		int[] num4 = {4, 3200, 174};
		int result = 0;
		if(code == 1) {
			result = num1[1] + num1[2] * use;
		} else if (code == 2) {
			result = num2[1] + num2[2] * use;
		} else if (code == 3) {
			result = num3[1] + num3[2] * use;
		} else if (code == 4) {
			result = num4[1] + num4[2] * use;
		} else {
			System.out.print("코드를 잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		System.out.println("전기 요금은 " + result + "입니다.");
//		result = num1[1] + num1[2] * 50; 
//		System.out.println(result);
//		
		}
	
	}

