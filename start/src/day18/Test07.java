package day18;

import java.io.*;

/*
 	Test06 에서 저장한 jennie.txt 파일을 읽어보자
 	
 	ObjectOutputStream 으로 저장한 (내보낸) 파일은
 	반드시 ObjectInputStream 으로 읽어야 한다
 */
public class Test07 {

	public Test07() {
		// 기본 스트림
		FileInputStream fin = null;
		// 보조 스트림
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream("src/day18/result/jennie.txt");
			
			oin = new ObjectInputStream(fin);
			Friend jny = (Friend)oin.readObject();
			String name = jny.getName();
			String tel = jny.getTel();
			String mail = jny.getMail();
			String addr = jny.getAddr();
			String blood = jny.getBlood();
			int age = jny.getAge();
			float height = jny.getHeight();
			char gen = jny.getGen();
			boolean rh = jny.isRh();	//	 boolean 은 get 이 아닌 is 로 쓴다.
			
			// 출력
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + name);
			System.out.println("RH : " + ((rh)? "+":"-"));
			
			System.out.println(jny);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
