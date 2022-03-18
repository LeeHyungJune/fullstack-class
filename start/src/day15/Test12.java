package day15;

import java.util.*;

public class Test12 {
/*
 	블랙 핑크 멤버를 HashSet 에 저장한 후 꺼내서 출력하시오.
 */
	public Test12() {
		HashSet set = new HashSet();
		
		// 데이터 추가
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		// 입력된 갯수 꺼내오고
		int len = set.size();
		System.out.println("채워진 멤버 수 : " + len);
		
		/*
		 	Set 계열 컬렉션은 데이터를 꺼내는 함수가 존재하지 않는다.
		 	따라서 꺼내서 사용해야 할 경우에는
		 		1.	Iterator 로 변환 후 꺼내서 사용
		 		2.	List 계열로 변환해서 꺼내서 사용
		 */
		System.out.println("1. Iterator 를 이용한 방법");
		// 1. Iterator 로 변환해서 사용하는 방법
		Iterator itor = set.iterator();
		/*
		 	Iterator 는 StringTokenizer 와 유사하게
		 	하나씩 순차적으로 꺼내야 하고
		 	꺼낸 순간 꺼낸 데이터는 사라지게 된다.
		 */
		while(itor.hasNext()) {
			// hasNext()	:	꺼낼 데이터가 남아있는지 알려주는 함수. 반환값은 boolean 데이터.
			
			// 데이터 꺼내기.
			String name = (String)itor.next();	//	next() : 데이터를 꺼내는 함수
			
			// 출력
			System.out.println(name);
		}
		// 2. List 로 변환해서 꺼내는 방법
		System.out.println("2. List 계열로 변환해서 사용하는 방법");
		Vector vec = new Vector(set);	//	Set 에 저장된 데이터로 Vector 를 만든다.
		for(int i = 0 ; i < vec.size() ; i++) {
			String name = (String) vec.get(i);
			// 출력
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
