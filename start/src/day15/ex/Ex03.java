package day15.ex;

import java.util.*;

/*
	학생 한명의 정보를 저장할 클래스를 제작하세요
	정보는
		학생이름, 반, 번호, 
		자바, 데이터베이스, 웹, 스프링 점수
		총점, 평균
	를 기억하게 하고
	
	10명의 학생을 TreeSet에 입력하고
	반 순서대로 정렬되도록 하세요.
	반이 같으면 번호순으로 정렬되도록 하세요.
	
 */
public class Ex03 {
	ArrayList name = new ArrayList();
	public Ex03() {
		setName();
		
		TreeSet set = new TreeSet();
//		set.add(name);
		
		for(int i = 0 ; i < 10 ; i++) {
			Object key = name.get(i);
			Student std = new Student((String)key,
					(int)(Math.random() * 10+1),
					(int)(Math.random() * 30+1),
					(int)(Math.random() * 41+60),
					(int)(Math.random() * 41+60),
					(int)(Math.random() * 41+60),
					(int)(Math.random() * 41+60)
					);
			set.add(std);
		}
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
	}
	
	public void setName() {
		name.add("A");
		name.add("B");
		name.add("C");
		name.add("D");
		name.add("E");
		name.add("F");
		name.add("G");
		name.add("H");
		name.add("I");
		name.add("J");
	}
	
	
	
	public static void main(String[] args) {
		new Ex03();
	}

}