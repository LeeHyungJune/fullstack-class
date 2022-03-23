package day18;


import java.io.*;

/*
 	result 폴더에 있는 solo.txt 파일을 읽어보자
 */

public class Test02 {

	public Test02() {
		// 타겟(기본) 스트림 준비
		FileReader fr = null;
		try {
			// 파일에 스트림 연결
			fr = new FileReader("src/day18/result/solo.txt");
			
			/*
			// 1. 한 글자만
			int ch = fr.read();		//	char ch = (char) fr.read();
			// 출력
			System.out.println("읽은 문자 : " + (char)ch);
			*/
			
			/*
			// 2. 여러글자 읽기
			char[] buff = new char[1024];
			int len = fr.read(buff);	// 읽은 데이터를 입력한 배열에 채워준다. 반환값은 읽은 문자의 갯수...
			
			// 읽은 데이터를 문자열로 변환...
			String str = new String(buff, 0, len);
			// 출력
			System.out.println("읽은 문자열\n" + str);
			*/
			
			// 3. 문서 전체를 읽어보자
			// 문자 배열준비
			char[] buff = new char[1024];
			while(true) {
				int len = fr.read(buff);
				if(len == -1) {
					// 읽어온 문자가 없는 경우
					break;
				}
				
				// 이 행을 실행하는 경우는 읽어온 문자가 있다는 뜻
				
				String str = new String(buff, 0, len);
				
				// 출력
				System.out.print(str);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
