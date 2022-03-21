package day16;

/*
 	프로그램에 관련된 정보를 자동으로 뽑아서 구경해보자.
 */
import java.util.*;
import java.io.*;
public class Test10 {

	public Test10() {
		Properties prop = System.getProperties();
		// System.getProperties();
		// ==> 프로그램에 관련도니 정보를 Map 으로 만들어주는 함수
		
		// 키 값들을 모두 꺼내오고
		Enumeration en = prop.keys();	//	Iterator 구버전
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();		//	Object ===> String
			String value = (String)prop.get(key);
			System.out.println(key + " **** " + value);
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
