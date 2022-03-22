package day17;

import java.io.*;

/*
 	doc 폴더 안의 파일의 목록을 알아내보자.
 */
public class Test05 {

	public Test05() {
		// 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File dir = new File("doc");
		
		/*
		// 목록을 꺼내보자.
		String[] flist = dir.list();
		
		// 출력
		for(String f : flist) {
			System.out.println(f);
		}
		*/
		
		// 파일 정보도 꺼내보자
		File[] infoList = dir.listFiles();	//	파일 객체 형태로 변환
		
		// 정보 출력
		for(File f : infoList) {
			String fName = f.getName();		//	파일 이름 꺼내는 함수
			long len = f.length();			//	파일 사이즈 추출해주는 함수
			String folder = f.getParent();	// 	상위 폴더 이름 꺼내주는 함수
			
			// 출력
			System.out.println("상위 폴더 : " + folder + " , 파일 이름 : " + fName + " , 사이즈 : " + len + " byte");
		}
		
		// 확장자가 jpg인 파일만 골라서 출력하고 싶다.
		String[] flist = dir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				/*
				 	이 함수는 자동 호출 함수.
				 	목록을 구하는 파일을 하나씩 발견할 때마다 이 함수가 호출된다
				 	이 함수에서 true 를 반환하면 해당 목록을 결과에 포함시키고
				 				false 를 반환하면 해당 목록을 결과에 포함시키지 않는다.
				 	따라서 포함될 파일들을 여기서 정의해주면 된다.
				 	
				 	매개 변수 )
				 		File dir		:	현재 파일의 정보를 알려주고
				 		String name		:	현재 파일의 이름만 알려준다.
				 		
				 */
				/*
				boolean bool = false;
				
				if(name.endsWith("jpg")) {	// 파일 이름이 jpg 로 끝나니???
					// 이 경우는 결과 목록에 이 파일을 포함시킨다.
					bool = true;
				}else {
					bool = false;
				}
				bool 의 초기값이 false 이므로 생략해도 무방.
				
				return bool;
				*/
				return name.endsWith("jpg");
				// ==> 이 경우처럼 상속받아 오버라이드해야 하는 함수의 내용이 극도로 짧은 경우는
				// 		이 예제처럼 무명내부클래스로 처리하는 것이 일반적이다.
			}
		});
		
		for(String f : flist) {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
