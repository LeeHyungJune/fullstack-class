package day16;


import java.util.*;

public class Test11 {
/*
 	blackpink 멤버들의 이름을 기억하는 Set 을 만들어서 출력하시오.
 	이때 문자열만 입력되도록 처리하라
 */
	public Test11() {
		HashSet<String> set = new HashSet<String>();
		// 이 Set 은 문자열만 입력받도록 조치해놓은 Set 이다.
		// 따라서 꺼낼때는 꺼낸데이터는 당연히 문자열이 될 것이다.
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		// 향상된 for 명령문 으로 꺼내는 방법
		for(String name : set) {
			System.out.println(name);
		}

		System.out.println("\n#################################################\n");
		
		// but, 제너릭스는 전파되지 않는다.
		ArrayList<String> blackpink = new ArrayList<String>(set);
		
		for(int i = 0 ; i < blackpink.size() ; i++) {
			String name = blackpink.get(i);
			System.out.println(name);
		}
		System.out.println("\n#################################################\n");
		Iterator<String> itor = set.iterator();
		// 출력
		while(itor.hasNext()) {
			String name = itor.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
