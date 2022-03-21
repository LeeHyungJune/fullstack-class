package day16;

/*
 	학생들의 과목 점수를 기억하는 HashMap 을 만들고
 	다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하시오
 	과목은
 		국어, 영어, 수학, 과학, 국사
 	의 점수를 기억하도록 하시오.
 */

import java.util.*;
public class Ex02 {
	HashMap Stud = new HashMap();
	public void makeStud(String name) {
		if(!Stud.containsKey(name)) {
			Stud.put(name, new HashMap());
		}
	}
	// 과목 등록
	public void setSub(String std, String subj, int jumsu) {
		makeStud(std);
		HashMap tmp = (HashMap)Stud.get(std);
		tmp.put(subj, jumsu);
	}
	
	// 한 사람의 한 과목 점수
	public void getOne(String std, String subj) {
		HashMap tmp = (HashMap) Stud.get(std);
		int jumsu = (int)tmp.get(subj);
		System.out.println(subj +" : " + jumsu);
		
	}
	
	// 한 학생의 모든 과목 점수
	public void getStud(String std) {
		HashMap tmp = (HashMap)Stud.get(std);
		Set set = tmp.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String key = (String)itor.next();
			int value = (int)tmp.get(key);
			System.out.println(std + " " + key +" : " +value);
		}
		System.out.println();
	}
	
	
	
	
	public Ex02() {
		ArrayList<String> subj = new ArrayList<String>();
		subj.add("국어");
		subj.add("영어");
		subj.add("수학");
		subj.add("과학");
		subj.add("국사");
		
		ArrayList<String> std = new ArrayList<String>();
		std.add("제니");
		std.add("리사");
		std.add("로제");
		std.add("지수");
		std.add("둘리");
		
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
			setSub(std.get(i), subj.get(j), (int)(Math.random() * 40 + 61));
			}
			
//			setSub((char)('A' + i) + "", "eng", (int)(Math.random() * 40 + 61));
//			setSub((char)('A' + i) + "", "math", (int)(Math.random() * 40 + 61));
//			setSub((char)('A' + i) + "", "sci", (int)(Math.random() * 40 + 61));
//			setSub((char)('A' + i) + "", "his", (int)(Math.random() * 40 + 61));
			
//			setSub(String.valueOf(i), "kor", (int)(Math.random() * 40 + 61));
//			setSub(String.valueOf(i), "eng", (int)(Math.random() * 40 + 61));
//			setSub(String.valueOf(i), "math", (int)(Math.random() * 40 + 61));
//			setSub(String.valueOf(i), "sci", (int)(Math.random() * 40 + 61));
//			setSub(String.valueOf(i), "his", (int)(Math.random() * 40 + 61));
		}
		
		
		
//		setSub("A", "kor", (int)(Math.random() * 40 + 61));
//		setSub("A", "eng", (int)(Math.random() * 40 + 61));
//		setSub("A", "math", (int)(Math.random() * 40 + 61));
//		setSub("A", "sci", (int)(Math.random() * 40 + 61));
//		setSub("A", "his", (int)(Math.random() * 40 + 61));
//		
//		setSub("B", "kor", (int)(Math.random() * 40 + 61));
//		setSub("B", "eng", (int)(Math.random() * 40 + 61));
//		setSub("B", "math", (int)(Math.random() * 40 + 61));
//		setSub("B", "sci", (int)(Math.random() * 40 + 61));
//		setSub("B", "his", (int)(Math.random() * 40 + 61));
//		
//		setSub("C", "kor", (int)(Math.random() * 40 + 61));
//		setSub("C", "eng", (int)(Math.random() * 40 + 61));
//		setSub("C", "math", (int)(Math.random() * 40 + 61));
//		setSub("C", "sci", (int)(Math.random() * 40 + 61));
//		setSub("C", "his", (int)(Math.random() * 40 + 61));
//		
//		setSub("D", "kor", (int)(Math.random() * 40 + 61));
//		setSub("D", "eng", (int)(Math.random() * 40 + 61));
//		setSub("D", "math", (int)(Math.random() * 40 + 61));
//		setSub("D", "sci", (int)(Math.random() * 40 + 61));
//		setSub("D", "his", (int)(Math.random() * 40 + 61));
//		
//		setSub("E", "kor", (int)(Math.random() * 40 + 61));
//		setSub("E", "eng", (int)(Math.random() * 40 + 61));
//		setSub("E", "math", (int)(Math.random() * 40 + 61));
//		setSub("E", "sci", (int)(Math.random() * 40 + 61));
//		setSub("E", "his", (int)(Math.random() * 40 + 61));
//		
//		getStud("A");
//		System.out.println("*********************");
//		System.out.println();
//		getStud("B");
//		System.out.println("*********************");
//		System.out.println();
//		getStud("C");
//		System.out.println("*********************");
//		System.out.println();
//		getStud("D");
//		System.out.println("*********************");
//		System.out.println();
//		getStud("E");
//		System.out.println("*********************");
		
		for(int i = 0 ; i < 5; i++) {
			getStud(std.get(i));
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(std.get(i) + " 의 성적");
			System.out.println();
			for(int j = 0 ; j < 5 ; j++) {
				getOne(std.get(i), subj.get(j));
			}
			System.out.println("*********************");
		}
		
	}

	public static void main(String[] args) {
		new Ex02();
		
	}

}

