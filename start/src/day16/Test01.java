package day16;

import java.util.*;

/*
 	Set 계열 특징
 		1.	입력 순서를 보장하지 않는다. why? 자기 나름대로 정렬위치를 가지고 있기 때문에
 		
 		2.	중복 데이터 입력을 허용하지 않는다.
 */

public class Test01 {
/*
 	Nemo 클래스를 만들고 가로가 같은 네모면 같은 네모로 처리되도록 하시오.
 */
	public Test01() {
		Nemo n1 = new Nemo(5, 3);
		Nemo n2 = new Nemo(5, 5);
		Nemo n3 = new Nemo(5, 6);
		Nemo n4 = new Nemo(5, 7);
		
		// HashSet 을 만들다.
		HashSet set = new HashSet();
		
		// 위에 만든 네모 두 개를 넣어둔다.
		set.add(n1);
		set.add(n2);
		set.add(n3);
		set.add(n4);
		
		for(Object o : new ArrayList(set)) {
			System.out.println(o);	
			// 출력이 목적이라면 최종적으로 오버라이드 된 Nemo의 toString() 가 호출되므로 강제 형 변환은 필요하지 않다.
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}
	 
}
