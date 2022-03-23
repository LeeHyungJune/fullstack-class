package day18;

import java.io.*;


public class Test01 {
	/*
	 	char 단위로 파일에 데이터를 저장하는 프로그램을 작성하시오.
	 */
	public Test01() {
		// 타겟스트림(기본스트림) 준비
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/day18/result/솔로.txt");
			
			/*
			// 1. 한 글자(2byte)만
			char ch = '솔';
			fw.write(ch);
			System.out.println("### 저장 성공 ###");
			*/
			
			
			// 2. 여러 글자 저장
			String str = "\t\t\t솔로\r\n\t\t\t\t제니";
			// 여기서는 문자단위로 처리를 해야하므로
			// 문자배열을 준비한다.
			// 문자열을 문자배열로 변환시켜주는 함수	:	toCharArray()
//			char[] buff = str.toCharArray();
//			fw.write(buff);
			
			
			fw.write(str);
			
			System.out.println("### 저장 성공 ###");
			
			
			/*
			 	참고 )
			 		char 단위는 텍스트 데이터만 처리하도록 되어있기 때문에
			 		기본 함수에 문자처리기능이 추가되었다.
			 */
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
