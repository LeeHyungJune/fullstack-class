package day13;

public class Test12 {

	public Test12() {
		String sno = "12삼";
	
		int no = 0;
		no = Integer.parseInt(sno);
		
		/*
		 	sno 를 정수로 변환하는데 예외가 발생하면
		 	-999 로 변환하시오
		 */
		try {
		 	no = Integer.parseInt(sno);
		} catch (Exception e) {
			e.printStackTrace();
			no = -999;
		}
		
	
	}
	
	public static void main(String[] args) {
		new Test12();
	}

}
