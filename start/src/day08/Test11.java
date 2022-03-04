package day08;

/*
 		3명의 학생의
 		java, db, web, jsp, spring 점수를 기억할 배열을 만들고
 		각 과목의 점수를 랜덤하게 만들어서 입력하고
 		결과를 출력하는 프로그램을 작성하세요.
 */

public class Test11 {

	public static void main(String[] args) {
		int[][] stud = new int[3][5]; // 3명의 학생의 5과목 점수 배열
		
//		for(int i = 0 ; i < stud.length ; i++) {	// 학생 선택 반복문
//			for(int j = 0; j < stud[i].length ; j ++) { // 선택된 학생의 과목을 선택하는 반복문
//				System.out.print(stud[i][j] + " | ");				
//			}
//		}
//		System.out.println();
		
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0; j < stud[i].length; j++) {
				stud[i][j] = (int)(Math.random() * (100 - 80 + 1) +80);
				
			}
		}
		// 출력
		System.out.println();
		System.out.println("#############################");
		for(int i = 0 ; i < stud.length ; i++) {	// 학생 선택 반복문
			for(int j = 0; j < stud[i].length ; j ++) { // 선택된 학생의 과목을 선택하는 반복문
				System.out.print(stud[i][j] + " | ");				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("#############################");
		// 총점 구하기
		// 총점을 관리할 배열
		int[] total = new int[3];
		for(int i = 0 ; i < stud.length ; i++) {
			
			for(int j = 0 ; j < stud[i].length ; j++) {
				total[i] += stud[i][j];
			}
		}
		// 출력
		for(int t : total) {
			System.out.println("### : " + t);
		}
	}

}
