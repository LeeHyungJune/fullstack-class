package day16;

public class Test07 {
/*
 	재귀 호출 함수(재귀 함수)
 	==>	함수 내부에서 자기 자신을 다시 호출하는 함수
 		주로 반환값 반환부분에서 주로 다시 호출하는 형식을 띈다.
 	
 	주의사항)
 		반드시 호출 종료 지점을 지정해줘야 한다.
 		
 	
 	
 */
	public Test07() {
		System.out.println("1~50 까지의 합 : " + getSum(50));
	}
	
	// 1 ~ N 까지의 합을 구해서 반환해주는 함수
	
	public int getSum(int n) {
		// 재귀함수는 반드시 호출 종료 지점을 기술해야 한다.
		if(n < 1) {
			return 0;
		}
		return n + getSum(n-1);
	}
	public static void main(String[] args) {
		new Test07();
	}

}
