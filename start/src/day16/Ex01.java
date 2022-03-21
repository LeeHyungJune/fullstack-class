package day16;

/*
 	5 ~ 10 사이의 정수를 랜덤하게 발생시켜서
 	그 수 만큼의 학생의 점수를 기억하는
 	HashMap 을 만들어서 데이터를 기억시키고
 	꺼내서 출력하시오
 	데이터를 꺼낼 때 키를 모두 추출해서 꺼내는 방식으로 출력하시오.
 */

import java.util.*;
public class Ex01 {

	public Ex01() {
		
		int n = (int)(Math.random() * 6 + 5);
		HashMap<String, Integer> no = new HashMap<String, Integer>(n);
		
		for(int i = 0 ; i < n ; i++) {
			no.put((String)("A" + i), (int)(Math.random() * 40 + 61));
			
		}
		Set keys = no.keySet();
		for(Object key : keys) {
			Object value = no.get(key);
			System.out.println(key + " : " + value);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
