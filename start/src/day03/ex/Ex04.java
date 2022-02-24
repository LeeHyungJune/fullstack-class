package day03.ex;

/*
 	1년은 365.2426 일이다.
 	이것은 과연 몇 일 몇 시간 몇 분 몇초인지 계산하고 출력하세요.
 	
 	힌트)
 		365.2426일은 단위가 일 단위이다.
 		하루는 24시간이다
 		따라서 0.5일은 12시간을 의미한다.
 		1시간은 60분이다
 		1분은 60초이다
 */

import java.util.*;

public class Ex04 {
	public static void main(String[] args) {
//		System.out.println("1년은 " + 365 + "일 " + 5 + "시간 " + 49 + "분 " + 20 + "초 입니다.");
//		
//		double year = 365.2426; // 일년 실수형
//		int day;				// 일 정수형 표현
//		int hour;				// 시간 정수형
//		int min;				// 분 정수형
//		double sec;				// 초 실수형
//		
//		day = (int)year;		// 0.2426을 year 에서 빼면 일
//		hour = (int)((year - day) * 24); // .2426에서 24를 곱해 시간 단위로 변형
//		min = (int)((((year - day) * 24) - hour) * 60); // (전체(실수) - 일(정수) - 시간(정수)) * 60을 곱해 분 단위로 변형  
//		sec = (double)((((((year - day) * 24) - hour) * 60) - min) * 60); // ((전체(실수) - 일(정수) - 시간(정수) - 분(정수)) * 60 해서 초 단위로 변형
//
//		System.out.println("1년은 " + day + "일 " + hour + "시간 " + min + "분 " + sec + "초 입니다."); // 결과 출력
		
		double total = 20960.64;
		int tmp = (int)total;
		int min = (int)total / 60;
		
		
		
	}
}
