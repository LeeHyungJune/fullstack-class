package day09;

/*
 	두 수를 입력하면 더해서 반환해주는 기능의 함수를 만들어서 실행하시오
 */

import java.util.*;

public class Test05 {
	public Test05() {
		Scanner sc = new Scanner(System.in);
		int[] num = getInt(sc);
		int result = sum(num);
		toPrint(num, result);
		sc.close();
		
	}
	public static void main(String[] args) {
		
		new Test05();
	}
	// 정수 입력하는 함수
	public int[] getInt(Scanner sc) {
		int[] num = new int[2];
		// 정수 입력
		System.out.print("첫 번재 정수 : ");
		int no1 = sc.nextInt();
		System.out.print("두 번재 정수 : ");
		int no2 = sc.nextInt();
		num[0] = no1;
		num[1] = no2;
		return num;
	}
	// 정수를 더해주는 함수
	public int sum(int[] arr) {
		int result = 0;
		int no1 = arr[0];
		int no2 = arr[1];
		result = arr[0] + arr[1];
		return result;
	}
	 // 내용 출력
	public void toPrint(int[] arr, int result) {
		System.out.println("두 수 " +arr[0] + " 과 " + arr[1] + " 의 합은 " + result + " 입니다.");
	}
	public void toPrint(int no1, int no2, int result) {
		System.out.println("두 수 " + no1 + " 과 " + no2 + " 의 합은 " + result + " 입니다.");
		
	}
	
}
