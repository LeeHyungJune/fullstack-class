package day09.ex;

import java.util.Arrays;

/*
 	Ex05)
 		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
 		총점과 석차를 구하는 프로그램을 작성하시오.
 		
 		각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리.
 */

public class Ex05 {
	public Ex05() {
		int[][] stud = subj();
		int sum = plus(stud);
		int rank = ranking(stud, sum);
		toPrint(stud, sum);
	}
	public static void main(String[] args) {
		new Ex05();
	}
	// 10명 학생의 3과목 랜덤 점수 입력
	public int[][] subj() {
		int stud[][] = new int[10][5];
//		int sum = 0;
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0 ; j < stud[i].length - 2 ; j++) {
				int no = (int)(Math.random() * (100 - 80 + 1) + 80);
				stud[i][j] = no;
//				stud[i][3] = sum;
//				sum += stud[i][j]; 
			}
		}
		return stud;
	}
	// arr[i][3] 에 각 과목 점수의 합 넣기
	public int plus(int[][] arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length - 2 ; j++) {
				arr[i][arr[i].length - 2] += arr[i][j];
				sum = arr[i][arr[i].length - 2];
			}
		}
		return sum;
	}
	// arr[i][4]에 순위 넣기
	public int ranking(int[][] arr, int sum) {
		int rank = 1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i][4] = 1;
			for(int j = 0 ; j < arr.length ; j++) {
				
				if(arr[i][3] < arr[j][3]) {
					arr[i][4] += 1;
				}
			}
		}
		return rank;
	}
	// 출력
	public void toPrint(int[][] arr, int sum) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length - 2 ; j++) {
//				System.out.print(arr[i][j]);
//				System.out.println(arr[i][4]);
//				System.out.println("");		
			}
			System.out.println(Arrays.toString(arr[i]));
//			System.out.println("총점 : " + arr[i][3]);
//			System.out.println("순위 : " + arr[i][4]);
		}
//		System.out.println("");
//		System.out.println("총점 : " + sum);

		
	}
}
