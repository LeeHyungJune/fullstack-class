package day16;

import java.util.*;

public class Test05 {

	public Test05() {
		TreeMap map = new TreeMap();
		// map 에 이름을 키값으로 하고 나이를 데이터로 입력하자.
		//	a < ab, aA > a	why? 문자가 많기 때문에
		map.put("제니", 27);
		map.put("리사", 28);
		map.put("로제", 26);
		map.put("지수", 27);
		
		// 출력
		Set keys = map.keySet();
		for(Object key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		// 이름 기준으로 내림차순 정렬해서 맵에 넣어보자.
		TreeMap map1 = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String name1 = (String) o1;
				String name2 = (String) o2;
				
				int result = name1.compareTo(name2);
				
				return -result;
			}
			
			
		});
		map1.put("제니", 27);
		map1.put("리사", 28);
		map1.put("로제", 26);
		map1.put("지수", 27);
		
		// 출력
		Set keys1 = map1.keySet();
		
		System.out.println("********************************************");
		for(Object key : keys1) {
			System.out.println(key + " : " + map1.get(key));
		}
		System.out.println("********************************************");
		// Map.Entry 로 꺼내서 처리하는 방법
		Set set = map1.entrySet();	// 추가된 데이터 갯수만큼 Map.Entry 를 만들어서 Set 에 추가해서 반환해준다.
		Iterator itor = set.iterator(); //	Set 을 순차적으로 꺼낼 목적으로 Iterator 로 변환시켜놓았다
		while(itor.hasNext()) {	//	버퍼메모리에 사라지는 거 주의
			Object obj = itor.next();
			Object key = ((Map.Entry)obj).getKey();
			Object value = ((Map.Entry)obj).getValue();
			
			String name = (String) key;
			int age = (int) value;
			// 출력
			System.out.println(name + " : " + age);
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
