package day17;

import java.io.*;

/*
 	블랙핑크 휘파랑을 파일에 저장해보자.
 */
public class Test11 {

	public Test11() {
		// 스트림 준비
		// PrintStream 을 사용해보자
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day17/result/솔로.txt");
			// 직접 파일에 연결된 스트림을 만드는 보조스트림이다.
			
			// 내용을 써준다.
			ps.println("\t\t\t솔로");
			ps.println("\t\t\t\t제니");
			ps.println("천진난만 청순가련");
			ps.println("새침한 척 이젠 지쳐 나");
			ps.println("귀찮아");
			ps.println("매일 뭐 해? 어디야? 밥은? 잘 자");
			ps.println("Baby 자기 여보 보고 싶어");
			ps.println("다 부질없어");
			ps.println("You got me like (oh, oh, oh)");
			ps.println("이건 아무 감동 없는 love story");
			ps.println("(Oh, oh, oh) 어떤 설렘도 어떤 의미도");
			ps.println("(Oh, oh, oh) 네겐 미안하지만 I'm not sorry");
			ps.println("(Oh, oh, oh) 오늘부터 난 난 난");
			ps.println("빛이 나는 솔로");
			ps.println("빛이 나는 솔로");
			ps.println("I'm goin' solo-lo-lo-lo-lo-lo-lo");
			ps.println("I'm goin' solo-lo-lo-lo-lo-lo-lo");
			ps.println("Used to be your girl, but nevermind that used to");
			ps.println("Let me shine, gettin' mine, I hit you with that ddu-ddu");
			ps.println("Got a lot of whatever I want, like I could lose two");
			ps.println("Wanna find me? I be in Paris a lot, that's beaucoup");
			ps.println("Too cool, ooh, four-finger ring, pink on it");
			ps.println("Chain all ice like I could pour this drink on it");
			ps.println("Been gone and came back, comin' for the payback");
			ps.println("Asked them how you like it and it's lookin' like they hate that");
			ps.println("W, no L's, covered W and Elle, and it's none left on the shelf");
			ps.println("Get in trouble by myself, solo, oh well");
			ps.println("All me, cross seas, Coco Chanel");
			ps.println("Palm trees, calm breeze, living in a dollhouse");
			ps.println("I don't need a Ken, I can watch him walk out");
			ps.println("Solo, but I got many I could thank");
			ps.println("You could see it in my eyes, like every time I blink");
			
			ps.flush();
			/*
			 	내부적으로 Buffered 의 기능을 가지고 있으므로 
			 	반드시 내보내기가 끝나면 버퍼를 지워줘야 한다.
			 */
			
			System.out.println("*** 솔로 저장 성공 ***");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
