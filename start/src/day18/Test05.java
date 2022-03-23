package day18;
import java.io.*;

/*
 	1.	버퍼리더라이터를 사용해서 파일 복사
 	2.	PrintWriter 를 이용해서 solo.txt 파일 복사
 */
public class Test05 {

	public Test05() {
		// 타겟(기본) 스트림 준비
		FileReader fr = null;
		FileWriter fw = null;
		// 보조(필터) 스트림 준비
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// PrintWriter
		PrintWriter pw = null;
		
		try {
			// 읽는 쪽 스트림
			// 스트림 연결
			fr = new FileReader("src/day18/result/solo.txt");
			// 필터스트림
			br = new BufferedReader(fr);
			
			/*
			// 쓰는 쪽 스트림
			fw = new FileWriter("src/day18/result/solo_01.txt");
			bw = new BufferedWriter(fw);
			*/
			
			pw = new PrintWriter("src/day18/result/solo_02.txt");
			
			// 몇 번을 반복해야 할지 모르므로
			while(true) {
				String str = br.readLine();
				
				if(str == null) {
					break;
				}
				/*
				bw.write(str + "\r\n");
				// 버퍼가 다 채워지지 않은 경우
				bw.flush();
				*/
				pw.println(str);
				pw.flush();			//	자동으로 flush 가 되겠지만 혹시 몰라서 실행
			}	
			
			System.out.println("@@@ 복사 성공 @@@");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
