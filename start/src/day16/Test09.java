package day16;

import java.util.*;
import java.io.*;

public class Test09 {

	public Test09() {
		Properties prop = new Properties();
		prop.put("name", "홍길동");
		prop.put("age", "16");
		prop.put("tel", "010-1111-1111");
		prop.put("addr", "율도국");
		
		// 이렇게 Map 처럼 작업을 하다가
		// 보관해야할 필요가 생기면 이 데이털를 모두 파일에 기록한다.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day16/result.txt");
			// 데이터를 흘려보낸다
			prop.store(fout, "홍길동정보");
			// 이 작업이 문제없이 완료되면 이미 파일에 저장되어 있는 상태가 된다.
			System.out.println("***파일 저장 완료***");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {	
			try {
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
