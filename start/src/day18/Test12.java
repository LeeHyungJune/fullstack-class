package day18;

public class Test12 {

	public Test12() {
		Jennie jn = new Jennie();
		Lisa li	= new Lisa();
		// New Born 상태
		
		// Runnable 상태로 전위
		jn.start();
		li.start();
	}

	public static void main(String[] args) {
		new Test12();
	}	

}

class Jennie extends Thread {
	@Override
	public void run() {
		for(int i = 0; i<1000 ; i++) {
			System.out.println("Jennie 가 "+ (i+1) + " 번째 노래를 합니다." );
			/*
			 	한 곡을 노래했으니
			 	다른 프로그램에 양보하세요
			 	즉, Runnable 상태로 전위하세요.
			 */
			yield();
		}
	}
}

class Lisa extends	Thread {
	@Override
	public void run() {
		for(int i = 0; i<1000 ; i++) {
			System.out.println("\t\t\tLisa 가 "+ (i+1) + " 번째 노래를 합니다." );
			yield();
		}
	}
}