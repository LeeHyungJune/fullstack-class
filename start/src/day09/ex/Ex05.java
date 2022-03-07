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
		toPrint(stud, sum, rank);
	}
	public static void main(String[] args) {
		new Ex05();
	}
	public int[][] subj() {
		int stud[][] = new int[10][5];
		int sum = 0;
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0 ; j < stud[i].length - 2 ; j++) {
				int no = (int)(Math.random() * (100 - 80 + 1) + 80);
				stud[i][j] = no;
				stud[i][3] = sum;
				sum += stud[i][j]; 
			}
		}
		return stud;
	}
	public int plus(int[][] arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length - 2 ; j++) {
				arr[i][3] = sum;
				sum += arr[i][j]; 
			}
		}
		return sum;
	}
	public int ranking(int[][] arr, int sum) {
		int rank = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i + 1 ; j < arr[i].length - 2 ; j++) {
				rank = arr[i][4];
				int pre = arr[i][3];
				int post = arr[j][3];
				if(post > pre) {
					arr[i][4] += 1;
				}
			}
		}
		return rank;
	}
	public void toPrint(int[][] arr, int sum, int rank) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length - 2 ; j++) {
//				System.out.print(arr[i][j]);
//				System.out.println(arr[i][4]);
				System.out.println("");
				System.out.println(Arrays.toString(arr[i]));
			}
		}
		System.out.println("");
//		System.out.println("총점 : " + sum);
		
		
	}
}
