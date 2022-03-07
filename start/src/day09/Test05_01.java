package day09;

/*
 * 		두수를 입력하면 더해서 반환해주는 기능의 함수 
 */

public class Test05_01 {
	public Test05_01() {
		int no1 = getInt();
		int no2 = getInt(1, 10);
		// 계산 
		int result = add(no1, no2);
		toPrint(no1, no2, result);	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test05_01();
		
	}
	// 랜덤하게 정수를 만들어주는 함수
	public int getInt() {
		int no = (int)(Math.random() * 10 + 1);
		return no;
	}
	// 범위를 입력하면 래덤하게 범위 안의 정수를 만들어주는 함수
	public int getInt(int pos1, int pos2) {
		int min = pos1 < pos2 ? pos1 : pos2;
		int max = pos1 < pos2 ? pos2 : pos1;
		int no = (int)(Math.random() * (max - min + 1) + min);
	
		return no;
	}
	
	// 두 수 더해서 반환해주는 함수
	public int add(int no1, int no2) {
		return(no1 + no2);
	}
	
	// 출력해주는 함수
	public void toPrint(int no1, int no2, int result) {
		System.out.println("두 수 " + no1 + " 과 " + no2 + " 의 합은 " + result + " 입니다.");
	}
	public void toPrint(int no1, int no2) {
		System.out.println("두 수 " + no1 + " 과 " + no2 + " 의 합은 " + add(no1, no2) + " 입니다.");
		/*
		 	이 경우
		 	" 의 합은 " 까지 출력하고 함수를 실행하는 것이 아니고
		 	먼저 add() 함수를 호출한 후에
		 	문자열을 만들어서
		 	그 후에 출력하게된다.
		 */
	}
}
