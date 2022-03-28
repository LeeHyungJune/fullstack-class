package ping;
import java.util.*;

public class Exec01 {

	public Exec01() {
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		
		PingServer02 t1 = new PingServer02();
		
		System.out.println("*** 핑서버 프로그램을 시작합니다. ***\n서버기동 : start\n서버중단 : quit\n명령을 입력하세요.");
		String str = sc.nextLine();
		while(bool) {
			switch(str) {
			case "start":
				if(!t1.isAlive()) {
					t1.start();
				}
				break;
			case "quit":
				bool = false;
				t1.setStart(false);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Exec01();
	}

}
