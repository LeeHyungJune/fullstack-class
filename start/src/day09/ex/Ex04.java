package day09.ex;

/*
 	Ex04)
 		1차원 배열에 정수 10개를 입력한 후
 		합계와 평균을 구해주는 프로그램을 작성하시오.
 		
 		배열에 정수를 랜덤하게 채워주는 함수
 		합계 계산 함수. 평균 계산 함수
 		출력 함수.
 */

public class Ex04 {
	public Ex04() {
		int[] score = num();
		int sum = plus(score);
		int avg = average(score, sum);
		toPrint(score, sum, avg);
	}
	
	public static void main(String[] args) {
		
		new Ex04();
	}
	public int[] num() {
		int[] score = new int[10];
		for(int i = 0 ; i < score.length; i++) {
		score[i] = (int)(Math.random() * 100);
		}
		return score;
	}
	public int plus(int[] arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public int average(int[] arr, int sum) {
		int avg = sum / arr.length;
		return avg;
	}
	public void toPrint(int[] arr, int sum, int avg) {
		for(int i = 0 ; i < arr.length ; i++) {
		System.out.print(arr[i] + " | ");
		}
		System.out.println();
		System.out.println("배열의 정수의 합은 " + sum + " 이고, 평균은 " + avg + " 입니다.");
	}
}
