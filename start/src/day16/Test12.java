package day16;

/*
 	학생들의 점수를 기억하는 Map 을 만드시오.
 	
 */

import java.util.*;

public class Test12{

	public Test12() {
		HashMap<String, Integer> student = new HashMap<String, Integer>();
		
		student.put("제니", 95);
		student.put("리사", 80);
		student.put("로제", 90);
		student.put("지수", 85);
		
		// 키값만 꺼낼 경우
		Set<String> set = student.keySet();
		
		// 키와 데이터 동시에 꺼내보자.
		Set<Map.Entry<String, Integer>> entry = student.entrySet();
		
		// Iterator 로 변환
		Iterator<Map.Entry<String, Integer>> itor = entry.iterator();
		while(itor.hasNext()) {
			Map.Entry<String, Integer> stud = itor.next();
			String key = stud.getKey();
			int value = stud.getValue();	// 자동 UnBoxxing
			
			// 출력
			System.out.println(key + " : " + value);
		}
	}
	// ArrayList 를 사용해서 Entry 의 value 값을 뽑아서 copareTo로 비교
		

	public static void main(String[] args) {
		new Test12();
	}

}
