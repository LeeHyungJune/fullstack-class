package day07.ex;

/*
 	Ex04)
 		5명의 학생의 이름을 기억할 배열을 만들고
 		각 학생의 시험 성적을 기억할 배열을 만들고
 		결과를 출력하는 프로그램을 작성하시오.
 		
 		출력 ex)
 		
 			둘리 : 80
 			제니 : 90
 			리사 : 85
 			로제 : 95
 			지수 : 100
 			-------------
 			총점 : 000
 			평균 : 00.00
 */

public class Ex04 {

	public static void main(String[] args) {
		String[] blackpink = new String[5];
		blackpink[0] = "제니";
		blackpink[1] = "리사";
		blackpink[2] = "로제";
		blackpink[3] = "지수";
		blackpink[4] = "둘리";
		
		int[] subj = new int[5];
		int result = 0;
		int avg = 0;
		for(int i = 0; i < subj.length ; i++) {
			int no = (int)(Math.random() * (100 - 80 + 1) + 80);
			subj[i] = no;
			result += subj[i];
			avg = result / subj.length;
			System.out.println(blackpink[i] + " : " + subj[i]);
		}
		System.out.println("-------------");
		System.out.println("총점 : " + result);
		System.out.println("평균 : " + avg);
	}

}
