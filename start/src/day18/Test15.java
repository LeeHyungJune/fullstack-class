package day18;

public class Test15 {

	public Test15() {
		Jin jin = new Jin();	//	New Born 상태
		jin.start();			//	Runnable 상태
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("\t\t**** 선생님이 졸고 있습니다");
			try {
				Thread.sleep(200);
			} catch(Exception e) {}
		}
		// jin.stop() ; stop9) 함수는 deplecated 되어있는 함수이므로
		// 코드의 실행상 자연스럽게 종료되는 방향으로
		// 스레드 프로그램을 종료시켜본다.
		jin.setStart(false);
	}

	public static void main(String[] args) {
		new Test15();
		System.out.println("프로그램이 종료되었습니다.");
	}

}

class Jin extends Thread {
	private boolean isStart = true;
	
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	@Override
	public void run() {
		int i = 0;
		while(isStart) {
			i += 1;
			System.out.println("서진씨가 복습합니다." + i);
			
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}